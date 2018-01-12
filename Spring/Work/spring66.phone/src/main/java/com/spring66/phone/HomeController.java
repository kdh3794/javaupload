package com.spring66.phone;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring66.phone.model.ModelPhone;
import com.spring66.phone.service.IServicePhone;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
    
    private static final Logger logger = LoggerFactory
            .getLogger(HomeController.class);
    @Autowired
    IServicePhone               svr;
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);
        
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.LONG, locale);
        
        String formattedDate = dateFormat.format(date);
        
        model.addAttribute("serverTime", formattedDate);
        
        return "home";
    }
    
    @RequestMapping(value = "/phone/writeoneform", method = RequestMethod.GET)
    public String writeOneForm(Model model) {
        
        return "phone/writeOneForm";
    }
    
    @RequestMapping(value = "/phone/writelistform", method = RequestMethod.GET)
    public String writeListForm(Model model) {
        
        return "phone/writeListForm";
    }
    
    @RequestMapping(value = "/phone/writeOneResult", method = RequestMethod.POST)
    public String writeOneResult(Locale locale, Model model) {
        logger.info("writeOneResult", locale);
    
        return "phone/writeOneResult";
    }
    
    
    @RequestMapping(value = "/phone/writeone", method = RequestMethod.GET)
    public String writeone(Locale locale, Model model) {
        logger.info("writeone", locale);
        
        return "phone/writeone";
    }
    
    @RequestMapping(value = "/phone/writeone1", method = RequestMethod.POST)
    public String writeone1(Locale locale, Model model, HttpServletRequest request) {
        logger.info("writeone1", locale);
        
        String  name         = request.getParameter("name");
        String  manufacturer = request.getParameter("manufacturer");
        Integer price        = Integer.valueOf( request.getParameter("price") );        
        ModelPhone phone = new ModelPhone(name, manufacturer, price);
        
        // DB insert
        
        int insert = svr.insertPhone(phone);
        
        // DB select 
        List<ModelPhone> select = svr.getPhoneList();
        
        // jsp 파일로 select 결과 보내기
        model.addAttribute("phone", phone);
    
        return "phone/writeOneResult";
    }
    
    
    @RequestMapping(value = "/phone/writeone2", method = RequestMethod.POST)
    public String writeone2(Locale locale
            , Model model
            , @RequestParam( value="name", defaultValue=""        ) String name
            , @RequestParam( value="manufacturer", defaultValue="") String manufacturer
            , @RequestParam( value="price", defaultValue="0"      ) Integer price ) {
        logger.info("writeone2", locale);

        ModelPhone phone = new ModelPhone(name, manufacturer, price);

        // DB insert
        int insert = svr.insertPhone(phone);
        
        // DB select
        List<ModelPhone> select = svr.getPhoneList();
        
        // jsp 파일로 select 결과 보내기
        model.addAttribute("list", select);
    
        return "phone/writeListResult";
    }

    @RequestMapping(value = "/phone/writeone3", method = RequestMethod.POST)
    public String writeone3(Locale locale
            , Model model
            , @ModelAttribute ModelPhone phone  ) {
        logger.info("writeone3", locale);

        // DB insert
        int insert = svr.insertPhone(phone);
        
        // DB select
        List<ModelPhone> select = svr.getPhoneList();
        
        // jsp 파일로 select 결과 보내기
        model.addAttribute("list", select);
    
        return "phone/writeListResult";
    }
    @RequestMapping(value = "/phone/writelistresult", method = RequestMethod.GET)
    public String writeListPost(Model model,
            @ModelAttribute RepositoryPhone phone) {
        List<ModelPhone> phonelist = phone.getPhoneItems();
        // DB insert. 어떻게?
        svr.insertPhoneList(phonelist);
        model.addAttribute("list", phonelist);
        return "phone/writeListResult";
    }
    @RequestMapping(value = "/phone/writeListResult", method = RequestMethod.POST)
    public String writeListResult(Locale locale, Model model) {
        logger.info("writeListResult", locale);
        
        List<ModelPhone> phonelist = svr.getPhoneList();
        
        model.addAttribute("list", phonelist);
        
        
        return "phone/writeListResult";
    }
}
