package com.zheng.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	
	private static final Logger logger = Logger.getLogger(IndexController.class);
	@RequestMapping("index") 
	public String index(/*@PathVariable("http")String http,*/HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		logger.info("-----index-----");
		return "index";
	}
}
