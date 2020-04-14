package com.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 图书借阅信息
 */
public class BorrowInfo implements Serializable {
    /**
     * 借阅ID
     */
    private String bwiId;
    /**
     * 图书ID
     */
    private String bkiId;
    /**
     * 学生ID
     */
    private String stiId;
    /**
     * 图书信息
     */
    private BookInfo bookInfo;
    /**
     * 学生信息
     */
    private StudentInfo studentInfo;
    /**
     * 图书名称
     */
    private String bwiName;
    /**
     * 图书价格
     */
    @NumberFormat(style= NumberFormat.Style.CURRENCY)
    private Double bwiPrice;
    /**
     * 图书类别
     */
    private String bwiType;
    /**
     * 借阅日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date bwiBorrowDate;
    /**
     * 图书数量
     */
    private Integer bwiCount;
    /**
     * 归还日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date bwiReturnDate;
    /**
     * 借阅操作员
     */
    private String bwiCzy;

    private static final long serialVersionUID = 1L;

    // Constructors

    /** default constructor */
    public BorrowInfo() {
    }

    /** minimal constructor */
    public BorrowInfo(String bwiId, String bkiId, String stiId) {
        this.bwiId = bwiId;
        this.bkiId = bkiId;
        this.stiId = stiId;
    }

    public BorrowInfo(String bwiId, String bkiId) {
        this.bwiId = bwiId;
        this.bkiId = bkiId;
    }

    public BorrowInfo(String bwiId, BookInfo bookInfo, StudentInfo studentInfo) {
        this.bwiId = bwiId;
        this.bookInfo = bookInfo;
        this.studentInfo = studentInfo;
        this.bkiId = bookInfo.getBkiId();
        this.stiId = studentInfo.getStiId();
    }

    public BorrowInfo(String bwiId, BookInfo bookInfo) {
        this.bwiId = bwiId;
        this.bookInfo = bookInfo;
        this.bkiId = bookInfo.getBkiId();
    }

    /** full constructor */
    public BorrowInfo(String bwiId, String bkiId, String stiId, String bwiName, Double bwiPrice, String bwiType, Date bwiBorrowDate, Integer bwiCount, Date bwiReturnDate, String bwiCzy) {
        this.bwiId = bwiId;
        this.bkiId = bkiId;
        this.stiId = stiId;
        this.bwiName = bwiName;
        this.bwiPrice = bwiPrice;
        this.bwiType = bwiType;
        this.bwiBorrowDate = bwiBorrowDate;
        this.bwiCount = bwiCount;
        this.bwiReturnDate = bwiReturnDate;
        this.bwiCzy = bwiCzy;
    }

    public BorrowInfo(String bwiId, BookInfo bookInfo, StudentInfo studentInfo, String bwiName, Double bwiPrice, String bwiType, Date bwiBorrowDate, Integer bwiCount, Date bwiReturnDate, String bwiCzy) {
        this.bwiId = bwiId;
        this.bookInfo = bookInfo;
        this.studentInfo = studentInfo;
        this.bkiId = bookInfo.getBkiId();
        this.stiId = studentInfo.getStiId();
        this.bwiName = bwiName;
        this.bwiPrice = bwiPrice;
        this.bwiType = bwiType;
        this.bwiBorrowDate = bwiBorrowDate;
        this.bwiCount = bwiCount;
        this.bwiReturnDate = bwiReturnDate;
        this.bwiCzy = bwiCzy;
    }

    public String getBwiId() {
        return bwiId;
    }

    public void setBwiId(String bwiId) {
        this.bwiId = bwiId;
    }

    public String getBkiId() {
        return bkiId;
    }

    public void setBkiId(String bkiId) {
        this.bkiId = bkiId;
    }

    public String getStiId() {
        return stiId;
    }

    public void setStiId(String stiId) {
        this.stiId = stiId;
    }

    public BookInfo getBookInfo() {
        return this.bookInfo;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }

    public StudentInfo getStudentInfo() {
        return this.studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }

    public String getBwiName() {
        return bwiName;
    }

    public void setBwiName(String bwiName) {
        this.bwiName = bwiName;
    }

    public Double getBwiPrice() {
        return bwiPrice;
    }

    public void setBwiPrice(Double bwiPrice) {
        this.bwiPrice = bwiPrice;
    }

    public String getBwiType() {
        return bwiType;
    }

