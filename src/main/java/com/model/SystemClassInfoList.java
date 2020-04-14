package com.model;

import java.io.Serializable;

/**
 * @author
 *
 */
public class SystemClassInfoList implements Serializable {
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
     * 专业名称
     */
    private String sscName;
    /**
     * 年级名称
     */
    private String sgcName;
    /**
     * 班级名称
     */
    private String sciName;

    private static final long serialVersionUID = 1L;


    // Constructors

    /** default constructor */
    public SystemClassInfoList() {
    }

    /** full constructor */
    public SystemClassInfoList(SystemClassInfo systemClassInfo) {
        this.sciId = systemClassInfo.getSciId();
        this.sscCode = systemClassInfo.getSscCode();
        this.sgcCode = systemClassInfo.getSgcCode();
        this.sciName = systemClassInfo.getSciName();
    }

    public SystemClassInfoList(String sciId, String sscCode, String sgcCode, String sscName, String sgcName, String sciName) {
        this.sciId = sciId;
        this.sscCode = sscCode;
        this.sgcCode = sgcCode;
        this.sscName = sscName;
        this.sgcName = sgcName;
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

    public String getSscName() {
        return sscName;
    }

    public void setSscName(String sscName) {
        this.sscName = sscName;
    }

    public String getSgcName() {
        return sgcName;
    }

    public void setSgcName(String sgcName) {
        this.sgcName = sgcName;
    }

    public String getSciName() {
        return sciName;
    }

    public void setSciName(String sciName) {
        this.sciName = sciName;
    }

    public SystemClassInfo toSystemClassInfo() {
        return new SystemClassInfo(sciId, sscCode, sgcCode, sciName);
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
        SystemClassInfoList other = (SystemClassInfoList) that;
        return (this.getSciId() == null ? other.getSciId() == null : this.getSciId().equals(other.getSciId()))
                && (this.getSscCode() == null ? other.getSscCode() == null : this.getSscCode().equals(other.getSscCode()))
                && (this.getSgcCode() == null ? other.getSgcCode() == null : this.getSgcCode().equals(other.getSgcCode()))
                && (this.getSscName() == null ? other.getSscName() == null : this.getSscName().equals(other.getSscName()))
                && (this.getSgcName() == null ? other.getSgcName() == null : this.getSgcName().equals(other.getSgcName()))
                && (this.getSciName() == null ? other.getSciName() == null : this.getSciName().equals(other.getSciName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSciId() == null) ? 0 : getSciId().hashCode());
        result = prime * result + ((getSscCode() == null) ? 0 : getSscCode().hashCode());
        result = prime * result + ((getSgcCode() == null) ? 0 : getSgcCode().hashCode());
        result = prime * result + ((getSscName() == null) ? 0 : getSscName().hashCode());
        result = prime * result + ((getSgcName() == null) ? 0 : getSgcName().hashCode());
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
        sb.append(", sscName=").append(sscName);
        sb.append(", sgcName=").append(sgcName);
        sb.append(", sciName=").append(sciName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}