package com.zheng.index;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		request.getRequestDispatcher("/WEB-INF/view/index.html").forward(request, response);
		return "index";
	}
}
