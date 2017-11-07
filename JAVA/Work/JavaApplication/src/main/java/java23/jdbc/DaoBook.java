package java23.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoBook implements IBook {
    private java.sql.Connection conn = null;
    
    public DaoBook(Connection conn) {
        super();
        this.conn = conn;
    } // Select count(*) from book; 을 실행하기 위한 메소드.
    
    @Override
    public int getCount(ModelBook book) throws java.sql.SQLException {
        int result = -1;
        
        // SQL 문장
        String query = "SELECT count(*) as total from book where 1 = 1";
        
        try {
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            // SQL 문장 실행
            java.sql.ResultSet rs = stmt.executeQuery(); // sql문장을 실행하고 결과로 resultset을 반환한다.
            
            rs.next(); // 커서이동. resultset에서 첫번째로 row로 이동.
            result = rs.getInt("total"); // total 컬럼의 값을 가져온다.,rs.getInt(0);
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return result;
        
    }
    
    @Override
    public int getMaxBookid() throws SQLException {
        
        int result = -1;
        
        // SQL 문장
        String query = "select max(bookid) maxid from book";
        
        try {
            // 문장 객체 생성
            PreparedStatement stmt = conn.prepareStatement(query);
            // SQL 문장 실행
            ResultSet rs = stmt.executeQuery(); // sql문장을 실행하고 결과로 resultset을 반환한다.
            
            rs.next(); // 커서이동. resultset에서 첫번째로 row로 이동.
            result = rs.getInt("maxid"); // maxid 컬럼의 값을 가져온다.,rs.getInt(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    } // java.sql. 안써도 되는데 걍 추가해라. 시간될때
    
    @Override
    public java.sql.ResultSet selectAll() {
        java.sql.ResultSet rs = null;
        String query = "select * from book order by bookid asc";
        
        try {
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            // SQL 문장 실행
            rs = stmt.executeQuery();// sql문장을 실행하고 결과로 resultset을 반환한다.
            
        
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelBook book) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ResultSet selectEqul(ModelBook book) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ResultSet selectDynamic(ModelBook book) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int insertBook(ModelBook book) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int updateBook(ModelBook wherebook, ModelBook setbook)
            throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int deleteBook(ModelBook book) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
