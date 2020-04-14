package com.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 学生注册信息
 */
public class StudentRegister implements Serializable {
    /**
     * 注册ID
     */
    private String strId;
    /**
     * 班级ID
     */
    private String sciId;
    /**
     * 学生ID
     */
    private String stiId;
    /**
     * 班级信息
     */
    private SystemClassInfo systemClassInfo;
    /**
     * 学生信息
     */
    private StudentInfo studentInfo;
    /**
     * 入学日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date strDjrq;
    /**
     * 经办人
     */
    private String strJbr;
    /**
     * 入学分数
     */
    private Double strLqfs;
    /**
     * 专业名称
     */
    private String strZymc;

    private static final long serialVersionUID = 1L;

    // Constructors

    /** default constructor */
    public StudentRegister() {
    }

    /** minimal constructor */
    public StudentRegister(String strId, String sciId, String stiId) {
        this.strId = strId;
        this.sciId = sciId;
        this.stiId = stiId;
    }

    public StudentRegister(String sciId, String stiId) {
        this.sciId = sciId;
        this.stiId = stiId;
    }

    public StudentRegister(String strId, SystemClassInfo systemClassInfo, StudentInfo studentInfo) {
        this.strId = strId;
        this.systemClassInfo = systemClassInfo;
        this.studentInfo = studentInfo;
        this.sciId = systemClassInfo.getSciId();
        this.stiId = studentInfo.getStiId();
    }

    public StudentRegister(SystemClassInfo systemClassInfo, StudentInfo studentInfo) {
        this.systemClassInfo = systemClassInfo;
        this.studentInfo = studentInfo;
        this.sciId = systemClassInfo.getSciId();
        this.stiId = studentInfo.getStiId();
    }

    /** full constructor */
    public StudentRegister(String strId, String sciId, String stiId, Date strDjrq, String strJbr, double strLqfs, String strZymc) {
        this.strId = strId;
        this.sciId = sciId;
        this.stiId = stiId;
        this.strDjrq = strDjrq;
        this.strJbr = strJbr;
        this.strLqfs = strLqfs;
        this.strZymc = strZymc;
    }

    public StudentRegister(String strId, SystemClassInfo systemClassInfo, StudentInfo studentInfo, Date strDjrq, String strJbr, double strLqfs, String strZymc) {
        this.strId = strId;
        this.systemClassInfo = systemClassInfo;
        this.studentInfo = studentInfo;
        this.sciId = systemClassInfo.getSciId();
        this.stiId = studentInfo.getStiId();
        this.strDjrq = strDjrq;
        this.strJbr = strJbr;
        this.strLqfs = strLqfs;
        this.strZymc = strZymc;
    }

    public String getStrId() {
        return strId;
    }

    public void setStrId(String strId) {
        this.strId = strId;
    }

    public String getSciId() {
        return sciId;
    }

    public void setSciId(String sciId) {
        this.sciId = sciId;
    }

    public String getStiId() {
        return stiId;
    }

    public void setStiId(String stiId) {
        this.stiId = stiId;
    }

    public SystemClassInfo getSystemClassInfo() {
        return this.systemClassInfo;
    }

    public void setSystemClassInfo(SystemClassInfo systemClassInfo) {
        this.systemClassInfo = systemClassInfo;
        this.sciId = systemClassInfo.getSciId();
    }

    public StudentInfo getStudentInfo() {
        return this.studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
        this.stiId = studentInfo.getStiId();
    }

    public Date getStrDjrq() {
        return strDjrq;
    }

    public void setStrDjrq(Date strDjrq) {
        this.strDjrq = strDjrq;
    }

    public String getStrJbr() {
        return strJbr;
    }

    public void setStrJbr(String strJbr) {
        this.strJbr = strJbr;
    }

    public Double getStrLqfs() {
        return strLqfs;
    }

    public void setStrLqfs(Double strLqfs) {
        this.strLqfs = strLqfs;
    }

    public String getStrZymc() {
        return strZymc;
    }

    public void setStrZymc(String strZymc) {
        this.strZymc = strZymc;
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
        StudentRegister other = (StudentRegister) that;
        return (this.getStrId() == null ? other.getStrId() == null : this.getStrId().equals(other.getStrId()))
            && (this.getSciId() == null ? other.getSciId() == null : this.getSciId().equals(other.getSciId()))
            && (this.getStiId() == null ? other.getStiId() == null : this.getStiId().equals(other.getStiId()))
            && (this.getSystemClassInfo() == null ? other.getSystemClassInfo() == null : this.getSystemClassInfo().equals(other.getSystemClassInfo()))
            && (this.getStudentInfo() == null ? other.getStudentInfo() == null : this.getStudentInfo().equals(other.getStudentInfo()))
            && (this.getStrDjrq() == null ? other.getStrDjrq() == null : this.getStrDjrq().equals(other.getStrDjrq()))
            && (this.getStrJbr() == null ? other.getStrJbr() == null : this.getStrJbr().equals(other.getStrJbr()))
            && (this.getStrLqfs() == null ? other.getStrLqfs() == null : this.getStrLqfs().equals(other.getStrLqfs()))
            && (this.getStrZymc() == null ? other.getStrZymc() == null : this.getStrZymc().equals(other.getStrZymc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStrId() == null) ? 0 : getStrId().hashCode());
        result = prime * result + ((getSciId() == null) ? 0 : getSciId().hashCode());
        result = prime * result + ((getStiId() == null) ? 0 : getStiId().hashCode());
        result = prime * result + ((getSystemClassInfo() == null) ? 0 : getSystemClassInfo().hashCode());
        result = prime * result + ((getStudentInfo() == null) ? 0 : getStudentInfo().hashCode());
        result = prime * result + ((getStrDjrq() == null) ? 0 : getStrDjrq().hashCode());
        result = prime * result + ((getStrJbr() == null) ? 0 : getStrJbr().hashCode());
        result = prime * result + ((getStrLqfs() == null) ? 0 : getStrLqfs().hashCode());
        result = prime * result + ((getStrZymc() == null) ? 0 : getStrZymc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", strId=").append(strId);
        sb.append(", sciId=").append(sciId);
        sb.append(", stiId=").append(stiId);
        sb.append(", systemClassInfo=").append(systemClassInfo);
        sb.append(", studentInfo=").append(studentInfo);
        sb.append(", strDjrq=").append(strDjrq);
        sb.append(", strJbr=").append(strJbr);
        sb.append(", strLqfs=").append(strLqfs);
        sb.append(", strZymc=").append(strZymc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}