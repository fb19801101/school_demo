/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : db_webapp

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 26/03/2020 09:37:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_student
-- ----------------------------
DROP TABLE IF EXISTS `tb_student`;
CREATE TABLE `tb_student`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_pwd` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_sex` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_birth` datetime(0) NULL DEFAULT NULL,
  `user_class` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `date_create` datetime(0) NOT NULL,
  `date_update` datetime(0) NOT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_birthday` datetime(0) NOT NULL,
  PRIMARY KEY (`id`, `user_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_student
-- ----------------------------
INSERT INTO `tb_student` VALUES (1, '108', '曾华', '1313445', '男', '1977-09-01 00:00:00', '95033', '2017-09-17 18:09:51', '2017-09-17 18:09:51', '', '0000-00-00 00:00:00');
INSERT INTO `tb_student` VALUES (2, '105', '匡明', 'dad363', '男', '1975-10-02 00:00:00', '95031', '2017-09-17 18:10:29', '2017-09-17 18:10:29', '', '0000-00-00 00:00:00');
INSERT INTO `tb_student` VALUES (3, '107', '王丽', '1d4515', '女', '1976-01-23 00:00:00', '95033', '2017-09-17 18:11:03', '2017-09-17 18:11:03', '', '0000-00-00 00:00:00');
INSERT INTO `tb_student` VALUES (4, '109', '王芳', '146464', '女', '1975-02-10 00:00:00', '95031', '2017-09-17 18:11:40', '2017-09-17 18:11:40', '', '0000-00-00 00:00:00');
INSERT INTO `tb_student` VALUES (5, '101', '李军', '8761367', '男', '1976-02-20 00:00:00', '95033', '2017-09-17 18:12:19', '2017-09-17 18:12:19', '', '0000-00-00 00:00:00');
INSERT INTO `tb_student` VALUES (6, '103', '陆君', 'c1336c1', '男', '1974-06-03 00:00:00', '95031', '2017-09-17 18:12:50', '2017-09-17 18:12:50', '', '0000-00-00 00:00:00');
INSERT INTO `tb_student` VALUES (7, '110', '李晓明', '313deq', '男', '1979-06-03 00:00:00', '95035', '2017-09-17 18:12:50', '2017-09-17 18:12:50', '', '0000-00-00 00:00:00');
INSERT INTO `tb_student` VALUES (8, '113', '杜玉萍', '6498fr', '女', '1980-06-03 00:00:00', '95035', '2017-09-17 18:12:50', '2017-09-17 18:12:50', '', '0000-00-00 00:00:00');
INSERT INTO `tb_student` VALUES (9, '100', 'admin', '123456', '男', '2020-02-19 09:24:10', '95000', '2020-02-05 09:24:17', '2020-02-27 09:24:19', '', '0000-00-00 00:00:00');
INSERT INTO `tb_student` VALUES (10, '101', 'jsp', '123', '女', '2020-02-05 09:24:35', '95001', '2020-02-05 09:24:41', '2020-02-20 09:24:43', '', '0000-00-00 00:00:00');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 'admin', '123456');
INSERT INTO `tb_user` VALUES (2, 'jsp', '123');

-- ----------------------------
-- View structure for tv_student
-- ----------------------------
DROP VIEW IF EXISTS `tv_student`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `tv_student` AS select `tb_student`.`id` AS `序号`,`tb_student`.`user_no` AS `学号`,`tb_student`.`user_name` AS `姓名`,`tb_student`.`user_pwd` AS `密码`,`tb_student`.`user_sex` AS `性别`,`tb_student`.`user_birth` AS `生日`,`tb_student`.`user_class` AS `班级`,`tb_student`.`date_create` AS `创建时间`,`tb_student`.`date_update` AS `更新时间` from `tb_student`;

-- ----------------------------
-- View structure for tv_user
-- ----------------------------
DROP VIEW IF EXISTS `tv_user`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `tv_user` AS select `tb_user`.`id` AS `序号`,`tb_user`.`username` AS `用户名称`,`tb_user`.`password` AS `用户密码` from `tb_user`;

SET FOREIGN_KEY_CHECKS = 1;
