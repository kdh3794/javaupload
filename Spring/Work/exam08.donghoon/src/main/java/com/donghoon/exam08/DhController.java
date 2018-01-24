package com.donghoon.exam08;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class DhController {
   
    private static final Logger logger = LoggerFactory
            .getLogger(DhController.class);
    
    // http://localhost/jstl/jst11
    // http://localhost/jstl/jst11?val=0
    @RequestMapping(value = "/jstl/jstl11", method = RequestMethod.GET)
    public String jstl11(Model model,
            @RequestParam(defaultValue = "-1") Integer val) {
        
        model.addAttribute("val", val);
        
        return "jstl/jstl11";
    }
    
    @RequestMapping(value = "/jstl/jstlforeach", method = RequestMethod.GET)
    public String jstlforeach(Model model) {
        
        List<String> foods = new ArrayList<>();
        foods.add("순두부");
        foods.add("된장찌개");
        foods.add("제육덮밥");
        
        String[] food2 = { "순두부", "된장찌개", "제육덮밥" };
        
        model.addAttribute("foods", food2);
        
        return "jstl/jstlforeach";
    }
	

}
