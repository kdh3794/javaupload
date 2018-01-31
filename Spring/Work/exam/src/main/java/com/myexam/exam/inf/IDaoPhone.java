package com.myexam.exam.inf;

import java.util.List;

import com.myexam.exam.model.ModelPhone;

public interface IDaoPhone {
    
    
    List<ModelPhone>  getPhoneList();
    int insertPhone( ModelPhone phone );
    

}