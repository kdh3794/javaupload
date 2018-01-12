package com.spring66.phone.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring66.phone.inf.IDaoPhone;
import com.spring66.phone.model.ModelPhone;

import org.apache.ibatis.session.SqlSession;

@Repository
public class DaoPhone implements IDaoPhone {
    // SLF4J Logging
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    SqlSession session; 
    
    @Override
    public ModelPhone getPhoneOne(String name) {
        return session.selectOne("mapper.mysql.mapperPhone.getPhoneOne", name);
    }//mapper.mysql.mapperPhone.getPhoneOne", name);
     // mapper.mysql.mapperPhone. <--mapper 파일의 namespace
    // getPhoneOne public 
    // name 변수
    
    @Override
    public List<ModelPhone> getPhoneList() {
        return session.selectOne("mapper.mysql.mapperPhone.getPhoneList");
    }
    
    @Override
    public int insertPhone(ModelPhone phone) {
        return session.selectOne("mapper.mysql.mapperPhone.insertPhone", phone);
        
    }
    
    @Override
    public int insertPhoneList(List<ModelPhone> phones) {
        return session.selectOne("mapper.mysql.mapperPhone.insertPhoneList");
      
    }
}
