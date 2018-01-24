package com.donghoon.exam08;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PhoneController {
	
	private static final Logger logger = LoggerFactory.getLogger(PhoneController.class);
	
	@Autowired
	IServicePhone svrphone;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/phone/writemain", method = RequestMethod.GET)
	public String writemain( Model model) {
		logger.info("/phone/writemain");
		
		
		
		return "phone/writemain"; // 경로 : views/phone/writemain.jsp
	}
	   @RequestMapping(value = "/phone/writeoneresult", method = RequestMethod.GET)
	    public String writeoneresult( Model model
	            ,@RequestParam(defaultValue="1") Integer curPage) {
	        logger.info("/phone/writeoneresult");
	        
	        //페이지 처리	        
	        
	        //1. 전체 레코드 갯수 가져오기
	        int totalRecord = svrphone.getPhoneTotalRecord();
	        
	        //2. 페이징
	        PagingHelper paging = new PagingHelper(totalRecord, curPage, 5, 7); // 레코드 갯수 5, 페이지 갯수 7
	        int start = paging.getStartRecord();
	        int end = paging.getEndRecord();
	        
	      //DB table에서 결과를 가져와 jsp로 넘긴다.
	        List<ModelPhone> list = svrphone.getPhoneList(start, end);
	        
	        model.addAttribute("list", list);
	        
	        
	        //no
	        //prevLink
	        //pageLinks
	        //curPage
	        //nextLink
	        model.addAttribute("no",paging.getListNo()      );
	        model.addAttribute("prevLink",paging.getPrevLink()    );
	        model.addAttribute("pageLinks",paging.getPageLinks()   );
	        model.addAttribute("curPage",curPage                 );
	        model.addAttribute("nextLink",paging.getNextLink()    );
	        
	        return "phone/writeoneresult"; // 경로 : views/phone/writeoneresult.jsp
	        
	       
	    }
	@RequestMapping(value = "/phone/writeone1", method = RequestMethod.POST)
    public String writeone1( Model model
            ,HttpServletRequest request) {
        logger.info("/phone/writeone1");
        
        String name               = request.getParameter("name"); // 반드시 클라이언트의 변수명. 클라이언트의 변수명은 writemain의 name 옆에.
        String manufacturer       = request.getParameter("manufacturer");
        Integer price             = Integer.valueOf(request.getParameter("price"));
        
        ModelPhone phone = new ModelPhone();
        phone.setManufacturer(manufacturer);
        phone.setName(name);
        phone.setPrice(price);
        
        int result = svrphone.insertPhone(phone);
        
        return "redirect:/phone/writeoneresult";
        
    }
	@RequestMapping(value = "/phone/writeone2", method = RequestMethod.POST)
    public String writeone2( Model model
            ,@RequestParam (value="manufacturer", defaultValue="")       String manufacturer
            ,@RequestParam (value="name"        , defaultValue="")       String name
            ,@RequestParam (value="price"       , defaultValue="0")      Integer price
            ,RedirectAttributes rttr) {
        
	    logger.info("/phone/writeone2");     
        
        ModelPhone phone = new ModelPhone();
        phone.setManufacturer(manufacturer);
        phone.setName(name);
        phone.setPrice(price);      
       
        int result = svrphone.insertPhone(phone);
        if(result <= 0) {
            //insert실패
            rttr.addFlashAttribute("msg", WebConstant.MSG_FAIL_INSERT);
            return "redirect:/phone/writemain"; // 경로 : views/phone/writeoneresult.jsp
        }
        else {
            //insert성공
            return "redirect:/phone/writeoneresult";
        }
        
        
    }
	@RequestMapping(value = "/phone/writeone3", method = RequestMethod.POST)
    public String writeone3( Model model
            ,@ModelAttribute ModelPhone phone
            ,RedirectAttributes rttr) {
        logger.info("/phone/writeone3");
        
        
        

        int result = svrphone.insertPhone(phone);
        if(result <= 0) {
            //insert실패
            rttr.addFlashAttribute("msg", WebConstant.MSG_FAIL_INSERT);
            return "redirect:/phone/writemain"; // 경로 : views/phone/writeoneresult.jsp
        }
        else {
            //insert성공
            return "redirect:/phone/writeoneresult";
        }
    }
}
