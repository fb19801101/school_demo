package com.service;

import com.model.AssignClass;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface AssignClassService {
    List<AssignClass> getAllAssignClass();

    AssignClass getAssignClassById(String id);

    AssignClass getAssignClassByMinId();

    AssignClass getAssignClassByMaxId();

    AssignClass getAssignClassByTeacherId(String id);

    AssignClass getAssignClassByClassId(String id);

    List<AssignClass> getAssignClassByParam(AssignClass record);

    List<AssignClass> queryAssignClassByParam(AssignClass record);

    List<AssignClass> getAssignClassByCondition(String field, String value);

    List<AssignClass> queryAssignClassByCondition(String field, String value);

    List<AssignClass> getAssignClassFieldsByCondition(String fields, String field, String value);

    List<AssignClass> queryAssignClassFieldsByCondition(String fields, String field, String value);

    List<AssignClass> getAssignClassBySql(String sql);

    List<AssignClass> getAssignClassFieldsBySql(String fields, String sql);

    int insertAssignClass(AssignClass record);

    int setAssignClassById(AssignClass record);

    void delAssignClassById(String id);
}