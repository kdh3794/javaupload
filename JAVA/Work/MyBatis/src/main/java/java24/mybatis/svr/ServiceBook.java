package java24.mybatis.svr;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java24.mybatis.inf.IBook;
import java24.mybatis.inf.IServiceBook;
import java24.mybatis.model.ModelBook;

@Service("servicebook") // servicebook은 serviceBook의 인스턴스 명이 된다.

public class ServiceBook implements IServiceBook {
    
    // DaoBook 클래스의 인스턴스를 만들고 dao필드 해당 인스턴스를 넣는다.
    @Autowired // 인스턴스 만들기
    @Qualifier("daobook")
    private IBook dao;
    
    @Override
    public int getCount(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int getMaxBookid() throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public List<ModelBook> selectAll(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public List<ModelBook> selectLike(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public List<ModelBook> selectEqual(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int insertbook(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int insertMap(String bookname, Date dtm, int authid)
            throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int updateBook(ModelBook wherebook, ModelBook setbook)
            throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int deleteBook(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public List<ModelBook> selectDynamic(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int insertBook(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int insert(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int update(ModelBook wherebook, ModelBook setbook) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int delete(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
