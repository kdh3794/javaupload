package com.spring63.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
    
    private static final Logger logger = LoggerFactory
            .getLogger(HomeController.class);
    
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
    
    @RequestMapping(value = "/spring/helloworld", method = RequestMethod.GET)
    public String helloworld(Model model) {
        model.addAttribute("msg", "Hello, World!!!");
        return "helloworld";
    }
    
    @RequestMapping(value = "/spring/sayhello", method = RequestMethod.GET)
    public ModelAndView sayHello(Model model) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("msg", "say Hello");
        return new ModelAndView("sayhello", map);
        
        // Map<String, String> map = new HashMap<>();
        // map.put("msg", "say Hello");
        // ModelAndView mv= new ModelAndView();
        // mv.setViewName("sayhello"); //view 이름
        // mv.addObject("msg", "Sqh, Hello"); //데이터 : 모델
        // return mv ;
        
    }
    
    @RequestMapping(value = "/spring/redirect", method = RequestMethod.GET)
    public String redirect(Model model) {
        return "redirect:/spring/helloworld";
    }
    
    @RequestMapping(value = "/spring/forward", method = RequestMethod.GET)
    public String forward(Model model) {
        return "forward:/spring/helloworld";
    }
    
    @RequestMapping(value = "/spring/querystring", method = RequestMethod.GET)
    public String querystring(Model model, HttpServletRequest request) {
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        
        model.addAttribute("name", name);
        model.addAttribute("phone", phone);
        
        return "querystring";
    }
    
    @RequestMapping(value = "/spring/querystring2", method = RequestMethod.GET)
    public String querystring2(Model model,
            @RequestParam(value = "name", defaultValue = "") String name,
            @RequestParam(value = "phone", defaultValue = "0") int phone) {
        model.addAttribute("name", name);
        model.addAttribute("phone", phone);
        return "querystring2";
    }
    
    @RequestMapping(value = "/spring/querypath/{name}", method = RequestMethod.GET)
    public String querypath(Model model,
            @PathVariable(value = "name") String name) {
        
        model.addAttribute("name", name);
        
        return "querypath";
    }
    
    @RequestMapping(value = "/spring/querypath2/{name}/{phone}", method = RequestMethod.GET)
    public String querypath2(Model model,
            @PathVariable(value = "name") String name,
            @PathVariable(value = "phone") String phone) {
        
        model.addAttribute("name", name);
        model.addAttribute("phone", phone);
        return "querypath2";
    }
    
    @RequestMapping(value = "/spring/login", method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute("id", "aaa");
        return "spring/login";
    }
    
    @RequestMapping(value = "/spring/login", method = RequestMethod.POST)
    public String login(Model model
       , @RequestParam(value = "id") String id,
         @RequestParam(value = "pw") String pw) {
        
        model.addAttribute("id", id);
        model.addAttribute("pw", pw);            
        
        return "spring/loginpost";
    }
    
    @RequestMapping(value="/spring/loginmodel", method = RequestMethod.GET)
    public String loginmodel(Model model) {
    return "spring/loginmodelget";
    } 
    
    
    @RequestMapping(value="/spring/loginmodel", method = RequestMethod.POST)
    public String loginmodel(Model model, 
            @ModelAttribute ModelLogin login) {
        //DB 조회
        
        //결과 출력
        model.addAttribute("login", login);        
        return "spring/loginmodelpost";
    }
    
}
