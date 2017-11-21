
package java24.mybatis.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java24.mybatis.inf.IBook;
import java24.mybatis.model.ModelBook;
@Repository("daobook")

public class DaoBook implements IBook{
    
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;

    @Override
    public int getCount(ModelBook book) throws Exception {
        int result = -1;
        session.selectOne("mapper.mapperBook.getCount",book);
        return result;
    }

    @Override
    public int getMaxBookid() throws Exception {
        int result = -1;
        result = session.selectOne("mapper.mapperBook.getMaxBookid");
        return result;
    }

    @Override
    public List<ModelBook> selectAll(ModelBook book) throws Exception {
       List<ModelBook> result = null;
       result = session.selectList("mapper.mapperBook.selectAll", book);
        return null;
    }

    @Override
    public List<ModelBook> selectLike(ModelBook book) throws Exception {
        List<ModelBook>  result = null;
        result = session.selectList("mapper.mapperBook.selectLike", book);
        return result;
         
    }

    @Override
    public List<ModelBook> selectEqual(ModelBook book) throws Exception {
        List<ModelBook> result = null;
        result = session.selectList("mapper.mapperBook.selectEqual", book);
        return result;
    }

    @Override
    public int insert(ModelBook book) throws Exception {
        int result = -1;
        session.insert("mapper.mapperBook.insert", book);
        return 0;
    }

    @Override
    public int insertMap(String bookname, Date dtm, int authid)
            throws Exception {
        
        Map<String, Object> map = new HashMap<>();
        map.put("b1", bookname);
        map.put("d1", dtm);
        map.put("a1", authid);
        
        int result = -1;
        result=session.insert("mapper.mapperBook.insertMap", map);
        return result;
    }

    @Override
    public int update(ModelBook wherebook, ModelBook setbook) throws Exception {
       int result = -1;
       Map<String, Object> map = new HashMap<>();
       map.put("wherebook", wherebook);
       map.put("setbook", setbook);
       
       
       result = session.update("mapper.mapperBook.updateBook", map);
       return result;
      
    }

    @Override
    public int delete(ModelBook book) throws Exception {
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
    public int insertbook(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
}
