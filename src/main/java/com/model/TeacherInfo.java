package com.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 * @author 
 * 教师信息
 */
public class TeacherInfo implements Serializable {
    /**
     * 教师ID
     */
    private String teiId;
    /**
     * 专业编码
     */
    private String sscCode;
    /**
     * 专业信息
     */
    private SystemSpecialtyCode systemSpecialtyCode;
    /**
     * 姓名
     */
    private String teiName;
    /**
     * 性别
     */
    private String teiSex;
    /**
     * 年龄
     */
    private Integer teiAge;
    /**
     * 民族
     */
    private String teiMinzu;
    /**
     * 政治面貌
     */
    private String teiZzmm;
    /**
     * 学历
     */
    private String teiXueli;
    /**
     * 婚否
     */
    private String teiHunfou;
    /**
     * 出生日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date teiCsrq;
    /**
     * 身份证号
     */
    private String teiSfzh;
    /**
     * 联系电话
     */
    private String teiLxdh;
    /**
     * 工作日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date teiGzrq;
    /**
     * 工作简介
     */
    private String teiGzjj;
    /**
     * 授课课程
     */
    private List<AssignCourse> assignCourses = new ArrayList<AssignCourse>();
    /**
     * 授课班级
     */
    private List<AssignClass> assignClass = new ArrayList<AssignClass>();

    private static final long serialVersionUID = 1L;

    // Constructors

    /** default constructor */
    public TeacherInfo() {
    }

    /** minimal constructor */
    public TeacherInfo(String teiId, String sscCode) {
        this.teiId = teiId;
        this.sscCode = sscCode;
    }

    public TeacherInfo(String teiId, SystemSpecialtyCode systemSpecialtyCode) {
        this.teiId = teiId;
        this.systemSpecialtyCode = systemSpecialtyCode;
    }

    /** full constructor */
    public TeacherInfo(String teiId, String sscCode, String teiName, String teiSex, Integer teiAge, String teiMinzu, String teiZzmm, String teiXueli, String teiHunfou, Date teiCsrq, String teiSfzh, String teiLxdh, Date teiGzrq, String teiGzjj) {
        this.teiId = teiId;
        this.sscCode = sscCode;
        this.teiName = teiName;
        this.teiSex = teiSex;
        this.teiAge = teiAge;
        this.teiMinzu = teiMinzu;
        this.teiZzmm = teiZzmm;
        this.teiXueli = teiXueli;
        this.teiHunfou = teiHunfou;
        this.teiCsrq = teiCsrq;
        this.teiSfzh = teiSfzh;
        this.teiLxdh = teiLxdh;
        this.teiGzrq = teiGzrq;
        this.teiGzjj = teiGzjj;
    }

    public TeacherInfo(String teiId, String sscCode, String teiName, String teiSex, Integer teiAge, String teiMinzu, String teiZzmm, String teiXueli, String teiHunfou, Date teiCsrq, String teiSfzh, String teiLxdh, Date teiGzrq, String teiGzjj, List<AssignCourse> assignCourses, List<AssignClass> assignClass) {
        this.teiId = teiId;
        this.sscCode = sscCode;
        this.teiName = teiName;
        this.teiSex = teiSex;
        this.teiAge = teiAge;
        this.teiMinzu = teiMinzu;
        this.teiZzmm = teiZzmm;
        this.teiXueli = teiXueli;
        this.teiHunfou = teiHunfou;
        this.teiCsrq = teiCsrq;
        this.teiSfzh = teiSfzh;
        this.teiLxdh = teiLxdh;
        this.teiGzrq = teiGzrq;
        this.teiGzjj = teiGzjj;
        this.assignCourses = assignCourses;
        this.assignClass = assignClass;
    }

    public TeacherInfo(String teiId, SystemSpecialtyCode systemSpecialtyCode, String teiName, String teiSex, Integer teiAge, String teiMinzu, String teiZzmm, String teiXueli, String teiHunfou, java.sql.Date teiCsrq, String teiSfzh, String teiLxdh, java.sql.Date teiGzrq, String teiGzjj, List<AssignCourse> assignCourses, List<AssignClass> assignClass) {
            this.teiId = teiId;
            this.systemSpecialtyCode = systemSpecialtyCode;
            this.teiName = teiName;
            this.teiSex = teiSex;
            this.teiAge = teiAge;
            this.teiMinzu = teiMinzu;
            this.teiZzmm = teiZzmm;
            this.teiXueli = teiXueli;
            this.teiHunfou = teiHunfou;
            this.teiCsrq = teiCsrq;
            this.teiSfzh = teiSfzh;
            this.teiLxdh = teiLxdh;
            this.teiGzrq = teiGzrq;
            this.teiGzjj = teiGzjj;
            this.assignCourses = assignCourses;
            this.assignClass = assignClass;
        }

