package com.service;

import com.model.BookInfo;
import com.model.Login;
import com.model.TeacherInfo;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface BookInfoService {
    List<BookInfo> getAllBookInfo();

    BookInfo getBookInfoById(String id);

    BookInfo getBookInfoByMinId();

    BookInfo getBookInfoByMaxId();

    BookInfo getBookInfoByName(String name);

    List<BookInfo> getBookInfoByParam(BookInfo record);

    List<BookInfo> queryBookInfoByParam(BookInfo record);

    List<BookInfo> getBookInfoByCondition(String field, String value);

    List<BookInfo> queryBookInfoByCondition(String field, String value);

    List<BookInfo> getBookInfoFieldsByCondition(String fields, String field, String value);

    List<BookInfo> queryBookInfoFieldsByCondition(String fields, String field, String value);

    List<BookInfo> getBookInfoBySql(String sql);

    List<BookInfo> getBookInfoFieldsBySql(String fields, String sql);

    int insertBookInfo(BookInfo record);

    int setBookInfoById(BookInfo record);

    void delBookInfoById(String id);
}