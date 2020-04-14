package com.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author 
 * 图书信息
 */
public class BookInfo implements Serializable {
    /**
     * 图书ID
     */
    private String bkiId;
    /**
     * 图书名称
     */
    private String bkiName;
    /**
     * 图书类别
     */
    private String bkiType;
    /**
     * 图书作者
     */
    private String bkiWriter;
    /**
     * 图书释义
     */
    private String bkiConcern;
    /**
     * 图书出版日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date bkiPublishDate;
    /**
     * 图书价格
     */
    @NumberFormat(style= NumberFormat.Style.CURRENCY)
    private Double bkiPrice;
    /**
     * 图书登记日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date bkiRegisterDate;
    /**
     * 图书数量
     */
    private Integer bkiCount;
    /**
     * 图书录入员
     */
    private String bkiCzy;
    /**
     * 图书标记
     */
    private String bkiRemark;
    /**
     * 图书借阅信息
     */
    private Set borrowInfos;

    private static final long serialVersionUID = 1L;


    // Constructors

    /** default constructor */
    public BookInfo() {
    }

    /** minimal constructor */
    public BookInfo(String bkiId) {
        this.bkiId = bkiId;
    }

    /** full constructor */
    public BookInfo(String bkiId, String bkiName, String bkiType, String bkiWriter, String bkiConcern, java.sql.Date bkiPublishDate, Double bkiPrice, java.sql.Date bkiRegisterDate, Integer bkiCount, String bkiCzy, String bkiRemark, Set borrowInfos) {
        this.bkiId = bkiId;
        this.bkiName = bkiName;
        this.bkiType = bkiType;
        this.bkiWriter = bkiWriter;
        this.bkiConcern = bkiConcern;
        this.bkiPublishDate = bkiPublishDate;
        this.bkiPrice = bkiPrice;
        this.bkiRegisterDate = bkiRegisterDate;
        this.bkiCount = bkiCount;
        this.bkiCzy = bkiCzy;
        this.bkiRemark = bkiRemark;
        this.borrowInfos = borrowInfos;
    }

    public String getBkiId() {
        return bkiId;
    }

    public void setBkiId(String bkiId) {
        this.bkiId = bkiId;
    }

    public String getBkiName() {
        return bkiName;
    }

    public void setBkiName(String bkiName) {
        this.bkiName = bkiName;
    }

    public String getBkiType() {
        return bkiType;
    }

    public void setBkiType(String bkiType) {
        this.bkiType = bkiType;
    }

    public String getBkiWriter() {
        return bkiWriter;
    }

    public void setBkiWriter(String bkiWriter) {
        this.bkiWriter = bkiWriter;
    }

    public String getBkiConcern() {
        return bkiConcern;
    }

    public void setBkiConcern(String bkiConcern) {
        this.bkiConcern = bkiConcern;
    }

    public Date getBkiPublishDate() {
        return bkiPublishDate;
    }

    public void setBkiPublishDate(Date bkiPublishDate) {
        this.bkiPublishDate = bkiPublishDate;
    }

    public Double getBkiPrice() {
        return bkiPrice;
    }

    public void setBkiPrice(Double bkiPrice) {
        this.bkiPrice = bkiPrice;
    }

    public Date getBkiRegisterDate() {
        return bkiRegisterDate;
    }

    public void setBkiRegisterDate(Date bkiRegisterDate) {
        this.bkiRegisterDate = bkiRegisterDate;
    }

    public Integer getBkiCount() {
        return bkiCount;
    }

    public void setBkiCount(Integer bkiCount) {
        this.bkiCount = bkiCount;
    }

    public String getBkiCzy() {
        return bkiCzy;
    }

    public void setBkiCzy(String bkiCzy) {
        this.bkiCzy = bkiCzy;
    }

    public String getBkiRemark() {
        return bkiRemark;
    }

    public void setBkiRemark(String bkiRemark) {
        this.bkiRemark = bkiRemark;
    }

    public Set getBorrowInfos() {
        return borrowInfos;
    }

    public void setBorrowInfos(Set borrowInfos) {
        this.borrowInfos = borrowInfos;
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
        BookInfo other = (BookInfo) that;
        return (this.getBkiId() == null ? other.getBkiId() == null : this.getBkiId().equals(other.getBkiId()))
            && (this.getBkiName() == null ? other.getBkiName() == null : this.getBkiName().equals(other.getBkiName()))
            && (this.getBkiType() == null ? other.getBkiType() == null : this.getBkiType().equals(other.getBkiType()))
            && (this.getBkiWriter() == null ? other.getBkiWriter() == null : this.getBkiWriter().equals(other.getBkiWriter()))
            && (this.getBkiConcern() == null ? other.getBkiConcern() == null : this.getBkiConcern().equals(other.getBkiConcern()))
            && (this.getBkiPublishDate() == null ? other.getBkiPublishDate() == null : this.getBkiPublishDate().equals(other.getBkiPublishDate()))
            && (this.getBkiPrice() == null ? other.getBkiPrice() == null : this.getBkiPrice().equals(other.getBkiPrice()))
            && (this.getBkiRegisterDate() == null ? other.getBkiRegisterDate() == null : this.getBkiRegisterDate().equals(other.getBkiRegisterDate()))
            && (this.getBkiCount() == null ? other.getBkiCount() == null : this.getBkiCount().equals(other.getBkiCount()))
            && (this.getBkiCzy() == null ? other.getBkiCzy() == null : this.getBkiCzy().equals(other.getBkiCzy()))
            && (this.getBkiRemark() == null ? other.getBkiRemark() == null : this.getBkiRemark().equals(other.getBkiRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBkiId() == null) ? 0 : getBkiId().hashCode());
        result = prime * result + ((getBkiName() == null) ? 0 : getBkiName().hashCode());
        result = prime * result + ((getBkiType() == null) ? 0 : getBkiType().hashCode());
        result = prime * result + ((getBkiWriter() == null) ? 0 : getBkiWriter().hashCode());
        result = prime * result + ((getBkiConcern() == null) ? 0 : getBkiConcern().hashCode());
        result = prime * result + ((getBkiPublishDate() == null) ? 0 : getBkiPublishDate().hashCode());
        result = prime * result + ((getBkiPrice() == null) ? 0 : getBkiPrice().hashCode());
        result = prime * result + ((getBkiRegisterDate() == null) ? 0 : getBkiRegisterDate().hashCode());
        result = prime * result + ((getBkiCount() == null) ? 0 : getBkiCount().hashCode());
        result = prime * result + ((getBkiCzy() == null) ? 0 : getBkiCzy().hashCode());
        result = prime * result + ((getBkiRemark() == null) ? 0 : getBkiRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bkiId=").append(bkiId);
        sb.append(", bkiName=").append(bkiName);
        sb.append(", bkiType=").append(bkiType);
        sb.append(", bkiWriter=").append(bkiWriter);
        sb.append(", bkiConcern=").append(bkiConcern);
        sb.append(", bkiPublishDate=").append(bkiPublishDate);
        sb.append(", bkiPrice=").append(bkiPrice);
        sb.append(", bkiRegisterDate=").append(bkiRegisterDate);
        sb.append(", bkiCount=").append(bkiCount);
        sb.append(", bkiCzy=").append(bkiCzy);
        sb.append(", bkiRemark=").append(bkiRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}