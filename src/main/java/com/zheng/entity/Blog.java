package com.zheng.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Blog {
	private Integer blogid;

	private Timestamp createTime;

	private String title;

	private String author;

	private Date updateTime;

	private String content;

	private List<String> tag;

	private Integer click;

	public Integer getBlogid() {
		return blogid;
	}

	public void setBlogid(Integer blogid) {
		this.blogid = blogid;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<String> getTag() {
		return tag;
	}

	public void setTag(List<String> tag) {
		this.tag = tag;
	}

	public Integer getClick() {
		return click;
	}

	public void setClick(Integer click) {
		this.click = click;
	}

	@Override
	public String toString() {
		return "Blog [blogid=" + blogid + ", createTime=" + createTime + ", title=" + title + ", author=" + author
				+ ", updateTime=" + updateTime + ", content=" + content + ", tag=" + tag + "]";
	}

}