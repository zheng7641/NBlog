package com.zheng.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zheng.dao.BlogMapper;
import com.zheng.dao.TagMapper;
import com.zheng.entity.Blog;
import com.zheng.entity.Page;

@Component
public class BlogService {

	@Autowired
	private BlogMapper BlogDao ;

	@Autowired
	private TagMapper TagDao;
	public Blog selectByPrimaryKey(Integer blogid){
		Blog blog = BlogDao.selectByPrimaryKey(blogid);
		if(blog==null){
			return null;
		}
		blog.setTag(TagDao.selectListByBlogId(blogid));
		return blog; 
	}
	
	public List<Blog> selectBlogList(Blog entity,Page page){
		List<Blog> blogList = new ArrayList<Blog>();
		for(Blog blog:blogList){
			blog.setTag(TagDao.selectListByBlogId(entity.getBlogid()));
		}
		return null;
	}
}