    public void setBwiType(String bwiType) {
        this.bwiType = bwiType;
    }

    public Date getBwiBorrowDate() {
        return bwiBorrowDate;
    }

    public void setBwiBorrowDate(Date bwiBorrowDate) {
        this.bwiBorrowDate = bwiBorrowDate;
    }

    public Integer getBwiCount() {
        return bwiCount;
    }

    public void setBwiCount(Integer bwiCount) {
        this.bwiCount = bwiCount;
    }

    public Date getBwiReturnDate() {
        return bwiReturnDate;
    }

    public void setBwiReturnDate(Date bwiReturnDate) {
        this.bwiReturnDate = bwiReturnDate;
    }

    public String getBwiCzy() {
        return bwiCzy;
    }

    public void setBwiCzy(String bwiCzy) {
        this.bwiCzy = bwiCzy;
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
        BorrowInfo other = (BorrowInfo) that;
        return (this.getBwiId() == null ? other.getBwiId() == null : this.getBwiId().equals(other.getBwiId()))
            && (this.getBkiId() == null ? other.getBkiId() == null : this.getBkiId().equals(other.getBkiId()))
            && (this.getStiId() == null ? other.getStiId() == null : this.getStiId().equals(other.getStiId()))
            && (this.getBookInfo() == null ? other.getBookInfo() == null : this.getBookInfo().equals(other.getBookInfo()))
            && (this.getStudentInfo() == null ? other.getStudentInfo() == null : this.getStudentInfo().equals(other.getStudentInfo()))
            && (this.getBwiName() == null ? other.getBwiName() == null : this.getBwiName().equals(other.getBwiName()))
            && (this.getBwiPrice() == null ? other.getBwiPrice() == null : this.getBwiPrice().equals(other.getBwiPrice()))
            && (this.getBwiType() == null ? other.getBwiType() == null : this.getBwiType().equals(other.getBwiType()))
            && (this.getBwiBorrowDate() == null ? other.getBwiBorrowDate() == null : this.getBwiBorrowDate().equals(other.getBwiBorrowDate()))
            && (this.getBwiCount() == null ? other.getBwiCount() == null : this.getBwiCount().equals(other.getBwiCount()))
            && (this.getBwiReturnDate() == null ? other.getBwiReturnDate() == null : this.getBwiReturnDate().equals(other.getBwiReturnDate()))
            && (this.getBwiCzy() == null ? other.getBwiCzy() == null : this.getBwiCzy().equals(other.getBwiCzy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBwiId() == null) ? 0 : getBwiId().hashCode());
        result = prime * result + ((getBkiId() == null) ? 0 : getBkiId().hashCode());
        result = prime * result + ((getStiId() == null) ? 0 : getStiId().hashCode());
        result = prime * result + ((getBookInfo() == null) ? 0 : getBookInfo().hashCode());
        result = prime * result + ((getStudentInfo() == null) ? 0 : getStudentInfo().hashCode());
        result = prime * result + ((getBwiName() == null) ? 0 : getBwiName().hashCode());
        result = prime * result + ((getBwiPrice() == null) ? 0 : getBwiPrice().hashCode());
        result = prime * result + ((getBwiType() == null) ? 0 : getBwiType().hashCode());
        result = prime * result + ((getBwiBorrowDate() == null) ? 0 : getBwiBorrowDate().hashCode());
        result = prime * result + ((getBwiCount() == null) ? 0 : getBwiCount().hashCode());
        result = prime * result + ((getBwiReturnDate() == null) ? 0 : getBwiReturnDate().hashCode());
        result = prime * result + ((getBwiCzy() == null) ? 0 : getBwiCzy().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bwiId=").append(bwiId);
        sb.append(", bkiId=").append(bkiId);
        sb.append(", stiId=").append(stiId);
        sb.append(", bookInfo=").append(bookInfo);
        sb.append(", studentInfo=").append(studentInfo);
        sb.append(", bwiName=").append(bwiName);
        sb.append(", bwiPrice=").append(bwiPrice);
        sb.append(", bwiType=").append(bwiType);
        sb.append(", bwiBorrowDate=").append(bwiBorrowDate);
        sb.append(", bwiCount=").append(bwiCount);
        sb.append(", bwiReturnDate=").append(bwiReturnDate);
        sb.append(", bwiCzy=").append(bwiCzy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}