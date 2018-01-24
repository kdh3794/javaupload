package com.mytest.testweb;

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
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value = "elements", method = RequestMethod.GET)
    public String elements(Model model) {
    logger.info("elements");

    return "elements"; //views/jstl/jstl01.jsp
    }
    @RequestMapping(value = "generic", method = RequestMethod.GET)
    public String generic(Model model) {
    logger.info("generic");

    return "generic"; //views/jstl/jstl01.jsp
    }
    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home(Model model) {
    logger.info("home");

    return "home"; //views/jstl/jstl01.jsp
    }
  
   
    @RequestMapping(value = "landing", method = RequestMethod.GET)
    public String landing(Model model) {
    logger.info("landing");
    return "landing";
}
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(Model model) {
    logger.info("login");
    return "login";
}
    @RequestMapping(value = "picture", method = RequestMethod.GET)
    public String picture(Model model) {
    logger.info("picture");
    return "picture";
}
    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register(Model model) {
    logger.info("register");
    return "register";
}
    @RequestMapping(value = "register2", method = RequestMethod.GET)
    public String register2(Model model) {
    logger.info("register2");
    return "register2";
}
    @RequestMapping(value = "video", method = RequestMethod.GET)
    public String video(Model model) {
    logger.info("video");
    return "video";
}
}
