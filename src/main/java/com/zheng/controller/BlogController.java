package com.zheng.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zheng.entity.Blog;
import com.zheng.service.BlogService;

@Controller
@RequestMapping("blog") 
public class BlogController {
	@Autowired
	private BlogService blogService;
	
	@RequestMapping("index") 
	public String index(ModelMap model){
		//默认显示三个博客
//		List<Blog> blogList = new ArrayList<Blog>();
		Blog blog = blogService.selectByPrimaryKey(1);
		model.addAttribute("blog",blog);
		return "index";
	}
	
	@RequestMapping("all")
	public String blogAll(ModelMap model){
		return "full-width";
	}
	
	@RequestMapping(value="{num}")
	public String getBlog(@PathVariable("num")String num,ModelMap model){
		System.out.println(num);
		return "single";
	}
}