    public String getTeiId() {
        return teiId;
    }

    public void setTeiId(String teiId) {
        this.teiId = teiId;
    }

    public String getSscCode() {
        return sscCode;
    }

    public void setSscCode(String sscCode) {
        this.sscCode = sscCode;
    }

    public SystemSpecialtyCode getSystemSpecialtyCode() {
        return this.systemSpecialtyCode;
    }

    public void setSystemSpecialtyCode(SystemSpecialtyCode systemSpecialtyCode) {
        this.systemSpecialtyCode = systemSpecialtyCode;
    }

    public String getTeiName() {
        return teiName;
    }

    public void setTeiName(String teiName) {
        this.teiName = teiName;
    }

    public String getTeiSex() {
        return teiSex;
    }

    public void setTeiSex(String teiSex) {
        this.teiSex = teiSex;
    }

    public Integer getTeiAge() {
        return teiAge;
    }

    public void setTeiAge(Integer teiAge) {
        this.teiAge = teiAge;
    }

    public String getTeiMinzu() {
        return teiMinzu;
    }

    public void setTeiMinzu(String teiMinzu) {
        this.teiMinzu = teiMinzu;
    }

    public String getTeiZzmm() {
        return teiZzmm;
    }

    public void setTeiZzmm(String teiZzmm) {
        this.teiZzmm = teiZzmm;
    }

    public String getTeiXueli() {
        return teiXueli;
    }

    public void setTeiXueli(String teiXueli) {
        this.teiXueli = teiXueli;
    }

    public String getTeiHunfou() {
        return teiHunfou;
    }

    public void setTeiHunfou(String teiHunfou) {
        this.teiHunfou = teiHunfou;
    }

    public Date getTeiCsrq() {
        return teiCsrq;
    }

    public void setTeiCsrq(Date teiCsrq) {
        this.teiCsrq = teiCsrq;
    }

    public String getTeiSfzh() {
        return teiSfzh;
    }

    public void setTeiSfzh(String teiSfzh) {
        this.teiSfzh = teiSfzh;
    }

    public String getTeiLxdh() {
        return teiLxdh;
    }

    public void setTeiLxdh(String teiLxdh) {
        this.teiLxdh = teiLxdh;
    }

    public Date getTeiGzrq() {
        return teiGzrq;
    }

    public void setTeiGzrq(Date teiGzrq) {
        this.teiGzrq = teiGzrq;
    }

    public String getTeiGzjj() {
        return teiGzjj;
    }

    public void setTeiGzjj(String teiGzjj) {
        this.teiGzjj = teiGzjj;
    }

    public List<AssignCourse> getAssignCourses() {
        return this.assignCourses;
    }

    public void setAssignCourses(List<AssignCourse> assignCourses) {
        this.assignCourses = assignCourses;
    }

    public List<AssignClass> getAssignClass() {
        return this.assignClass;
    }

