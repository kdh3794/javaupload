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
        String query = "select count(*) as total from auth";
        
        try {
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query); // PreparedStatement <---heidsql에서 파란 화살표 같은
                                                                            // 기능.
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
        
        int result = -1;
        try {
            // SQL 문장
            String query = " select max(authid) from auth";
            // 문장 객체 생성
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // 문장 객체 실행 : executeQuery() or executeUpdate();
            ResultSet rs = stmt.executeQuery();
            
            //커서를 첫번째 row로 이동
            rs.first();
            result = rs.getInt("authid");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        
        return result;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ResultSet selectLike(ModelAuth auth) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int insertauth(ModelAuth auth) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int updateauth(ModelAuth whereauth, ModelAuth setauth)
            throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int deleteauth(ModelAuth auth) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
