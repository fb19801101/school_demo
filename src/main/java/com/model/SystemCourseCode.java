package com.model;

import java.io.Serializable;

/**
 * @author 
 * 课程信息
 */
public class SystemCourseCode implements Serializable {
    /**
     * 课程编码
     */
    private String sccCode;
    /**
     * 课程名称
     */
    private String sccName;

    private static final long serialVersionUID = 1L;

    // Constructors

    /** default constructor */
    public SystemCourseCode() {
    }

    /** minimal constructor */
    public SystemCourseCode(String sccCode) {
        this.sccCode = sccCode;
    }

    /** full constructor */
    public SystemCourseCode(String sccCode, String sccName) {
        this.sccCode = sccCode;
        this.sccName = sccName;
    }

    public String getSccCode() {
        return sccCode;
    }

    public void setSccCode(String sccCode) {
        this.sccCode = sccCode;
    }

    public String getSccName() {
        return sccName;
    }

    public void setSccName(String sccName) {
        this.sccName = sccName;
    }

    public SystemCode toSystemCode() {
        return new SystemCode(sccCode, sccName);
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
        SystemCourseCode other = (SystemCourseCode) that;
        return (this.getSccCode() == null ? other.getSccCode() == null : this.getSccCode().equals(other.getSccCode()))
            && (this.getSccName() == null ? other.getSccName() == null : this.getSccName().equals(other.getSccName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSccCode() == null) ? 0 : getSccCode().hashCode());
        result = prime * result + ((getSccName() == null) ? 0 : getSccName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sccCode=").append(sccCode);
        sb.append(", sccName=").append(sccName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}