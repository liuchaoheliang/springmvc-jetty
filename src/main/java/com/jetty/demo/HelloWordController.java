package com.jetty.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/helloWord") 
public class HelloWordController {
	
	@RequestMapping("/index")
    public String hello(ModelAndView modelAndView, HttpServletRequest request ,HttpServletResponse response  ) {
		request.getSession().setAttribute("name", "liuchaoheliang");
//		modelAndView.setViewName("helloword");
//		return modelAndView;
        return "helloword";
    }
}
