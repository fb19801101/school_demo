package com.service;

import com.model.BorrowInfo;
import com.model.Login;
import com.model.TeacherInfo;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface BorrowInfoService {
    List<BorrowInfo> getAllBorrowInfo();

    BorrowInfo getBorrowInfoById(String id);

    BorrowInfo getBorrowInfoByMinId();

    BorrowInfo getBorrowInfoByMaxId();

    BorrowInfo getBorrowInfoByBookId(String id);

    BorrowInfo getBorrowInfoByStudentId(String id);

    BorrowInfo getBorrowInfoByBookName(String name);

    List<BorrowInfo> getBorrowInfoByParam(BorrowInfo record);

    List<BorrowInfo> queryBorrowInfoByParam(BorrowInfo record);

    List<BorrowInfo> getBorrowInfoByCondition(String field, String value);

    List<BorrowInfo> queryBorrowInfoByCondition(String field, String value);

    List<BorrowInfo> getBorrowInfoFieldsByCondition(String fields, String field, String value);

    List<BorrowInfo> queryBorrowInfoFieldsByCondition(String fields, String field, String value);

    List<BorrowInfo> getBorrowInfoBySql(String sql);

    List<BorrowInfo> getBorrowInfoFieldsBySql(String fields, String sql);

    int insertBorrowInfo(BorrowInfo record);

    int setBorrowInfoById(BorrowInfo record);

    void delBorrowInfoById(String id);
}