package java23.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceAuth implements IServiceAuth {
    
    private java.sql.Connection conn = null;
    
    public ServiceAuth() {
        super();
        this.conn = DBConnect.makeConnection(); // heidisql 에서 접속시 열기를 누르는 것과 같은 것. DB의 연결 정보를 필드에 넣어 놓겠다.
    }
    
    @Override
    public int getCount(ModelAuth auth) throws SQLException {
        int rs = -1;
        
        try {
            this.conn.setAutoCommit(false); // 트랜잭션 시작
            DaoAuth dao = new DaoAuth(conn); // DAO의 SQL 메서드 실행
            rs = dao.getCount(auth);
            
            this.conn.commit(); // 트랜잭션 커밋
        } catch (Exception e) {
            
            e.printStackTrace();
            
            this.conn.rollback(); // 트랜잭션 롤백
            
        }
        
        return rs;
    }
    
    @Override
    public int getMaxAuthid() throws SQLException {
        int rs = -1;
        
        try {
            this.conn.setAutoCommit(false);
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.getMaxAuthid();
            this.conn.commit();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            this.conn.rollback();
            
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        ResultSet rs = null;
        
        try {
            this.conn.setAutoCommit(false);
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.selectAll();
            this.conn.commit();
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
            this.conn.setAutoCommit(false);
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.selectLike(auth);
            
            this.conn.commit();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            this.conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        
        ResultSet rs = null;
        try {
            // 트렌잭션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.selectEqual(auth);
            
            this.conn.commit();// 트랜젝션 종료
        } catch (SQLException e) {
            e.printStackTrace();
            this.conn.rollback(); // 트랜젝션 롤백
        }
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException {
        
        ResultSet rs = null;
        try {
            // 트렌잭션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.selectDynamic(auth);
            
            this.conn.commit();// 트랜젝션 종료
        } catch (SQLException e) {
            e.printStackTrace();
            this.conn.rollback(); // 트랜젝션 롤백
        }
        return rs;
    }
    
    @Override
    public int insertAuth(ModelAuth auth) throws SQLException {
        int rs = -1;
        
        try {
            // 트랙잭션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(this.conn);
            rs = dao.insertAuth(auth);
            
            this.conn.commit(); // 트랜잭션 종료
        } catch (SQLException e) {
            e.printStackTrace();
            this.conn.rollback(); // 트랜잭션 롤백
        }
        return rs;
        
    }
    
    @Override
    public int updateAuth(ModelAuth whereauth, ModelAuth setauth)
            throws SQLException {
        int rs = -1;
        
        try {
            // 트랙잭션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(this.conn);
            rs = dao.updateAuth(whereauth, setauth);
            
            this.conn.commit(); // 트랜잭션 종료
        } catch (SQLException e) {
            e.printStackTrace();
            this.conn.rollback(); // 트랜잭션 롤백
        }
        return rs;
        
    }
    
    @Override
    public int deleteAuth(ModelAuth auth) throws SQLException {
        int rs = -1;
        
        try {
            // 트랙잭션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(this.conn);
            rs = dao.deleteAuth(auth);
            
            this.conn.commit(); // 트랜잭션 종료
        } catch (SQLException e) {
            e.printStackTrace();
            this.conn.rollback(); // 트랜잭션 롤백
        }
        return rs;
        
    }
    
    @Override
    public int transCommit(ModelAuth a1, ModelAuth a2) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int transRollback(ModelAuth a1, ModelAuth a2) {
        // TODO Auto-generated method stub
        return 0;
    }// 여기 두개는 iserviceauth 에서 선언.
    
}
