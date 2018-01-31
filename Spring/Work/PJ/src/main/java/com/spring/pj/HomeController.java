package com.spring.pj;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        
        return "index"; // 여기를 index로 바꿔도 되나?
    }
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(Model model) {
        logger.info("index");
        
        return "index"; // views/jstl/jstl01.jsp
    }
    
    @RequestMapping(value = "blog", method = RequestMethod.GET)
    public String blog(Model model) {
        logger.info("blog");
        
        return "blog"; // views/jstl/jstl01.jsp
    }
    
    @RequestMapping(value = "contact", method = RequestMethod.GET)
    public String contact(Model model) {
        logger.info("contact");
        
        return "contact"; // views/jstl/jstl01.jsp
    }
    @RequestMapping(value = "pj_training", method = RequestMethod.GET)
    public String pj_training(Model model) {
        logger.info("pj_training");
        
        return "pj_training"; // views/jstl/jstl01.jsp
    }
    @RequestMapping(value = "pj_trainingwrite", method = RequestMethod.GET)
    public String pj_trainingwrite(Model model) {
        logger.info("pj_trainingwrite");
        
        return "pj_trainingwrite"; // views/jstl/jstl01.jsp
    }
    @RequestMapping(value = "pj_mn10_01", method = RequestMethod.GET)
    public String pj_mn10_01(Model model) {
        logger.info("pj_mn10_01");
        
        return "pj_mn10_01"; // views/jstl/jstl01.jsp
    }
    
    @RequestMapping(value = "pj_mn10_02", method = RequestMethod.GET)
    public String pj_mn10_02(Model model) {
        logger.info("pj_mn10_02");
        
        return "pj_mn10_02"; // views/jstl/jstl01.jsp
    }
    
    @RequestMapping(value = "pj_mn10_03", method = RequestMethod.GET)
    public String pj_mn10_03(Model model) {
        logger.info("pj_mn10_03");
        
        return "pj_mn10_03"; // views/jstl/jstl01.jsp
    }
    
    @RequestMapping(value = "pj_mn10_04", method = RequestMethod.GET)
    public String pj_mn10_04(Model model) {
        logger.info("pj_mn10_04");
        
        return "pj_mn10_04"; // views/jstl/jstl01.jsp
    }
    
    @RequestMapping(value = "portfolio", method = RequestMethod.GET)
    public String portfolio(Model model) {
        logger.info("portfolio");
        
        return "portfolio"; // views/jstl/jstl01.jsp
    }
    
    @RequestMapping(value = "services", method = RequestMethod.GET)
    public String services(Model model) {
        logger.info("services");
        
        return "services"; // views/jstl/jstl01.jsp
    }
}
