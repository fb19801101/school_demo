package com.service.impl;

import com.mapper.BorrowInfoMapper;
import com.model.BorrowInfo;
import com.model.StudentInfo;
import com.service.BorrowInfoService;
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
public class BorrowInfoServiceImpl implements BorrowInfoService {

    @Autowired
    private BorrowInfoMapper borrowInfoMapper;

    @Override
    public List<BorrowInfo> getAllBorrowInfo() {
        return borrowInfoMapper.selectAllModel();
    }

    @Override
    public BorrowInfo getBorrowInfoById(String id) {
        return borrowInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public BorrowInfo getBorrowInfoByMinId() {
        return borrowInfoMapper.selectByMinPrimaryKey();
    }

    @Override
    public BorrowInfo getBorrowInfoByMaxId() {
        return borrowInfoMapper.selectByMaxPrimaryKey();
    }

    @Override
    public BorrowInfo getBorrowInfoByBookId(String id) {
        return borrowInfoMapper.selectByBookId(id);
    }

    @Override
    public BorrowInfo getBorrowInfoByStudentId(String id) {
        return borrowInfoMapper.selectByStudentId(id);
    }

    @Override
    public BorrowInfo getBorrowInfoByBookName(String name) {
        return borrowInfoMapper.selectByBookName(name);
    }

    @Override
    public List<BorrowInfo> getBorrowInfoByParam(BorrowInfo record) {
        return borrowInfoMapper.selectByParam(record);
    }

    @Override
    public List<BorrowInfo> queryBorrowInfoByParam(BorrowInfo record) {
        return borrowInfoMapper.queryByParam(record);
    }

    @Override
    public List<BorrowInfo> getBorrowInfoByCondition(String field, String value) {
        return borrowInfoMapper.selectByCondition(field,value);
    }

    @Override
    public List<BorrowInfo> queryBorrowInfoByCondition(String field, String value) {
        return borrowInfoMapper.queryByCondition(field,value);
    }

    @Override
    public List<BorrowInfo> getBorrowInfoFieldsByCondition(String fields, String field, String value) {
        return borrowInfoMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<BorrowInfo> queryBorrowInfoFieldsByCondition(String fields, String field, String value) {
        return borrowInfoMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<BorrowInfo> getBorrowInfoBySql(String sql) {
        return borrowInfoMapper.selectBySql(sql);
    }

    @Override
    public List<BorrowInfo> getBorrowInfoFieldsBySql(String field, String sql) {
        return borrowInfoMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertBorrowInfo(BorrowInfo record) {
        return borrowInfoMapper.insert(record);
    }

    @Override
    public int setBorrowInfoById(BorrowInfo record) {
        return borrowInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public void delBorrowInfoById(String id) {
        borrowInfoMapper.deleteByPrimaryKey(id);
    }
}