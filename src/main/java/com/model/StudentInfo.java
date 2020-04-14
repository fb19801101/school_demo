package com.model;

import com.controller.DateJsonDeserializer;
import com.controller.DateJsonSerializer;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.*;

/**
 * @author 
 * 学生信息
 */
public class StudentInfo implements Serializable {
    /**
     * 学生ID
     */
    private String stiId;
    /**
     * 姓名
     */
    private String stiName;
    /**
     * 性别
     */
    private String stiSex;
    /**
     * 年龄
     */
    private Integer stiAge;
    /**
     * 身份证号
     */
    private String stiSfzh;
    /**
     * 出生日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date stiCsrq;
    /**
     * 政治面貌
     */
    private String stiZzmm;
    /**
     * 家庭电话
     */
    private String stiJtdh;
    /**
     * 家庭地址
     */
    private String stiJtdz;
    /**
     * 健康状况
     */
    private String stiJkzk;
    /**
     * 课程信息
     */
    private List<CourseInfo> courseInfos = new ArrayList<CourseInfo>();

    private static final long serialVersionUID = 1L;


    // Constructors

    /** default constructor */
    public StudentInfo() {
    }

    /** full constructor */
    @JsonCreator
    public StudentInfo(@JsonProperty("stiId") String stiId, @JsonProperty("stiName") String stiName, @JsonProperty("stiSex") String stiSex,
                       @JsonProperty("stiAge") Integer stiAge, @JsonProperty("stiSfzh") String stiSfzh, @JsonProperty("stiCsrq") Date stiCsrq,
                       @JsonProperty("stiZzmm") String stiZzmm, @JsonProperty("stiJtdh") String stiJtdh, @JsonProperty("stiJtdz") String stiJtdz,
                       @JsonProperty("stiJkzk") String stiJkzk) {
        this.stiId = stiId;
        this.stiName = stiName;
        this.stiSex = stiSex;
        this.stiAge = stiAge;
        this.stiSfzh = stiSfzh;
        this.stiCsrq = stiCsrq;
        this.stiZzmm = stiZzmm;
        this.stiJtdh = stiJtdh;
        this.stiJtdz = stiJtdz;
        this.stiJkzk = stiJkzk;
    }

    public StudentInfo(String stiId, String stiName, String stiSex, Integer stiAge, String stiSfzh, Date stiCsrq, String stiZzmm, String stiJtdh, String stiJtdz, String stiJkzk, List<CourseInfo> courseInfos) {
        this.stiId = stiId;
        this.stiName = stiName;
        this.stiSex = stiSex;
        this.stiAge = stiAge;
        this.stiSfzh = stiSfzh;
        this.stiCsrq = stiCsrq;
        this.stiZzmm = stiZzmm;
        this.stiJtdh = stiJtdh;
        this.stiJtdz = stiJtdz;
        this.stiJkzk = stiJkzk;
        this.courseInfos = courseInfos;
    }

    public String getStiId() {
        return stiId;
    }

    public void setStiId(String stiId) {
        this.stiId = stiId;
    }

    public String getStiName() {
        return stiName;
    }

    public void setStiName(String stiName) {
        this.stiName = stiName;
    }

    public String getStiSex() {
        return stiSex;
    }

    public void setStiSex(String stiSex) {
        this.stiSex = stiSex;
    }

    public Integer getStiAge() {
        return stiAge;
    }

    public void setStiAge(Integer stiAge) {
        this.stiAge = stiAge;
    }

    public String getStiSfzh() {
        return stiSfzh;
    }

    public void setStiSfzh(String stiSfzh) {
        this.stiSfzh = stiSfzh;
    }

    @JsonSerialize(using = DateJsonSerializer.class)
    public Date getStiCsrq() {
        return stiCsrq;
    }

    @JsonDeserialize(using = DateJsonDeserializer.class)
    public void setStiCsrq(Date stiCsrq) {
        this.stiCsrq = stiCsrq;
    }

    public String getStiZzmm() {
        return stiZzmm;
    }

    public void setStiZzmm(String stiZzmm) {
        this.stiZzmm = stiZzmm;
    }

    public String getStiJtdh() {
        return stiJtdh;
    }

    public void setStiJtdh(String stiJtdh) {
        this.stiJtdh = stiJtdh;
    }

    public String getStiJtdz() {
        return stiJtdz;
    }

    public void setStiJtdz(String stiJtdz) {
        this.stiJtdz = stiJtdz;
    }

    public String getStiJkzk() {
        return stiJkzk;
    }

    public void setStiJkzk(String stiJkzk) {
        this.stiJkzk = stiJkzk;
    }

    public List<CourseInfo> getCourseInfos() {
        return courseInfos;
    }

    public void setCourseInfos(List<CourseInfo> courseInfos) {
        this.courseInfos = courseInfos;
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
        StudentInfo other = (StudentInfo) that;
        return (this.getStiId() == null ? other.getStiId() == null : this.getStiId().equals(other.getStiId()))
            && (this.getStiName() == null ? other.getStiName() == null : this.getStiName().equals(other.getStiName()))
            && (this.getStiSex() == null ? other.getStiSex() == null : this.getStiSex().equals(other.getStiSex()))
            && (this.getStiAge() == null ? other.getStiAge() == null : this.getStiAge().equals(other.getStiAge()))
            && (this.getStiSfzh() == null ? other.getStiSfzh() == null : this.getStiSfzh().equals(other.getStiSfzh()))
            && (this.getStiCsrq() == null ? other.getStiCsrq() == null : this.getStiCsrq().equals(other.getStiCsrq()))
            && (this.getStiZzmm() == null ? other.getStiZzmm() == null : this.getStiZzmm().equals(other.getStiZzmm()))
            && (this.getStiJtdh() == null ? other.getStiJtdh() == null : this.getStiJtdh().equals(other.getStiJtdh()))
            && (this.getStiJtdz() == null ? other.getStiJtdz() == null : this.getStiJtdz().equals(other.getStiJtdz()))
            && (this.getStiJkzk() == null ? other.getStiJkzk() == null : this.getStiJkzk().equals(other.getStiJkzk()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStiId() == null) ? 0 : getStiId().hashCode());
        result = prime * result + ((getStiName() == null) ? 0 : getStiName().hashCode());
        result = prime * result + ((getStiSex() == null) ? 0 : getStiSex().hashCode());
        result = prime * result + ((getStiAge() == null) ? 0 : getStiAge().hashCode());
        result = prime * result + ((getStiSfzh() == null) ? 0 : getStiSfzh().hashCode());
        result = prime * result + ((getStiCsrq() == null) ? 0 : getStiCsrq().hashCode());
        result = prime * result + ((getStiZzmm() == null) ? 0 : getStiZzmm().hashCode());
        result = prime * result + ((getStiJtdh() == null) ? 0 : getStiJtdh().hashCode());
        result = prime * result + ((getStiJtdz() == null) ? 0 : getStiJtdz().hashCode());
        result = prime * result + ((getStiJkzk() == null) ? 0 : getStiJkzk().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stiId=").append(stiId);
        sb.append(", stiName=").append(stiName);
        sb.append(", stiSex=").append(stiSex);
        sb.append(", stiAge=").append(stiAge);
        sb.append(", stiSfzh=").append(stiSfzh);
        sb.append(", stiCsrq=").append(stiCsrq);
        sb.append(", stiZzmm=").append(stiZzmm);
        sb.append(", stiJtdh=").append(stiJtdh);
        sb.append(", stiJtdz=").append(stiJtdz);
        sb.append(", stiJkzk=").append(stiJkzk);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}