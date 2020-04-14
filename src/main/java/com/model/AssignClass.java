package com.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 分配班级
 */
public class AssignClass implements Serializable {
    /**
     * 授课ID
     */
    private String acsId;
    /**
     * 授课教师ID
     */
    private String teiId;
    /**
     * 授课班级ID
     */
    private String sciId;
    /**
     * 授课教师信息
     */
    private TeacherInfo teacherInfo;
    /**
     * 授课班级信息
     */
    private SystemClassInfo systemClassInfo;
    /**
     * 教师任职日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date acsRzrq;
    /**
     * 教师离职日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date acsLzrq;

    private static final long serialVersionUID = 1L;

    // Constructors

    /** default constructor */
    public AssignClass() {
    }

    /** minimal constructor */
    public AssignClass(String teiId, String sciId) {
        this.teiId = teiId;
        this.sciId = sciId;
    }

    public AssignClass(String acsId, String teiId, String sciId) {
        this.acsId = acsId;
        this.teiId = teiId;
        this.sciId = sciId;
    }

    public AssignClass(TeacherInfo teacherInfo, SystemClassInfo systemClassInfo) {
        this.teacherInfo = teacherInfo;
        this.systemClassInfo = systemClassInfo;
    }

    public AssignClass(String acsId, TeacherInfo teacherInfo, SystemClassInfo systemClassInfo) {
        this.acsId = acsId;
        this.teacherInfo = teacherInfo;
        this.systemClassInfo = systemClassInfo;
    }

    /** full constructor */
    public AssignClass(String acsId, String teiId, String sciId, Date acsRzrq, Date acsLzrq) {
        this.acsId = acsId;
        this.teiId = teiId;
        this.sciId = sciId;
        this.acsRzrq = acsRzrq;
        this.acsLzrq = acsLzrq;
    }

    public AssignClass(String acsId, TeacherInfo teacherInfo, SystemClassInfo systemClassInfo, Date acsRzrq, Date acsLzrq) {
        this.acsId = acsId;
        this.teacherInfo = teacherInfo;
        this.systemClassInfo = systemClassInfo;
        this.teiId = teacherInfo.getTeiId();
        this.sciId = systemClassInfo.getSciId();
        this.acsRzrq = acsRzrq;
        this.acsLzrq = acsLzrq;
    }

    public String getAcsId() {
        return acsId;
    }

    public void setAcsId(String acsId) {
        this.acsId = acsId;
    }

    public String getTeiId() {
        return teiId;
    }

    public void setTeiId(String teiId) {
        this.teiId = teiId;
    }

    public String getSciId() {
        return sciId;
    }

    public void setSciId(String sciId) {
        this.sciId = sciId;
    }

    public TeacherInfo getTeacherInfo() {
        return this.teacherInfo;
    }

    public void setTeacherInfo(TeacherInfo teacherInfo) {
        this.teacherInfo = teacherInfo;
    }

    public SystemClassInfo getSystemClassInfo() {
        return this.systemClassInfo;
    }

    public void setSystemClassInfo(SystemClassInfo systemClassInfo) {
        this.systemClassInfo = systemClassInfo;
    }

    public Date getAcsRzrq() {
        return acsRzrq;
    }

    public void setAcsRzrq(Date acsRzrq) {
        this.acsRzrq = acsRzrq;
    }

    public Date getAcsLzrq() {
        return acsLzrq;
    }

    public void setAcsLzrq(Date acsLzrq) {
        this.acsLzrq = acsLzrq;
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
        AssignClass other = (AssignClass) that;
        return (this.getAcsId() == null ? other.getAcsId() == null : this.getAcsId().equals(other.getAcsId()))
            && (this.getTeiId() == null ? other.getTeiId() == null : this.getTeiId().equals(other.getTeiId()))
            && (this.getSciId() == null ? other.getSciId() == null : this.getSciId().equals(other.getSciId()))
            && (this.getTeacherInfo() == null ? other.getTeacherInfo() == null : this.getTeacherInfo().equals(other.getTeacherInfo()))
            && (this.getSystemClassInfo() == null ? other.getSystemClassInfo() == null : this.getSystemClassInfo().equals(other.getSystemClassInfo()))
            && (this.getAcsRzrq() == null ? other.getAcsRzrq() == null : this.getAcsRzrq().equals(other.getAcsRzrq()))
            && (this.getAcsLzrq() == null ? other.getAcsLzrq() == null : this.getAcsLzrq().equals(other.getAcsLzrq()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAcsId() == null) ? 0 : getAcsId().hashCode());
        result = prime * result + ((getTeiId() == null) ? 0 : getTeiId().hashCode());
        result = prime * result + ((getSciId() == null) ? 0 : getSciId().hashCode());
        result = prime * result + ((getTeacherInfo() == null) ? 0 : getTeacherInfo().hashCode());
        result = prime * result + ((getSystemClassInfo() == null) ? 0 : getSystemClassInfo().hashCode());
        result = prime * result + ((getAcsRzrq() == null) ? 0 : getAcsRzrq().hashCode());
        result = prime * result + ((getAcsLzrq() == null) ? 0 : getAcsLzrq().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", acsId=").append(acsId);
        sb.append(", teiId=").append(teiId);
        sb.append(", sciId=").append(sciId);
        sb.append(", teacherInfo=").append(teacherInfo);
        sb.append(", systemClassInfo=").append(systemClassInfo);
        sb.append(", acsRzrq=").append(acsRzrq);
        sb.append(", acsLzrq=").append(acsLzrq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}