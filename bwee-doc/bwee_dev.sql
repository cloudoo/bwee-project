/*
Navicat MySQL Data Transfer

Source Server         : 10.79.169.27
Source Server Version : 50531
Source Host           : 10.79.169.27:3306
Source Database       : bwee_dev

Target Server Type    : MYSQL
Target Server Version : 50531
File Encoding         : 65001

Date: 2019-09-27 16:41:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bw_knowledge_topic
-- ----------------------------
DROP TABLE IF EXISTS `bw_knowledge_topic`;
CREATE TABLE `bw_knowledge_topic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `subject` varchar(255) NOT NULL,
  `content` varchar(255) NOT NULL,
  `page_index` varchar(255) DEFAULT NULL,
  `up_tm` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bw_knowledge_topic
-- ----------------------------

-- ----------------------------
-- Table structure for bw_question
-- ----------------------------
DROP TABLE IF EXISTS `bw_question`;
CREATE TABLE `bw_question` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `topic_id` int(11) DEFAULT NULL,
  `content` varchar(255) NOT NULL,
  `source` tinyint(255) NOT NULL,
  `error_count` int(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `up_tm` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bw_question
-- ----------------------------

-- ----------------------------
-- Table structure for bw_test_paper
-- ----------------------------
DROP TABLE IF EXISTS `bw_test_paper`;
CREATE TABLE `bw_test_paper` (
  `id` int(11) NOT NULL,
  `str_dt` timestamp NULL DEFAULT NULL,
  `end_dt` timestamp NULL DEFAULT NULL,
  `score` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bw_test_paper
-- ----------------------------

-- ----------------------------
-- Table structure for bw_test_paper_question
-- ----------------------------
DROP TABLE IF EXISTS `bw_test_paper_question`;
CREATE TABLE `bw_test_paper_question` (
  `id` int(11) NOT NULL,
  `question_id` timestamp NULL DEFAULT NULL,
  `knowledge_id` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bw_test_paper_question
-- ----------------------------
