package aop;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.ModelProduct;
import service.IServiceProduct;

public class TestFirstAspect {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static IServiceProduct service;
    
    @BeforeClass
    public static void serUpBeforClass() throws Exception{
     // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:aop.xml");
        
        // retrieve configured instance
         service = context.getBean("svrprod", IServiceProduct.class);        
    }
    
    
    @Test
    public void testGetProduct() {
         ModelProduct product = service.getProduct("bbb");
         assertTrue(1000 == product.getPrice());
    }
    
    @Test
    public void testGetNone(){
        service.getNone();
    }
    
    @Test(expected=Exception.class)
    public void testGetException() throws Exception {
        ModelProduct product = service.getException("bbb");
        assertTrue(1000 == product.getPrice());
   }
    
}
