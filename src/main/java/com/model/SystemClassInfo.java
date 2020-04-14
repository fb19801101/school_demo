package com.model;

import java.io.Serializable;

/**
 * @author 
 * 班级信息
 */
public class SystemClassInfo implements Serializable {
    /**
     * 班级ID
     */
    private String sciId;
    /**
     * 专业编码
     */
    private String sscCode;
    /**
     * 年级编码
     */
    private String sgcCode;
    /**
     * 专业信息
     */
    private SystemSpecialtyCode systemSpecialtyCode;
    /**
     * 年级信息
     */
    private SystemGradeCode systemGradeCode;
    /**
     * 班级名称
     */
    private String sciName;

    private static final long serialVersionUID = 1L;

    // Constructors

    /** default constructor */
    public SystemClassInfo() {
    }

    /** minimal constructor */
    public SystemClassInfo(String sciId) {
        this.sciId = sciId;
    }

    public SystemClassInfo(String sciId, String sscCode, String sgcCode) {
        this.sciId = sciId;
        this.sscCode = sscCode;
        this.sgcCode = sgcCode;
    }

    public SystemClassInfo(String sscCode, String sgcCode) {
        this.sscCode = sscCode;
        this.sgcCode = sgcCode;
    }

    public SystemClassInfo(String sciId, SystemSpecialtyCode systemSpecialtyCode, SystemGradeCode systemGradeCode) {
        this.sciId = sciId;
        this.systemSpecialtyCode = systemSpecialtyCode;
        this.systemGradeCode = systemGradeCode;
        this.sscCode = systemSpecialtyCode.getSscCode();
        this.sgcCode = systemGradeCode.getSgcCode();
    }

    public SystemClassInfo(SystemSpecialtyCode systemSpecialtyCode, SystemGradeCode systemGradeCode) {
        this.systemSpecialtyCode = systemSpecialtyCode;
        this.systemGradeCode = systemGradeCode;
        this.sscCode = systemSpecialtyCode.getSscCode();
        this.sgcCode = systemGradeCode.getSgcCode();
    }

    /** full constructor */
    public SystemClassInfo(String sciId, String sscCode, String sgcCode, String sciName) {
        this.sciId = sciId;
        this.sscCode = sscCode;
        this.sgcCode = sgcCode;
        this.sciName = sciName;
    }

    public SystemClassInfo(String sciId, SystemSpecialtyCode systemSpecialtyCode, SystemGradeCode systemGradeCode, String sciName) {
        this.sciId = sciId;
        this.systemSpecialtyCode = systemSpecialtyCode;
        this.systemGradeCode = systemGradeCode;
        this.sscCode = systemSpecialtyCode.getSscCode();
        this.sgcCode = systemGradeCode.getSgcCode();
        this.sciName = sciName;
    }

    public String getSciId() {
        return sciId;
    }

    public void setSciId(String sciId) {
        this.sciId = sciId;
    }

    public String getSscCode() {
        return sscCode;
    }

    public void setSscCode(String sscCode) {
        this.sscCode = sscCode;
    }

    public String getSgcCode() {
        return sgcCode;
    }

    public void setSgcCode(String sgcCode) {
        this.sgcCode = sgcCode;
    }

    public SystemSpecialtyCode getSystemSpecialtyCode() {
        return this.systemSpecialtyCode;
    }

    public void setSystemSpecialtyCode(SystemSpecialtyCode systemSpecialtyCode) {
        this.systemSpecialtyCode = systemSpecialtyCode;
    }

    public SystemGradeCode getSystemGradeCode() {
        return this.systemGradeCode;
    }

    public void setSystemGradeCode(SystemGradeCode systemGradeCode) {
        this.systemGradeCode = systemGradeCode;
    }

    public String getSciName() {
        return sciName;
    }

    public void setSciName(String sciName) {
        this.sciName = sciName;
    }

    public SystemCode toSystemCode() {
        return new SystemCode(sciId, sciName);
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
        SystemClassInfo other = (SystemClassInfo) that;
        return (this.getSciId() == null ? other.getSciId() == null : this.getSciId().equals(other.getSciId()))
            && (this.getSscCode() == null ? other.getSscCode() == null : this.getSscCode().equals(other.getSscCode()))
            && (this.getSgcCode() == null ? other.getSgcCode() == null : this.getSgcCode().equals(other.getSgcCode()))
            && (this.getSystemSpecialtyCode() == null ? other.getSystemSpecialtyCode() == null : this.getSystemSpecialtyCode().equals(other.getSystemSpecialtyCode()))
            && (this.getSystemGradeCode() == null ? other.getSystemGradeCode() == null : this.getSystemGradeCode().equals(other.getSystemGradeCode()))
            && (this.getSciName() == null ? other.getSciName() == null : this.getSciName().equals(other.getSciName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSciId() == null) ? 0 : getSciId().hashCode());
        result = prime * result + ((getSscCode() == null) ? 0 : getSscCode().hashCode());
        result = prime * result + ((getSgcCode() == null) ? 0 : getSgcCode().hashCode());
        result = prime * result + ((getSystemSpecialtyCode() == null) ? 0 : getSystemSpecialtyCode().hashCode());
        result = prime * result + ((getSystemGradeCode() == null) ? 0 : getSystemGradeCode().hashCode());
        result = prime * result + ((getSciName() == null) ? 0 : getSciName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sciId=").append(sciId);
        sb.append(", sscCode=").append(sscCode);
        sb.append(", sgcCode=").append(sgcCode);
        sb.append(", systemSpecialtyCode=").append(systemSpecialtyCode);
        sb.append(", systemGradeCode=").append(systemGradeCode);
        sb.append(", sciName=").append(sciName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}