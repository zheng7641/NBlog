package com.zheng.dao;

import com.zheng.entity.TagBlog;

public interface TagBlogMapper {
    int deleteByPrimaryKey(Integer tagid);

    int insert(TagBlog record);

    int insertSelective(TagBlog record);

    TagBlog selectByPrimaryKey(Integer tagid);

    int updateByPrimaryKeySelective(TagBlog record);

    int updateByPrimaryKey(TagBlog record);
}