    public void setAssignClass(List<AssignClass> assignClass) {
        this.assignClass = assignClass;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TeacherInfo other = (TeacherInfo) that;
        return (this.getTeiId() == null ? other.getTeiId() == null : this.getTeiId().equals(other.getTeiId()))
            && (this.getSscCode() == null ? other.getSscCode() == null : this.getSscCode().equals(other.getSscCode()))
            && (this.getSystemSpecialtyCode() == null ? other.getSystemSpecialtyCode() == null : this.getSystemSpecialtyCode().equals(other.getSystemSpecialtyCode()))
            && (this.getTeiName() == null ? other.getTeiName() == null : this.getTeiName().equals(other.getTeiName()))
            && (this.getTeiSex() == null ? other.getTeiSex() == null : this.getTeiSex().equals(other.getTeiSex()))
            && (this.getTeiAge() == null ? other.getTeiAge() == null : this.getTeiAge().equals(other.getTeiAge()))
            && (this.getTeiMinzu() == null ? other.getTeiMinzu() == null : this.getTeiMinzu().equals(other.getTeiMinzu()))
            && (this.getTeiZzmm() == null ? other.getTeiZzmm() == null : this.getTeiZzmm().equals(other.getTeiZzmm()))
            && (this.getTeiXueli() == null ? other.getTeiXueli() == null : this.getTeiXueli().equals(other.getTeiXueli()))
            && (this.getTeiHunfou() == null ? other.getTeiHunfou() == null : this.getTeiHunfou().equals(other.getTeiHunfou()))
            && (this.getTeiCsrq() == null ? other.getTeiCsrq() == null : this.getTeiCsrq().equals(other.getTeiCsrq()))
            && (this.getTeiSfzh() == null ? other.getTeiSfzh() == null : this.getTeiSfzh().equals(other.getTeiSfzh()))
            && (this.getTeiLxdh() == null ? other.getTeiLxdh() == null : this.getTeiLxdh().equals(other.getTeiLxdh()))
            && (this.getTeiGzrq() == null ? other.getTeiGzrq() == null : this.getTeiGzrq().equals(other.getTeiGzrq()))
            && (this.getTeiGzjj() == null ? other.getTeiGzjj() == null : this.getTeiGzjj().equals(other.getTeiGzjj()))
            && (this.getAssignCourses() == null ? other.getAssignCourses() == null : this.getAssignCourses().equals(other.getAssignCourses()))
            && (this.getAssignClass() == null ? other.getAssignClass() == null : this.getAssignClass().equals(other.getAssignClass()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTeiId() == null) ? 0 : getTeiId().hashCode());
        result = prime * result + ((getSscCode() == null) ? 0 : getSscCode().hashCode());
        result = prime * result + ((getSystemSpecialtyCode() == null) ? 0 : getSystemSpecialtyCode().hashCode());
        result = prime * result + ((getTeiName() == null) ? 0 : getTeiName().hashCode());
        result = prime * result + ((getTeiSex() == null) ? 0 : getTeiSex().hashCode());
        result = prime * result + ((getTeiAge() == null) ? 0 : getTeiAge().hashCode());
        result = prime * result + ((getTeiMinzu() == null) ? 0 : getTeiMinzu().hashCode());
        result = prime * result + ((getTeiZzmm() == null) ? 0 : getTeiZzmm().hashCode());
        result = prime * result + ((getTeiXueli() == null) ? 0 : getTeiXueli().hashCode());
        result = prime * result + ((getTeiHunfou() == null) ? 0 : getTeiHunfou().hashCode());
        result = prime * result + ((getTeiCsrq() == null) ? 0 : getTeiCsrq().hashCode());
        result = prime * result + ((getTeiSfzh() == null) ? 0 : getTeiSfzh().hashCode());
        result = prime * result + ((getTeiLxdh() == null) ? 0 : getTeiLxdh().hashCode());
        result = prime * result + ((getTeiGzrq() == null) ? 0 : getTeiGzrq().hashCode());
        result = prime * result + ((getTeiGzjj() == null) ? 0 : getTeiGzjj().hashCode());
        result = prime * result + ((getAssignCourses() == null) ? 0 : getAssignCourses().hashCode());
        result = prime * result + ((getAssignClass() == null) ? 0 : getAssignClass().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teiId=").append(teiId);
        sb.append(", sscCode=").append(sscCode);
        sb.append(", systemSpecialtyCode=").append(systemSpecialtyCode);
        sb.append(", teiName=").append(teiName);
        sb.append(", teiSex=").append(teiSex);
        sb.append(", teiAge=").append(teiAge);
        sb.append(", teiMinzu=").append(teiMinzu);
        sb.append(", teiZzmm=").append(teiZzmm);
        sb.append(", teiXueli=").append(teiXueli);
        sb.append(", teiHunfou=").append(teiHunfou);
        sb.append(", teiCsrq=").append(teiCsrq);
        sb.append(", teiSfzh=").append(teiSfzh);
        sb.append(", teiLxdh=").append(teiLxdh);
        sb.append(", teiGzrq=").append(teiGzrq);
        sb.append(", teiGzjj=").append(teiGzjj);
        sb.append(", assignCourses=").append(assignCourses);
        sb.append(", assignClass=").append(assignClass);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public void setProperties(String field, Object value) {
        if (field.equals("teiId")) {
            teiId = value.toString();
        } else if (field.equals("sscCode")) {
            sscCode = value.toString();
        } else if (field.equals("teiName")) {
            teiName = value.toString();
        } else if (field.equals("teiSex")) {
            teiSex = value.toString();
        } else if (field.equals("teiAge")) {
            teiAge = Integer.parseInt(value.toString());
        } else if (field.equals("teiMinzu")) {
            teiMinzu = value.toString();
        } else if (field.equals("teiZzmm")) {
            teiZzmm = value.toString();
        } else if (field.equals("teiXueli")) {
            teiXueli = value.toString();
        } else if (field.equals("teiHunfou")) {
            teiHunfou = value.toString();
        } else if (field.equals("teiCsrq")) {
            try {
                if(null != value){//2016-11-05 11_43-50
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date dt = sdf.parse(value.toString());
                    teiCsrq = new Date(dt.getTime());
                }
            } catch (Exception e) {}
        } else if (field.equals("teiSfzh")) {
            teiSfzh = value.toString();
        } else if (field.equals("teiLxdh")) {
            teiLxdh = value.toString();
        } else if (field.equals("teiGzrq")) {
            try {
                if(null != value){//2016-11-05 11_43-50
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date dt = sdf.parse(value.toString());
                    teiGzrq = new Date(dt.getTime());
                }
            } catch (Exception e) {}
        } else if (field.equals("teiGzjj")) {
            teiGzjj = value.toString();
        }
    }
}