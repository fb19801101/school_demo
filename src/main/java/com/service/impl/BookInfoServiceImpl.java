package com.service.impl;

import com.mapper.BookInfoMapper;
import com.model.BookInfo;
import com.model.StudentInfo;
import com.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:11
 */
@Service
public class BookInfoServiceImpl implements BookInfoService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

    @Override
    public List<BookInfo> getAllBookInfo() {
        return bookInfoMapper.selectAllModel();
    }

    @Override
    public BookInfo getBookInfoById(String id) {
        return bookInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public BookInfo getBookInfoByMinId() {
        return bookInfoMapper.selectByMinPrimaryKey();
    }

    @Override
    public BookInfo getBookInfoByMaxId() {
        return bookInfoMapper.selectByMaxPrimaryKey();
    }

    @Override
    public BookInfo getBookInfoByName(String name) {
        return bookInfoMapper.selectByName(name);
    }

    @Override
    public List<BookInfo> getBookInfoByParam(BookInfo record) {
        return bookInfoMapper.selectByParam(record);
    }

    @Override
    public List<BookInfo> queryBookInfoByParam(BookInfo record) {
        return bookInfoMapper.queryByParam(record);
    }

    @Override
    public List<BookInfo> getBookInfoByCondition(String field, String value) {
        return bookInfoMapper.selectByCondition(field,value);
    }

    @Override
    public List<BookInfo> queryBookInfoByCondition(String field, String value) {
        return bookInfoMapper.queryByCondition(field,value);
    }

    @Override
    public List<BookInfo> getBookInfoFieldsByCondition(String fields, String field, String value) {
        return bookInfoMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<BookInfo> queryBookInfoFieldsByCondition(String fields, String field, String value) {
        return bookInfoMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<BookInfo> getBookInfoBySql(String sql) {
        return bookInfoMapper.selectBySql(sql);
    }

    @Override
    public List<BookInfo> getBookInfoFieldsBySql(String field, String sql) {
        return bookInfoMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertBookInfo(BookInfo record) {
        return bookInfoMapper.insert(record);
    }

    @Override
    public int setBookInfoById(BookInfo record) {
        return bookInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public void delBookInfoById(String id) {
        bookInfoMapper.deleteByPrimaryKey(id);
    }
}