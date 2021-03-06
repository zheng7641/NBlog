package com.zheng.dao;

import java.util.List;

import com.zheng.entity.Tag;

public interface TagMapper {
    int deleteByPrimaryKey(Integer tagid);

    int insert(Tag record);

    int insertSelective(Tag record);

    Tag selectByPrimaryKey(Integer tagid);

    List<String> selectListByBlogId(Integer blogid);
    
    int updateByPrimaryKeySelective(Tag record);

    int updateByPrimaryKey(Tag record);
}