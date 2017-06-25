/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : bbs

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2017-06-25 18:28:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `artic`
-- ----------------------------
DROP TABLE IF EXISTS `artic`;
CREATE TABLE `artic` (
  `id` tinyint(3) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(500) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of artic
-- ----------------------------
