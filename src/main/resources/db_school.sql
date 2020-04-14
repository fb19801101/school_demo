/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : db_school

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 26/03/2020 09:37:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_assign_class
-- ----------------------------
DROP TABLE IF EXISTS `tb_assign_class`;
CREATE TABLE `tb_assign_class`  (
  `acs_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tei_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sci_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `acs_rzrq` datetime(0) NULL DEFAULT NULL,
  `acs_lzrq` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`acs_id`) USING BTREE,
  INDEX `assignclass_foreign_key_teacher`(`tei_id`) USING BTREE,
  INDEX `assignclass_foreign_key_class`(`sci_id`) USING BTREE,
  CONSTRAINT `assignclass_foreign_key_class` FOREIGN KEY (`sci_id`) REFERENCES `tb_system_class_info` (`sci_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `assignclass_foreign_key_teacher` FOREIGN KEY (`tei_id`) REFERENCES `tb_teacher_info` (`tei_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_assign_class
-- ----------------------------
INSERT INTO `tb_assign_class` VALUES ('ACS001', 'TEI001', 'SCI001', '2020-03-25 14:14:46', '2020-03-27 14:14:48');
INSERT INTO `tb_assign_class` VALUES ('ACS002', 'TEI002', 'SCI002', '2020-03-25 14:14:46', '2020-03-27 14:14:48');
INSERT INTO `tb_assign_class` VALUES ('ACS003', 'TEI003', 'SCI003', '2020-03-25 14:14:46', '2020-03-27 14:14:48');

-- ----------------------------
-- Table structure for tb_assign_course
-- ----------------------------
DROP TABLE IF EXISTS `tb_assign_course`;
CREATE TABLE `tb_assign_course`  (
  `ace_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tei_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `scc_code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ace_rzrq` datetime(0) NULL DEFAULT NULL,
  `ace_lzrq` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`ace_id`) USING BTREE,
  INDEX `assigncourse_foreign_key_teacher`(`tei_id`) USING BTREE,
  INDEX `assigncourse_foreign_key_coursecode`(`scc_code`) USING BTREE,
  CONSTRAINT `assigncourse_foreign_key_coursecode` FOREIGN KEY (`scc_code`) REFERENCES `tb_system_course_code` (`scc_code`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `assigncourse_foreign_key_teacher` FOREIGN KEY (`tei_id`) REFERENCES `tb_teacher_info` (`tei_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_assign_course
-- ----------------------------
INSERT INTO `tb_assign_course` VALUES ('ACE001', 'TEI001', 'SCC001', '2020-03-10 14:15:29', '2020-04-02 14:15:33');
INSERT INTO `tb_assign_course` VALUES ('ACE002', 'TEI002', 'SCC002', '2020-03-10 14:15:29', '2020-04-02 14:15:33');
INSERT INTO `tb_assign_course` VALUES ('ACE003', 'TEI003', 'SCC003', '2020-03-10 14:15:29', '2020-04-02 14:15:33');

-- ----------------------------
-- Table structure for tb_book_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_book_info`;
CREATE TABLE `tb_book_info`  (
  `bki_id` varchar(13) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `bki_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `bki_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `bki_writer` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `bki_concern` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `bki_publish_date` datetime(0) NULL DEFAULT NULL,
  `bki_price` double NULL DEFAULT NULL,
  `bki_register_date` datetime(0) NULL DEFAULT NULL,
  `bki_count` int(11) NULL DEFAULT NULL,
  `bki_czy` varchar(13) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `bki_remark` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`bki_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_book_info
-- ----------------------------
INSERT INTO `tb_book_info` VALUES ('BKI001', '钢铁是怎样炼成的', '文学', '张三', '外国文学', '2020-03-05 13:22:49', 96.5, '2020-03-12 13:22:54', 10, '方波', '库存');
INSERT INTO `tb_book_info` VALUES ('BKI002', '我的第一本C++', '开发', '王思', '学习C++', '2020-03-05 13:22:49', 50, '2020-03-12 13:22:54', 10, '方波', '库存');
INSERT INTO `tb_book_info` VALUES ('BKI003', 'Java从入门到精通', '开发', '刘涛', '学习JAVA', '2020-03-05 13:22:49', 105, '2020-03-12 13:22:54', 10, '方波', '库存');

-- ----------------------------
-- Table structure for tb_borrow_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_borrow_info`;
CREATE TABLE `tb_borrow_info`  (
  `bwi_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `bki_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sti_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `bwi_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `bwi_price` double NULL DEFAULT NULL,
  `bwi_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `bwi_borrow_date` datetime(0) NULL DEFAULT NULL,
  `bwi_count` int(11) NULL DEFAULT NULL,
  `bwi_return_date` datetime(0) NULL DEFAULT NULL,
  `bwi_czy` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`bwi_id`) USING BTREE,
  INDEX `borrow_foreign_key_book`(`bki_id`) USING BTREE,
  INDEX `borrow_foreign_key_student`(`sti_id`) USING BTREE,
  CONSTRAINT `borrow_foreign_key_book` FOREIGN KEY (`bki_id`) REFERENCES `tb_book_info` (`bki_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `borrow_foreign_key_student` FOREIGN KEY (`sti_id`) REFERENCES `tb_student_info` (`sti_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_borrow_info
-- ----------------------------
INSERT INTO `tb_borrow_info` VALUES ('BWI001', 'BKI001', 'STI001', '钢铁是怎样炼成的', 96.5, '文学', '2020-03-11 13:24:20', 1, '2020-03-10 13:24:24', '张三');
INSERT INTO `tb_borrow_info` VALUES ('BWI002', 'BKI002', 'STI002', '我的第一本C++', 50, '开发', '2020-03-11 13:24:20', 1, '2020-03-10 13:24:24', '张三');
INSERT INTO `tb_borrow_info` VALUES ('BWI003', 'BKI003', 'STI003', 'Java从入门到精通', 105, '开发', '2020-03-10 14:46:16', 1, '2020-03-11 14:46:24', '张三');

-- ----------------------------
-- Table structure for tb_course_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_course_info`;
CREATE TABLE `tb_course_info`  (
  `csi_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `scc_code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sti_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `csi_grade` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `csi_exam_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `csi_exam_date` datetime(0) NULL DEFAULT NULL,
  `csi_czy` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`csi_id`) USING BTREE,
  INDEX `course_foreign_key_student`(`sti_id`) USING BTREE,
  INDEX `course_foreign_key_coursecode`(`scc_code`) USING BTREE,
  CONSTRAINT `course_foreign_key_coursecode` FOREIGN KEY (`scc_code`) REFERENCES `tb_system_course_code` (`scc_code`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `course_foreign_key_student` FOREIGN KEY (`sti_id`) REFERENCES `tb_student_info` (`sti_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_course_info
-- ----------------------------
INSERT INTO `tb_course_info` VALUES ('CSI001', 'SCC001', 'STI001', '一年级', '中考', '2020-03-18 14:11:07', '张三');
INSERT INTO `tb_course_info` VALUES ('CSI002', 'SCC002', 'STI002', '二年级', '统考', '2020-03-18 14:11:07', '张三');
INSERT INTO `tb_course_info` VALUES ('CSI003', 'SCC003', 'STI003', '三年级', '月考', '2020-03-18 14:11:07', '张三');

-- ----------------------------
-- Table structure for tb_login
-- ----------------------------
DROP TABLE IF EXISTS `tb_login`;
CREATE TABLE `tb_login`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_login
-- ----------------------------
INSERT INTO `tb_login` VALUES (1, '管理员', 'admin', '123456');
INSERT INTO `tb_login` VALUES (2, '测试员', 'jsp', '123');
INSERT INTO `tb_login` VALUES (3, '测试', 'test', '123');

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
  PRIMARY KEY (`id`, `user_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_student
-- ----------------------------
INSERT INTO `tb_student` VALUES (1, '108', '曾华', '1313445', '男', '1977-09-01 00:00:00', '95033', '2017-09-17 18:09:51', '2017-09-17 18:09:51');
INSERT INTO `tb_student` VALUES (2, '105', '匡明', 'dad363', '男', '1975-10-02 00:00:00', '95031', '2017-09-17 18:10:29', '2017-09-17 18:10:29');
INSERT INTO `tb_student` VALUES (3, '107', '王丽', '1d4515', '女', '1976-01-23 00:00:00', '95033', '2017-09-17 18:11:03', '2017-09-17 18:11:03');
INSERT INTO `tb_student` VALUES (4, '109', '王芳', '146464', '女', '1975-02-10 00:00:00', '95031', '2017-09-17 18:11:40', '2017-09-17 18:11:40');
INSERT INTO `tb_student` VALUES (5, '101', '李军', '8761367', '男', '1976-02-20 00:00:00', '95033', '2017-09-17 18:12:19', '2017-09-17 18:12:19');
INSERT INTO `tb_student` VALUES (6, '103', '陆君', 'c1336c1', '男', '1974-06-03 00:00:00', '95031', '2017-09-17 18:12:50', '2017-09-17 18:12:50');
INSERT INTO `tb_student` VALUES (7, '110', '李晓明', '313deq', '男', '1979-06-03 00:00:00', '95035', '2017-09-17 18:12:50', '2017-09-17 18:12:50');
INSERT INTO `tb_student` VALUES (8, '113', '杜玉萍', '6498fr', '女', '1980-06-03 00:00:00', '95035', '2017-09-17 18:12:50', '2017-09-17 18:12:50');

-- ----------------------------
-- Table structure for tb_student_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_student_info`;
CREATE TABLE `tb_student_info`  (
  `sti_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sti_name` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sti_sex` varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sti_age` int(11) NULL DEFAULT NULL,
  `sti_sfzh` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sti_csrq` datetime(0) NULL DEFAULT NULL,
  `sti_zzmm` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sti_jtdh` varchar(13) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sti_jtdz` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sti_jkzk` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sti_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_student_info
-- ----------------------------
INSERT INTO `tb_student_info` VALUES (',', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tb_student_info` VALUES ('STI001', '梁咏琪', '女', 20, '610125199999992211', '2020-03-24 13:17:46', '党员', '17777777777', '陕西西安', '良好');
INSERT INTO `tb_student_info` VALUES ('STI002', '古天乐', '男', 20, '610125199999992211', '2020-03-24 13:17:46', '党员', '17777777777', '陕西西安', '良好');
INSERT INTO `tb_student_info` VALUES ('STI003', '张学友', '男', 20, '610125199999992211', '2020-03-24 13:17:46', '党员', '17777777777', '陕西西安', '良好');
INSERT INTO `tb_student_info` VALUES ('STI004', '舒淇', '女', 20, '610125199999992211', '2020-03-24 13:17:46', '党员', '17777777777', '陕西西安', '良好');
INSERT INTO `tb_student_info` VALUES ('STI005', '刘德华', '男', 20, '610125199999992211', '2020-03-24 13:17:46', '党员', '17777777777', '陕西西安', '良好');
INSERT INTO `tb_student_info` VALUES ('STI006', '方波', '男', 40, '610155198011012215', '1980-11-01 00:00:00', '党员', '17791540396', '陕西西安', '优');

-- ----------------------------
-- Table structure for tb_student_register
-- ----------------------------
DROP TABLE IF EXISTS `tb_student_register`;
CREATE TABLE `tb_student_register`  (
  `str_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sci_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sti_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `str_djrq` datetime(0) NULL DEFAULT NULL,
  `str_jbr` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `str_lqfs` double NULL DEFAULT NULL,
  `str_zymc` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`str_id`) USING BTREE,
  INDEX `studentregister_foreign_key_class`(`sci_id`) USING BTREE,
  INDEX `studentregister_foreign_key_student`(`sti_id`) USING BTREE,
  CONSTRAINT `studentregister_foreign_key_class` FOREIGN KEY (`sci_id`) REFERENCES `tb_system_class_info` (`sci_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `studentregister_foreign_key_student` FOREIGN KEY (`sti_id`) REFERENCES `tb_student_info` (`sti_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_student_register
-- ----------------------------
INSERT INTO `tb_student_register` VALUES ('STR001', 'SCI001', 'STI001', '2020-03-04 13:25:44', '离散', 95, '文科');
INSERT INTO `tb_student_register` VALUES ('STR002', 'SCI002', 'STI002', '2020-03-04 13:25:44', '王五', 88, '理科');
INSERT INTO `tb_student_register` VALUES ('STR003', 'SCI003', 'STI003', '2020-03-27 14:26:20', '离散', 100, '艺术');
INSERT INTO `tb_student_register` VALUES ('STR004', 'SCI003', 'STI006', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for tb_system_class_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_system_class_info`;
CREATE TABLE `tb_system_class_info`  (
  `sci_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ssc_code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sgc_code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sci_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sci_id`) USING BTREE,
  INDEX `class_foreign_key_specialty`(`ssc_code`) USING BTREE,
  INDEX `class_foreign_key_grade`(`sgc_code`) USING BTREE,
  CONSTRAINT `class_foreign_key_grade` FOREIGN KEY (`sgc_code`) REFERENCES `tb_system_grade_code` (`sgc_code`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `class_foreign_key_specialty` FOREIGN KEY (`ssc_code`) REFERENCES `tb_system_specialty_code` (`ssc_code`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_system_class_info
-- ----------------------------
INSERT INTO `tb_system_class_info` VALUES ('SCI001', 'SSC001', 'SGC001', '小学一年级一班');
INSERT INTO `tb_system_class_info` VALUES ('SCI002', 'SSC002', 'SGC002', '小学二年级二班');
INSERT INTO `tb_system_class_info` VALUES ('SCI003', 'SSC003', 'SGC003', '小学三年级三班');
INSERT INTO `tb_system_class_info` VALUES ('SCI004', 'SSC004', 'SGC004', '小学四年级一班');
INSERT INTO `tb_system_class_info` VALUES ('SCI005', 'SSC005', 'SGC005', '小学五年级二班');
INSERT INTO `tb_system_class_info` VALUES ('SCI006', 'SSC006', 'SGC006', '小学六年级三班');

-- ----------------------------
-- Table structure for tb_system_course_code
-- ----------------------------
DROP TABLE IF EXISTS `tb_system_course_code`;
CREATE TABLE `tb_system_course_code`  (
  `scc_code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `scc_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`scc_code`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_system_course_code
-- ----------------------------
INSERT INTO `tb_system_course_code` VALUES ('SCC001', '数学');
INSERT INTO `tb_system_course_code` VALUES ('SCC002', '语文');
INSERT INTO `tb_system_course_code` VALUES ('SCC003', '英语');
INSERT INTO `tb_system_course_code` VALUES ('SCC004', '音乐');
INSERT INTO `tb_system_course_code` VALUES ('SCC005', '美术');
INSERT INTO `tb_system_course_code` VALUES ('SCC006', '体育');

-- ----------------------------
-- Table structure for tb_system_grade_code
-- ----------------------------
DROP TABLE IF EXISTS `tb_system_grade_code`;
CREATE TABLE `tb_system_grade_code`  (
  `sgc_code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sgc_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sgc_code`) USING BTREE,
  INDEX `sgc_name`(`sgc_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_system_grade_code
-- ----------------------------
INSERT INTO `tb_system_grade_code` VALUES ('SGC001', '一年级');
INSERT INTO `tb_system_grade_code` VALUES ('SGC003', '三年级');
INSERT INTO `tb_system_grade_code` VALUES ('SGC002', '二年级');
INSERT INTO `tb_system_grade_code` VALUES ('SGC005', '五年级');
INSERT INTO `tb_system_grade_code` VALUES ('SGC006', '六年级');
INSERT INTO `tb_system_grade_code` VALUES ('SGC004', '四年级');

-- ----------------------------
-- Table structure for tb_system_specialty_code
-- ----------------------------
DROP TABLE IF EXISTS `tb_system_specialty_code`;
CREATE TABLE `tb_system_specialty_code`  (
  `ssc_code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ssc_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ssc_code`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_system_specialty_code
-- ----------------------------
INSERT INTO `tb_system_specialty_code` VALUES ('SSC001', '文科');
INSERT INTO `tb_system_specialty_code` VALUES ('SSC002', '理科');
INSERT INTO `tb_system_specialty_code` VALUES ('SSC003', '艺术');
INSERT INTO `tb_system_specialty_code` VALUES ('SSC004', '水利');
INSERT INTO `tb_system_specialty_code` VALUES ('SSC005', '公路');
INSERT INTO `tb_system_specialty_code` VALUES ('SSC006', '铁路');

-- ----------------------------
-- Table structure for tb_teacher_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_teacher_info`;
CREATE TABLE `tb_teacher_info`  (
  `tei_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ssc_code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `tei_name` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `tei_sex` varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `tei_age` int(11) NULL DEFAULT NULL,
  `tei_minzu` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `tei_zzmm` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `tei_xueli` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `tei_hunfou` varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `tei_csrq` datetime(0) NULL DEFAULT NULL,
  `tei_sfzh` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `tei_lxdh` varchar(13) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `tei_gzrq` datetime(0) NULL DEFAULT NULL,
  `tei_gzjj` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`tei_id`) USING BTREE,
  INDEX `teacher_foreign_key_specialty`(`ssc_code`) USING BTREE,
  CONSTRAINT `teacher_foreign_key_specialty` FOREIGN KEY (`ssc_code`) REFERENCES `tb_system_specialty_code` (`ssc_code`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_teacher_info
-- ----------------------------
INSERT INTO `tb_teacher_info` VALUES ('TEI001', 'SSC001', '刘欢', '男', 30, '汉族', '党员', '研究生', '已婚', '2020-03-17 13:20:04', '610111111111111111', '17777777771', '2020-03-24 13:20:44', '数学');
INSERT INTO `tb_teacher_info` VALUES ('TEI002', 'SSC005', '江涛', '男', 30, '汉族', '党员', '研究生', '已婚', '2020-03-17 13:20:04', '610111111111111111', '17777777771', '2020-03-24 13:20:44', '数学');
INSERT INTO `tb_teacher_info` VALUES ('TEI003', 'SSC003', '林青霞', '女', 30, '汉族', '党员', '研究生', '已婚', '2020-03-17 13:20:04', '610111111111111111', '17777777771', '2020-03-24 13:20:44', '数学');
INSERT INTO `tb_teacher_info` VALUES ('TEI004', 'SSC003', '李若彤', '女', 30, '汉族', '党员', '研究生', '已婚', '2020-03-17 13:20:04', '610111111111111111', '17777777771', '2020-03-24 13:20:44', '数学');

-- ----------------------------
-- Triggers structure for table tb_borrow_info
-- ----------------------------
DROP TRIGGER IF EXISTS `tr_borrow_book`;
delimiter ;;
CREATE TRIGGER `tr_borrow_book` BEFORE UPDATE ON `tb_borrow_info` FOR EACH ROW begin

declare bkiName varchar(20) character set utf8;
declare bkiPrice double;
declare bkiType varchar(20) character set utf8;

set bkiName = (select bki_name from tb_book_info where bki_id = new.bki_id);
set bkiPrice = (select bki_price from tb_book_info where bki_id = new.bki_id);
set bkiType = (select bki_type from tb_book_info where bki_id = new.bki_id);

set new.bwi_name=bkiName;
set new.bwi_price=bkiPrice;
set new.bwi_type=bkiType;

end
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table tb_course_info
-- ----------------------------
DROP TRIGGER IF EXISTS `tr_course_grade`;
delimiter ;;
CREATE TRIGGER `tr_course_grade` BEFORE UPDATE ON `tb_course_info` FOR EACH ROW begin

declare sciId varchar(10) character set utf8;
declare sgcCode varchar(10) character set utf8;
declare sgcName varchar(20) character set utf8;

set sciId = (select sci_id from tb_student_register where sti_id = new.sti_id);
set sgcCode = (select sgc_code from tb_system_class_info where sci_id = sciId);
set sgcName = (select sgc_name from tb_system_grade_code where sgc_code = sgcCode);

set new.csi_grade=sgcName;

end
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table tb_student_register
-- ----------------------------
DROP TRIGGER IF EXISTS `tr_student_register_specialty`;
delimiter ;;
CREATE TRIGGER `tr_student_register_specialty` BEFORE UPDATE ON `tb_student_register` FOR EACH ROW begin

declare sscCode varchar(10) character set utf8;
declare sscName varchar(20) character set utf8;

set sscCode = (select ssc_code from tb_system_class_info where sci_id = new.sci_id);
set sscName = (select ssc_name from tb_system_specialty_code where ssc_code = sscCode);


set new.str_zymc=sscName;

end
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
