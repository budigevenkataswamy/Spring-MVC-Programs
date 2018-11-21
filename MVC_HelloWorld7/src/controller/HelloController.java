package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

public class HelloController extends ParameterizableViewController {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		 
		 
		
		String name=req.getParameter("name");
		 Map m=new HashMap();
		 m.put("msg", "hello....."+name+"    using controller class name  handler mapping......parameterizable view controller");
		 
		// ModelAndView mav=new ModelAndView("success",m);
		 
		 
		 ModelAndView mav=new ModelAndView(getViewName(),m);
		return mav;
	}

}
