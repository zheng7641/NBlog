package com.zheng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zheng.dao.BlogMapper;
import com.zheng.dao.TagMapper;
import com.zheng.entity.Blog;

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
}
