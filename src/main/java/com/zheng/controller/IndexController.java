package com.zheng.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zheng.dao.BlogMapper;
import com.zheng.entity.Blog;

@Controller
@RequestMapping("blog") 
public class IndexController {

	
	private static final Logger logger = Logger.getLogger(IndexController.class);
	@Autowired
	private BlogMapper blogDao;
	@RequestMapping("{http}") 
	public String index(@PathVariable("http")String http,ModelMap model,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		logger.info("-----"+http+"-----");
		Blog blog = blogDao.selectByPrimaryKey(1);
		System.out.println(blog);
		request.setAttribute("title", blog.getTitle());
		return "index.jsp";
	}
}
