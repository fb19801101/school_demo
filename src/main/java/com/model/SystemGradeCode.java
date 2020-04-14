package com.model;

import java.io.Serializable;

/**
 * @author 
 * 年级信息
 */
public class SystemGradeCode implements Serializable {
    /**
     * 年级编码
     */
    private String sgcCode;
    /**
     * 年级名称
     */
    private String sgcName;

    private static final long serialVersionUID = 1L;

    // Constructors

    /** default constructor */
    public SystemGradeCode() {
    }

    /** minimal constructor */
    public SystemGradeCode(String sgcCode) {
        this.sgcCode = sgcCode;
    }

    /** full constructor */
    public SystemGradeCode(String sgcCode, String sgcName) {
        this.sgcCode = sgcCode;
        this.sgcName = sgcName;
    }


    public String getSgcCode() {
        return sgcCode;
    }

    public void setSgcCode(String sgcCode) {
        this.sgcCode = sgcCode;
    }

    public String getSgcName() {
        return sgcName;
    }

    public void setSgcName(String sgcName) {
        this.sgcName = sgcName;
    }

    public SystemCode toSystemCode() {
        return new SystemCode(sgcCode, sgcName);
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
        SystemGradeCode other = (SystemGradeCode) that;
        return (this.getSgcCode() == null ? other.getSgcCode() == null : this.getSgcCode().equals(other.getSgcCode()))
            && (this.getSgcName() == null ? other.getSgcName() == null : this.getSgcName().equals(other.getSgcName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSgcCode() == null) ? 0 : getSgcCode().hashCode());
        result = prime * result + ((getSgcName() == null) ? 0 : getSgcName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sgcCode=").append(sgcCode);
        sb.append(", sgcName=").append(sgcName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}