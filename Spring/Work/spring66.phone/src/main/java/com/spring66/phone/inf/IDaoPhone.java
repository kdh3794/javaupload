package com.spring66.phone.inf;

import java.util.List;

import com.spring66.phone.model.ModelPhone;

public interface IDaoPhone {
    
    ModelPhone  getPhoneOne(String name);
    List<ModelPhone>  getPhoneList();
    int insertPhone( ModelPhone phone );
    int insertPhoneList( List<ModelPhone> phones );

}