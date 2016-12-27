/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : nblog

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2016-12-27 10:59:05
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `blog`
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `blogid` int(255) NOT NULL AUTO_INCREMENT COMMENT '博客主键',
  `content` text COMMENT '博客内容',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `title` varchar(255) NOT NULL COMMENT '标题',
  `author` varchar(255) NOT NULL COMMENT '作者',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`blogid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog
-- ----------------------------

-- ----------------------------
-- Table structure for `config`
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config` (
  `configid` int(11) NOT NULL AUTO_INCREMENT COMMENT '配置id',
  `type` int(8) NOT NULL COMMENT '置配类型',
  `value` varchar(255) NOT NULL COMMENT '配置值',
  PRIMARY KEY (`configid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config
-- ----------------------------

-- ----------------------------
-- Table structure for `discuss`
-- ----------------------------
DROP TABLE IF EXISTS `discuss`;
CREATE TABLE `discuss` (
  `discussid` int(255) NOT NULL AUTO_INCREMENT COMMENT '回复id',
  `name` varchar(255) DEFAULT NULL COMMENT '回复人昵称',
  `email` varchar(255) DEFAULT NULL COMMENT '箱邮',
  `title` varchar(255) DEFAULT NULL COMMENT '题标',
  `content` varchar(255) DEFAULT NULL COMMENT '容内',
  PRIMARY KEY (`discussid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of discuss
-- ----------------------------

-- ----------------------------
-- Table structure for `image`
-- ----------------------------
DROP TABLE IF EXISTS `image`;
CREATE TABLE `image` (
  `imgid` int(255) NOT NULL AUTO_INCREMENT COMMENT '图片id',
  `path` varchar(255) NOT NULL COMMENT '图片路径',
  `blogid` int(255) NOT NULL COMMENT '博客id',
  PRIMARY KEY (`imgid`),
  KEY `c1` (`blogid`),
  CONSTRAINT `c1` FOREIGN KEY (`blogid`) REFERENCES `blog` (`blogid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of image
-- ----------------------------

-- ----------------------------
-- Table structure for `introduce`
-- ----------------------------
DROP TABLE IF EXISTS `introduce`;
CREATE TABLE `introduce` (
  `introduceid` int(11) NOT NULL AUTO_INCREMENT COMMENT '介绍id',
  `content` text NOT NULL COMMENT '内容',
  PRIMARY KEY (`introduceid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of introduce
-- ----------------------------

-- ----------------------------
-- Table structure for `tag`
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag` (
  `tagid` int(11) NOT NULL AUTO_INCREMENT COMMENT '博客标签id',
  `tagname` varchar(255) NOT NULL COMMENT '标签名',
  PRIMARY KEY (`tagid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tag
-- ----------------------------

-- ----------------------------
-- Table structure for `tag_blog`
-- ----------------------------
DROP TABLE IF EXISTS `tag_blog`;
CREATE TABLE `tag_blog` (
  `tagid` int(11) NOT NULL COMMENT '标签id',
  `blogid` int(255) NOT NULL COMMENT '博客id',
  PRIMARY KEY (`tagid`),
  KEY `c2` (`blogid`),
  CONSTRAINT `c2` FOREIGN KEY (`blogid`) REFERENCES `blog` (`blogid`),
  CONSTRAINT `c3` FOREIGN KEY (`tagid`) REFERENCES `tag` (`tagid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tag_blog
-- ----------------------------
