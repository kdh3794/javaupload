package com.myexam.exam.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myexam.exam.inf.IDaoPhone;
import com.myexam.exam.model.ModelPhone;

@Service("servicephone")
public class ServicePhone implements IServicePhone {
    // SLF4J Logging
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    IDaoPhone dao;

    @Override
    public List<ModelPhone> getPhoneList() {
        List<ModelPhone> result = null;
        
        try {
            result = dao.getPhoneList();
        } catch (Exception e) {
            logger.error("getPhoneList" + e.getMessage() );
            throw e;
        }
        
        return result;
    }

    @Override
    public int insertPhone(ModelPhone phone) {
        int result = -1;
        try {
            result = dao.insertPhone(phone);
        } catch (Exception e) {
            logger.error("insertPhone" + e.getMessage() );
            throw e;
        }
        return result;
    }
    
    
   
}