package com.ntcc.servicecommon.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "salary_detail")
public class SalaryDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "salary_id")
    private Long salaryId;

    @Column(name = "record_id")
    private Long recordId;

    /**
     * 0平时，1加班，2补发
     */
    private Byte type;

    @Column(name = "prepay_money")
    private BigDecimal prepayMoney;

    /**
     * 1待发放，2发放中，3已发放
     */
    private Byte status;

    @Column(name = "pay_salary")
    private BigDecimal paySalary;

    private String memo;

    /**
     * 1未查看，2已查看
     */
    @Column(name = "view_status")
    private Byte viewStatus;

    /**
     * 0未删除，1已删除
     */
    @Column(name = "is_delete")
    private Byte isDelete;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_by")
    private Long updatedBy;

    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return salary_id
     */
    public Long getSalaryId() {
        return salaryId;
    }

    /**
     * @param salaryId
     */
    public void setSalaryId(Long salaryId) {
        this.salaryId = salaryId;
    }

    /**
     * @return record_id
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * @param recordId
     */
    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    /**
     * 获取0平时，1加班，2补发
     *
     * @return type - 0平时，1加班，2补发
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置0平时，1加班，2补发
     *
     * @param type 0平时，1加班，2补发
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * @return prepay_money
     */
    public BigDecimal getPrepayMoney() {
        return prepayMoney;
    }

    /**
     * @param prepayMoney
     */
    public void setPrepayMoney(BigDecimal prepayMoney) {
        this.prepayMoney = prepayMoney;
    }

    /**
     * 获取1待发放，2发放中，3已发放
     *
     * @return status - 1待发放，2发放中，3已发放
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置1待发放，2发放中，3已发放
     *
     * @param status 1待发放，2发放中，3已发放
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return pay_salary
     */
    public BigDecimal getPaySalary() {
        return paySalary;
    }

    /**
     * @param paySalary
     */
    public void setPaySalary(BigDecimal paySalary) {
        this.paySalary = paySalary;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 获取1未查看，2已查看
     *
     * @return view_status - 1未查看，2已查看
     */
    public Byte getViewStatus() {
        return viewStatus;
    }

    /**
     * 设置1未查看，2已查看
     *
     * @param viewStatus 1未查看，2已查看
     */
    public void setViewStatus(Byte viewStatus) {
        this.viewStatus = viewStatus;
    }

    /**
     * 获取0未删除，1已删除
     *
     * @return is_delete - 0未删除，1已删除
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 设置0未删除，1已删除
     *
     * @param isDelete 0未删除，1已删除
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * @return created_by
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return created_time
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * @param createdTime
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * @return updated_by
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * @param updatedBy
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * @return updated_time
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * @param updatedTime
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}