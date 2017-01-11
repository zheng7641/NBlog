package com.zheng.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zheng.entity.Blog;
import com.zheng.service.BlogService;

@Controller
@RequestMapping("blog") 
public class BlogController {
	@Autowired
	private BlogService blogService;
	@RequestMapping("index") 
	public String index(ModelMap model,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Blog blog = blogService.selectByPrimaryKey(1);
		model.addAttribute("blog",blog);
		return "index";
	}
}
