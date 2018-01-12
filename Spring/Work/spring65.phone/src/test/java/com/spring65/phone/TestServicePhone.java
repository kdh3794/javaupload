package com.spring65.phone;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring65.phone.model.ModelPhone;
import com.spring65.phone.service.IServicePhone;

public class TestServicePhone {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private static ApplicationContext context = null;
    private static IServicePhone service = null;
        
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        context= new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml");
        service=context.getBean("servicephone", IServicePhone.class);
    }    
 
    @Test
    public void test01_getPhoneOne() {      
       ModelPhone result = service.getPhoneOne("이영규");
       assertEquals("이영규", result.getName());
    }
    @Test
    public void test02_getPhoneList() {     
       
  
       List<ModelPhone> result = service.getPhoneList();
       result = service.getPhoneList();
       assertSame(result.size(), 2);
    }
    @Test
    public void test03_insertPhone() {      
        ModelPhone model = new ModelPhone();
        model.setName("이영규");
        model.setManufacturer("이영규");
        model.setPrice(123);
        
        int result = service.insertPhone(model);
        assertEquals(result, 1);
    }
    
    
    @Test
    public void test04_insertPhoneList() {      
        ModelPhone model = new ModelPhone();
        List<ModelPhone> list = new ArrayList<ModelPhone>();
        
        for( int i=0; i<10; i=i+1){            
            model = new ModelPhone();
            model.setName("ddd");
            model.setManufacturer("sss");
            model.setPrice(12003); 
            
            list.add( model );
        }
               
        int result = service.insertPhoneList(list);
        assertEquals(result, list.size());
    }
}
