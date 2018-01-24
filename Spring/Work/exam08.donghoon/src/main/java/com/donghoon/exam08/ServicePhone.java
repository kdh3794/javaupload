package com.donghoon.exam08;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePhone implements IServicePhone {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    IDaoPhone      dao;
    
    @Override
    public ModelPhone getPhoneOne(String name) {
        ModelPhone result = null;
        try {
            result = dao.getPhoneOne(name);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public List<ModelPhone> getPhoneList(int start, int end) {
        List<ModelPhone> result = null;
        try {
            result = dao.getPhoneList(start, end);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        
        return result;
    }
    
    @Override
    public int insertPhone(ModelPhone phone) {
        
        int result = -1;
        try {
            result = dao.insertPhone(phone);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public int getPhoneTotalRecord() {
        int result = -1;
        try {
            result = dao.getPhoneTotalRecord();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
}
