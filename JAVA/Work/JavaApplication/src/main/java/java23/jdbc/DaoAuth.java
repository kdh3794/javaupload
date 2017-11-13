package java23.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoAuth implements IAuth {
    
    private java.sql.Connection conn = null;
    
    // 생성자
    public DaoAuth(Connection conn) {
        super();
        this.conn = conn;
    } // Select count(*) from book; 을 실행하기 위한 메소드.
    
    @Override
    public int getCount(ModelAuth auth) throws SQLException {
        
        int result = -1;
        // SQL 문장
        String query = " select count(*) as total from auth ";// 쿼리 "" 앞 뒤로 스페이스 하나씩 넣어줘야함. 그게 편하다고 함. 왜그런지는 모름.
        
        try {
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query); // PreparedStatement <---heidsql에서 파란 화살표
                                                                            // 같은기능.
            
            // 문장 객체 실행 : executeQuery() or executeUpdate();
            java.sql.ResultSet rs = stmt.executeQuery(); // sql문장을 실행하고 결과로 resultset을 반환한다.
            
            // 값을 빼기.
            
            rs.next(); // 커서이동.
            result = rs.getInt("total"); // total 컬럼의 값을 가져온다.,rs.getInt(0);
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return result;
        
    }
    
    @Override
    public int getMaxAuthid() throws SQLException {
        
        int result = -1; // 값을 초기화하는거.
        try {
            // SQL 문장
            String query = " select max(authid) authid from auth ";
            // 문장 객체 생성
            PreparedStatement stmt = this.conn.prepareStatement(query);
            
            // 문장 객체 실행 : executeQuery() or executeUpdate();
            ResultSet rs = stmt.executeQuery();
            
            // 커서를 첫번째 row로 이동
            rs.first();
            
            // 값을 추출
            result = rs.getInt("authid");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        
        return result;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        
        ResultSet rs = null;
        try {
            // SQL 문장
            String query = " select * from auth ";
            
            // 문장 객체 생성
            PreparedStatement stmt = this.conn.prepareStatement(query);
            
            // 문장 객체 실행 : executeQuery() or executeUpdate()
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelAuth auth) throws SQLException {
        
        ResultSet rs = null;
        try {
            
            // sql 문장
            // 찾고자 하는 값은 ?로 바꾼다. 여러가지 값이 들어 갈 수 있기 ㄸㅐ문에.
            String query = " select * from auth where name like ? ";
            
            // 문장 객체 생성
            PreparedStatement stmt = this.conn.prepareStatement(query);
            
            // 물음표 자리에 값을 넣는다.
            // auth.getName()의 의미는 b이다. 앞 뒤로 %를 넣어줘야 하므로 추가.
            stmt.setString(1, "%" + auth.getName() + "%");
            // 문장 객체 실행 : executeQuery() or executeUpdate()
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        
        ResultSet rs = null;
        
        try {
            String query = " select * from book where name = ? "; // 작은 따옴표도 값이므로 ?만 넣어줘야 함.
            
            // 문장 객체 생성.
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, auth.getName()); // b말고 다른거.
            
            rs = stmt.executeQuery();
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException {
        ResultSet result = null;
        try {
            String query = "select * from auth \n";
            query += "where 1 = 1\n ";
            if (auth.getAuthid() != null)
                query += "and authid = ? \n";
            if (!auth.getName().isEmpty())
                query += "and name = ?\n";
            
            // 문장 객체 생성
            PreparedStatement stmt = conn.prepareStatement(query);
            
            int c = 1;
            if (auth.getAuthid() != null)
                stmt.setInt(c++, auth.getAuthid());
            if (!auth.getName().isEmpty())
                stmt.setString(c++, auth.getName());
            
            result = stmt.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        
        return result;
        
    }
    
    @Override
    public int insertAuth(ModelAuth auth) throws SQLException {
        int rs = -1; // 값을 초기화해줄때는 -1로 해준다. 이유는 모름. 설명해주셨는데 헷갈림.
        
        try {
            String query = "  ";
            query += " INSERT INTO AUTH( AUTHID, NAME, BIRTH) \n ";
            query += " VALUES ( ?, ?, ?) \n ";
            PreparedStatement stmt = this.conn.prepareStatement(query);
            
            // ?자리에 값넣기.
            stmt.setInt(1, auth.getAuthid());
            stmt.setString(2, auth.getName());
            stmt.setString(3, auth.getBirth());
            
            rs = stmt.executeUpdate();
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public int updateAuth(ModelAuth whereauth, ModelAuth setauth)
            throws SQLException {
        int rs = -1;
        try {
            
            // query 작성 :" 4가지 모두 가능하게
            // select * from auth where 1=1 <==> select * from auth
            // select * from auth where 1=1 and authid = 1
            // select * from auth where 1=1 and name = ''
            // select * from auth where 1=1 and authid = 1 and name =''
            String query = " ";
            query += " update auth ";
            query += " set name = ? \n ";
            query += "  , birth = ? \n ";
            query += " where 1=1 \n ";
            query += " and authid =? \n ";
            
            PreparedStatement stmt = this.conn.prepareStatement(query);
            
            // ? 자리에 값 넣기
            stmt.setString(1, setauth.getName());
            stmt.setString(2, setauth.getBirth());
            stmt.setInt(3, whereauth.getAuthid());
            
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public int deleteAuth(ModelAuth auth) throws SQLException {
        int rs = 0;
        try {
            /*
             * delete from auth where 1=1 and name = 'kim' and birth = '1980.05.01'
             */
            
            String query = " ";
            query += " delete from auth \n";// \n 이 없는 경우는 한칸 띄워줘야함. 안 그러면 붙어서 나옴.
            query += " where 1 = 1 \n";
            query += " and name = ? \n";
            query += " and birth = ? \n";
            
            // 문장 객체에 값 넣기
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // ? 자리에 값 넣기
            stmt.setString(1, auth.getName());
            stmt.setString(2, auth.getBirth());
            
            rs = stmt.executeUpdate();
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
}
