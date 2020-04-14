package com.model;

import java.io.Serializable;

/**
 * @author 
 * 专业信息
 */
public class SystemSpecialtyCode implements Serializable {
    /**
     * 专业编码
     */
    private String sscCode;
    /**
     * 专业名称
     */
    private String sscName;

    private static final long serialVersionUID = 1L;

    // Constructors

    /** default constructor */
    public SystemSpecialtyCode() {
    }

    /** minimal constructor */
    public SystemSpecialtyCode(String sscCode) {
        this.sscCode = sscCode;
    }

    /** full constructor */
    public SystemSpecialtyCode(String sscCode, String sscName) {
        this.sscCode = sscCode;
        this.sscName = sscName;
    }

    public String getSscCode() {
        return sscCode;
    }

    public void setSscCode(String sscCode) {
        this.sscCode = sscCode;
    }

    public String getSscName() {
        return sscName;
    }

    public void setSscName(String sscName) {
        this.sscName = sscName;
    }

    public SystemCode toSystemCode() {
        return new SystemCode(sscCode, sscName);
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
        SystemSpecialtyCode other = (SystemSpecialtyCode) that;
        return (this.getSscCode() == null ? other.getSscCode() == null : this.getSscCode().equals(other.getSscCode()))
            && (this.getSscName() == null ? other.getSscName() == null : this.getSscName().equals(other.getSscName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSscCode() == null) ? 0 : getSscCode().hashCode());
        result = prime * result + ((getSscName() == null) ? 0 : getSscName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sscCode=").append(sscCode);
        sb.append(", sscName=").append(sscName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}