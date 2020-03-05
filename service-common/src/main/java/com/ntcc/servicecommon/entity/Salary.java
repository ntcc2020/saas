package com.ntcc.servicecommon.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "leader_id")
    private Long leaderId;

    @Column(name = "user_id")
    private Long userId;

    /**
     * 1建设商人员、2包工头、3劳务人员
     */
    @Column(name = "staff_type")
    private Byte staffType;

    private String month;

    @Column(name = "begin_date")
    private Date beginDate;

    @Column(name = "end_date")
    private Date endDate;

    /**
     * 0平时，1加班，2补发
     */
    private Byte type;

    @Column(name = "prepay_money")
    private BigDecimal prepayMoney;

    private Byte status;

    @Column(name = "pay_salary")
    private BigDecimal paySalary;

    private String memo;

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
     * @return company_id
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * @param companyId
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * @return project_id
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * @param projectId
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * @return leader_id
     */
    public Long getLeaderId() {
        return leaderId;
    }

    /**
     * @param leaderId
     */
    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取1建设商人员、2包工头、3劳务人员
     *
     * @return staff_type - 1建设商人员、2包工头、3劳务人员
     */
    public Byte getStaffType() {
        return staffType;
    }

    /**
     * 设置1建设商人员、2包工头、3劳务人员
     *
     * @param staffType 1建设商人员、2包工头、3劳务人员
     */
    public void setStaffType(Byte staffType) {
        this.staffType = staffType;
    }

    /**
     * @return month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * @return begin_date
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * @param beginDate
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * @return end_date
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status
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
     * @return view_status
     */
    public Byte getViewStatus() {
        return viewStatus;
    }

    /**
     * @param viewStatus
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