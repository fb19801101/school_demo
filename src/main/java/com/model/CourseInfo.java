package com.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 学生课程信息
 */
public class CourseInfo implements Serializable {
    /**
     * 课程ID
     */
    private String csiId;
    /**
     * 课程编码
     */
    private String sccCode;
    /**
     * 学生ID
     */
    private String stiId;
    /**
     * 课程信息
     */
    private SystemCourseCode systemCourseCode;
    /**
     * 学生信息
     */
    private StudentInfo studentInfo;
    /**
     * 学生等级
     */
    private String csiGrade;
    /**
     * 考试类型
     */
    private String csiExamType;
    /**
     * 考试日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date csiExamDate;
    /**
     * 课程操作员
     */
    private String csiCzy;

    private static final long serialVersionUID = 1L;

    // Constructors

    /** default constructor */
    public CourseInfo() {
    }

    /** full constructor */
    public CourseInfo(String csiId, String sccCode, String stiId) {
        this.csiId = csiId;
        this.sccCode = sccCode;
        this.stiId = stiId;
    }

    public CourseInfo(String sccCode, String stiId) {
        this.sccCode = sccCode;
        this.stiId = stiId;
    }

    public CourseInfo(String csiId, SystemCourseCode systemCourseCode, StudentInfo studentInfo) {
        this.csiId = csiId;
        this.systemCourseCode = systemCourseCode;
        this.studentInfo = studentInfo;
        this.sccCode = systemCourseCode.getSccCode();
        this.stiId = studentInfo.getStiId();
    }

    public CourseInfo(SystemCourseCode systemCourseCode, StudentInfo studentInfo) {
        this.systemCourseCode = systemCourseCode;
        this.studentInfo = studentInfo;
        this.sccCode = systemCourseCode.getSccCode();
        this.stiId = studentInfo.getStiId();
    }

    public CourseInfo(String csiId, String sccCode, String stiId, String csiGrade, String csiExamType, Date csiExamDate, String csiCzy) {
        this.csiId = csiId;
        this.sccCode = sccCode;
        this.stiId = stiId;
        this.csiGrade = csiGrade;
        this.csiExamType = csiExamType;
        this.csiExamDate = csiExamDate;
        this.csiCzy = csiCzy;
    }

    public CourseInfo(String csiId, SystemCourseCode systemCourseCode, StudentInfo studentInfo, String csiGrade, String csiExamType, Date csiExamDate, String csiCzy) {
        this.csiId = csiId;
        this.systemCourseCode = systemCourseCode;
        this.studentInfo = studentInfo;
        this.sccCode = systemCourseCode.getSccCode();
        this.stiId = studentInfo.getStiId();
        this.csiGrade = csiGrade;
        this.csiExamType = csiExamType;
        this.csiExamDate = csiExamDate;
        this.csiCzy = csiCzy;
    }

    public String getCsiId() {
        return csiId;
    }

    public void setCsiId(String csiId) {
        this.csiId = csiId;
    }

    public String getSccCode() {
        return sccCode;
    }

    public void setSccCode(String sccCode) {
        this.sccCode = sccCode;
    }

    public String getStiId() {
        return stiId;
    }

    public void setStiId(String stiId) {
        this.stiId = stiId;
    }

    public SystemCourseCode getSystemCourseCode() {
        return this.systemCourseCode;
    }

    public void setSystemCourseCode(SystemCourseCode systemCourseCode) {
        this.systemCourseCode = systemCourseCode;
    }

    public StudentInfo getStudentInfo() {
        return this.studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }

    public String getCsiGrade() {
        return csiGrade;
    }

    public void setCsiGrade(String csiGrade) {
        this.csiGrade = csiGrade;
    }

    public String getCsiExamType() {
        return csiExamType;
    }

    public void setCsiExamType(String csiExamType) {
        this.csiExamType = csiExamType;
    }

    public Date getCsiExamDate() {
        return csiExamDate;
    }

    public void setCsiExamDate(Date csiExamDate) {
        this.csiExamDate = csiExamDate;
    }

    public String getCsiCzy() {
        return csiCzy;
    }

    public void setCsiCzy(String csiCzy) {
        this.csiCzy = csiCzy;
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
        CourseInfo other = (CourseInfo) that;
        return (this.getCsiId() == null ? other.getCsiId() == null : this.getCsiId().equals(other.getCsiId()))
            && (this.getSccCode() == null ? other.getSccCode() == null : this.getSccCode().equals(other.getSccCode()))
            && (this.getStiId() == null ? other.getStiId() == null : this.getStiId().equals(other.getStiId()))
            && (this.getSystemCourseCode() == null ? other.getSystemCourseCode() == null : this.getSystemCourseCode().equals(other.getSystemCourseCode()))
            && (this.getStudentInfo() == null ? other.getStudentInfo() == null : this.getStudentInfo().equals(other.getStudentInfo()))
            && (this.getCsiGrade() == null ? other.getCsiGrade() == null : this.getCsiGrade().equals(other.getCsiGrade()))
            && (this.getCsiExamType() == null ? other.getCsiExamType() == null : this.getCsiExamType().equals(other.getCsiExamType()))
            && (this.getCsiExamDate() == null ? other.getCsiExamDate() == null : this.getCsiExamDate().equals(other.getCsiExamDate()))
            && (this.getCsiCzy() == null ? other.getCsiCzy() == null : this.getCsiCzy().equals(other.getCsiCzy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCsiId() == null) ? 0 : getCsiId().hashCode());
        result = prime * result + ((getSccCode() == null) ? 0 : getSccCode().hashCode());
        result = prime * result + ((getStiId() == null) ? 0 : getStiId().hashCode());
        result = prime * result + ((getSystemCourseCode() == null) ? 0 : getSystemCourseCode().hashCode());
        result = prime * result + ((getStudentInfo() == null) ? 0 : getStudentInfo().hashCode());
        result = prime * result + ((getCsiGrade() == null) ? 0 : getCsiGrade().hashCode());
        result = prime * result + ((getCsiExamType() == null) ? 0 : getCsiExamType().hashCode());
        result = prime * result + ((getCsiExamDate() == null) ? 0 : getCsiExamDate().hashCode());
        result = prime * result + ((getCsiCzy() == null) ? 0 : getCsiCzy().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", csiId=").append(csiId);
        sb.append(", sccCode=").append(sccCode);
        sb.append(", stiId=").append(stiId);
        sb.append(", systemCourseCode=").append(systemCourseCode);
        sb.append(", studentInfo=").append(studentInfo);
        sb.append(", csiGrade=").append(csiGrade);
        sb.append(", csiExamType=").append(csiExamType);
        sb.append(", csiExamDate=").append(csiExamDate);
        sb.append(", csiCzy=").append(csiCzy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}