package com.spring66.phone.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring66.phone.dao.DaoPhone;
import com.spring66.phone.inf.IDaoPhone;
import com.spring66.phone.model.ModelPhone;

@Service("servicephone")
public class ServicePhone implements IServicePhone {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    IDaoPhone dao;
    
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
    public List<ModelPhone> getPhoneList() {
        List<ModelPhone> result = null;
        try {
            result = dao.getPhoneList();
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
    public int insertPhoneList(List<ModelPhone> phones) {
        int result = -1;
        try {
            result = dao.insertPhoneList(phones);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
}
