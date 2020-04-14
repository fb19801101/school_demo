package com.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 课程分配
 */
public class AssignCourse implements Serializable {
    /**
     * 授课ID
     */
    private String aceId;
    /**
     * 授课教师ID
     */
    private String teiId;
    /**
     * 课程编码
     */
    private String sccCode;
    /**
     * 学生信息
     */
    private TeacherInfo teacherInfo;
    /**
     * 课程信息
     */
    private SystemCourseCode systemCourseCode;
    /**
     * 教师任职日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date aceRzrq;
    /**
     * 教师离职日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date aceLzrq;

    private static final long serialVersionUID = 1L;

    // Constructors

    /** default constructor */
    public AssignCourse() {
    }

    /** minimal constructor */
    public AssignCourse(String aceId, String teiId, String sccCode) {
        this.aceId = aceId;
        this.teiId = teiId;
        this.sccCode = sccCode;
    }

    public AssignCourse(String teiId, String sccCode) {
        this.teiId = teiId;
        this.sccCode = sccCode;
    }

    public AssignCourse(String aceId, TeacherInfo teacherInfo, SystemCourseCode systemCourseCode) {
        this.aceId = aceId;
        this.teacherInfo = teacherInfo;
        this.systemCourseCode = systemCourseCode;
        this.teiId = teacherInfo.getTeiId();
        this.sccCode = systemCourseCode.getSccCode();
    }

    public AssignCourse(TeacherInfo teacherInfo, SystemCourseCode systemCourseCode) {
        this.teacherInfo = teacherInfo;
        this.systemCourseCode = systemCourseCode;
        this.teiId = teacherInfo.getTeiId();
        this.sccCode = systemCourseCode.getSccCode();
    }

    /** full constructor */
    public AssignCourse(String aceId, String teiId, String sccCode, Date aceRzrq, Date aceLzrq) {
        this.aceId = aceId;
        this.teiId = teiId;
        this.sccCode = sccCode;
        this.aceRzrq = aceRzrq;
        this.aceLzrq = aceLzrq;
    }

    public AssignCourse(String aceId, TeacherInfo teacherInfo, SystemCourseCode systemCourseCode, Date aceRzrq, Date aceLzrq) {
        this.aceId = aceId;
        this.teacherInfo = teacherInfo;
        this.systemCourseCode = systemCourseCode;
        this.teiId = teacherInfo.getTeiId();
        this.sccCode = systemCourseCode.getSccCode();
        this.aceRzrq = aceRzrq;
        this.aceLzrq = aceLzrq;
    }

    public String getEacId() {
        return aceId;
    }

    public void setEacId(String aceId) {
        this.aceId = aceId;
    }

    public String getTeiId() {
        return teiId;
    }

    public void setTeiId(String teiId) {
        this.teiId = teiId;
    }

    public String getSccCode() {
        return sccCode;
    }

    public void setSccCode(String sccCode) {
        this.sccCode = sccCode;
    }

    public TeacherInfo getTeacherInfo() {
        return this.teacherInfo;
    }

    public void setTeacherInfo(TeacherInfo teacherInfo) {
        this.teacherInfo = teacherInfo;
    }

    public SystemCourseCode getSystemCourseCode() {
        return this.systemCourseCode;
    }

    public void setSystemCourseCode(SystemCourseCode systemCourseCode) {
        this.systemCourseCode = systemCourseCode;
    }

    public Date getAceRzrq() {
        return aceRzrq;
    }

    public void setAceRzrq(Date aceRzrq) {
        this.aceRzrq = aceRzrq;
    }

    public Date getAceLzrq() {
        return aceLzrq;
    }

    public void setAceLzrq(Date aceLzrq) {
        this.aceLzrq = aceLzrq;
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
        AssignCourse other = (AssignCourse) that;
        return (this.getEacId() == null ? other.getEacId() == null : this.getEacId().equals(other.getEacId()))
            && (this.getTeiId() == null ? other.getTeiId() == null : this.getTeiId().equals(other.getTeiId()))
            && (this.getSccCode() == null ? other.getSccCode() == null : this.getSccCode().equals(other.getSccCode()))
            && (this.getTeacherInfo() == null ? other.getTeacherInfo() == null : this.getTeacherInfo().equals(other.getTeacherInfo()))
            && (this.getSystemCourseCode() == null ? other.getSystemCourseCode() == null : this.getSystemCourseCode().equals(other.getSystemCourseCode()))
            && (this.getAceRzrq() == null ? other.getAceRzrq() == null : this.getAceRzrq().equals(other.getAceRzrq()))
            && (this.getAceLzrq() == null ? other.getAceLzrq() == null : this.getAceLzrq().equals(other.getAceLzrq()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEacId() == null) ? 0 : getEacId().hashCode());
        result = prime * result + ((getTeiId() == null) ? 0 : getTeiId().hashCode());
        result = prime * result + ((getSccCode() == null) ? 0 : getSccCode().hashCode());
        result = prime * result + ((getTeacherInfo() == null) ? 0 : getTeacherInfo().hashCode());
        result = prime * result + ((getSystemCourseCode() == null) ? 0 : getSystemCourseCode().hashCode());
        result = prime * result + ((getAceRzrq() == null) ? 0 : getAceRzrq().hashCode());
        result = prime * result + ((getAceLzrq() == null) ? 0 : getAceLzrq().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aceId=").append(aceId);
        sb.append(", teiId=").append(teiId);
        sb.append(", sccCode=").append(sccCode);
        sb.append(", teacherInfo=").append(teacherInfo);
        sb.append(", systemCourseCode=").append(systemCourseCode);
        sb.append(", aceRzrq=").append(aceRzrq);
        sb.append(", aceLzrq=").append(aceLzrq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}