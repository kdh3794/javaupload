package com.donghoon.exam08;

import java.util.List;

public interface IDaoPhone {
       
       ModelPhone getPhoneOne(String name);
       List<ModelPhone> getPhoneList(int start, int end);  //여러개를 리턴해야 하면 List 사용
       int getPhoneTotalRecord();
       int insertPhone(ModelPhone phone);
    
}
