package com.spring65.phone.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring65.phone.model.ModelPhone;

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
	
	@RequestMapping(value = "/phone/writeoneform", method = RequestMethod.GET)
    public String writeOneForm(Model model) {
    
    return "writeOneForm";
    }
	@RequestMapping(value = "/phone/writelistform", method = RequestMethod.GET)
    public String writeListForm(Model model) {
    
    return "writeListForm";
    }
	
	@RequestMapping(value = "/phone/writeone1", method = RequestMethod.POST)
	public String writeOnePost1(Model model, HttpServletRequest request) {
    	String name = request.getParameter("name");
    	String manufacturer = request.getParameter("manufacturer");
    	String price = request.getParameter("price");
    	
    	
    	return "phone/writeOneResult";
	}
	@RequestMapping(value = "/phone/writeone2", method = RequestMethod.POST)
	public String writeOnePost2(Model model
	, @RequestParam(value="name" , defaultValue="") String name
	, @RequestParam(value="manufacturer", defaultValue="") String manufacturer
	, @RequestParam(value="price" , defaultValue="") int price) {
	    return "phone/writeOneResult";
	    
	}
	@RequestMapping(value = "/phone/writeone3", method = RequestMethod.POST)
	public String writeOnePost3(
	@ModelAttribute ModelPhone phone,	Model model) {
	    return "phone/writeOneResult";
	}
	@RequestMapping(value = "/phone/writelist", method = RequestMethod.POST)
    public String writeList(
    @ModelAttribute ModelPhone phone,   Model model) {
        return "phone/writeListResult";
    }	
	
}
