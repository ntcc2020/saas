package com.ntcc.servicecommon.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user_record_config")
public class UserRecordConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "user_id")
    private Long userId;

    /**
     * 自有、劳务、专业
     */
    @Column(name = "user_type")
    private Byte userType;

    @Column(name = "work_type")
    private Byte workType;

    @Column(name = "work_level")
    private Byte workLevel;

    @Column(name = "begin_date")
    private Date beginDate;

    @Column(name = "end_date")
    private Date endDate;

    /**
     * 长日班、上午班、下午班、夜班
     */
    @Column(name = "record_type")
    private Byte recordType;

    @Column(name = "is_overtime")
    private Byte isOvertime;

    @Column(name = "hour_no")
    private Byte hourNo;

    @Column(name = "money_day")
    private BigDecimal moneyDay;

    @Column(name = "in_start_minute")
    private Byte inStartMinute;

    @Column(name = "in_start_hour")
    private Byte inStartHour;

    @Column(name = "in_end_hour")
    private Byte inEndHour;

    @Column(name = "in_end_minute")
    private Byte inEndMinute;

    @Column(name = "out_start_hour")
    private Byte outStartHour;

    @Column(name = "out_start_minute")
    private Byte outStartMinute;

    @Column(name = "out_end_hour")
    private Byte outEndHour;

    @Column(name = "out_end_minute")
    private Byte outEndMinute;

    /**
     * 数据状态
     */
    private Byte status;

    /**
     * 0未删除，1已删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

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
     * 获取自有、劳务、专业
     *
     * @return user_type - 自有、劳务、专业
     */
    public Byte getUserType() {
        return userType;
    }

    /**
     * 设置自有、劳务、专业
     *
     * @param userType 自有、劳务、专业
     */
    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    /**
     * @return work_type
     */
    public Byte getWorkType() {
        return workType;
    }

    /**
     * @param workType
     */
    public void setWorkType(Byte workType) {
        this.workType = workType;
    }

    /**
     * @return work_level
     */
    public Byte getWorkLevel() {
        return workLevel;
    }

    /**
     * @param workLevel
     */
    public void setWorkLevel(Byte workLevel) {
        this.workLevel = workLevel;
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
     * 获取长日班、上午班、下午班、夜班
     *
     * @return record_type - 长日班、上午班、下午班、夜班
     */
    public Byte getRecordType() {
        return recordType;
    }

    /**
     * 设置长日班、上午班、下午班、夜班
     *
     * @param recordType 长日班、上午班、下午班、夜班
     */
    public void setRecordType(Byte recordType) {
        this.recordType = recordType;
    }

    /**
     * @return is_overtime
     */
    public Byte getIsOvertime() {
        return isOvertime;
    }

    /**
     * @param isOvertime
     */
    public void setIsOvertime(Byte isOvertime) {
        this.isOvertime = isOvertime;
    }

    /**
     * @return hour_no
     */
    public Byte getHourNo() {
        return hourNo;
    }

    /**
     * @param hourNo
     */
    public void setHourNo(Byte hourNo) {
        this.hourNo = hourNo;
    }

    /**
     * @return money_day
     */
    public BigDecimal getMoneyDay() {
        return moneyDay;
    }

    /**
     * @param moneyDay
     */
    public void setMoneyDay(BigDecimal moneyDay) {
        this.moneyDay = moneyDay;
    }

    /**
     * @return in_start_minute
     */
    public Byte getInStartMinute() {
        return inStartMinute;
    }

    /**
     * @param inStartMinute
     */
    public void setInStartMinute(Byte inStartMinute) {
        this.inStartMinute = inStartMinute;
    }

    /**
     * @return in_start_hour
     */
    public Byte getInStartHour() {
        return inStartHour;
    }

    /**
     * @param inStartHour
     */
    public void setInStartHour(Byte inStartHour) {
        this.inStartHour = inStartHour;
    }

    /**
     * @return in_end_hour
     */
    public Byte getInEndHour() {
        return inEndHour;
    }

    /**
     * @param inEndHour
     */
    public void setInEndHour(Byte inEndHour) {
        this.inEndHour = inEndHour;
    }

    /**
     * @return in_end_minute
     */
    public Byte getInEndMinute() {
        return inEndMinute;
    }

    /**
     * @param inEndMinute
     */
    public void setInEndMinute(Byte inEndMinute) {
        this.inEndMinute = inEndMinute;
    }

    /**
     * @return out_start_hour
     */
    public Byte getOutStartHour() {
        return outStartHour;
    }

    /**
     * @param outStartHour
     */
    public void setOutStartHour(Byte outStartHour) {
        this.outStartHour = outStartHour;
    }

    /**
     * @return out_start_minute
     */
    public Byte getOutStartMinute() {
        return outStartMinute;
    }

    /**
     * @param outStartMinute
     */
    public void setOutStartMinute(Byte outStartMinute) {
        this.outStartMinute = outStartMinute;
    }

    /**
     * @return out_end_hour
     */
    public Byte getOutEndHour() {
        return outEndHour;
    }

    /**
     * @param outEndHour
     */
    public void setOutEndHour(Byte outEndHour) {
        this.outEndHour = outEndHour;
    }

    /**
     * @return out_end_minute
     */
    public Byte getOutEndMinute() {
        return outEndMinute;
    }

    /**
     * @param outEndMinute
     */
    public void setOutEndMinute(Byte outEndMinute) {
        this.outEndMinute = outEndMinute;
    }

    /**
     * 获取数据状态
     *
     * @return status - 数据状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置数据状态
     *
     * @param status 数据状态
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取0未删除，1已删除
     *
     * @return is_delete - 0未删除，1已删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置0未删除，1已删除
     *
     * @param isDelete 0未删除，1已删除
     */
    public void setIsDelete(Integer isDelete) {
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