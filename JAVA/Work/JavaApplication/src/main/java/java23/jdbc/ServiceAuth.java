package java23.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceAuth implements IAuth {
    
    
    
    
    @Override
    public int getCount(ModelAuth auth) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int getMaxAuthid() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
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
