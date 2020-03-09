package com.ntcc.servicecommon.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_record")
public class UserRecord {
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

    @Column(name = "record_date")
    private Date recordDate;

    /**
     * 1正常班，2加班
     */
    @Column(name = "record_type")
    private Byte recordType;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    /**
     * 1正常、2异常
     */
    @Column(name = "record_result")
    private Byte recordResult;

    /**
     * 数据状态 0正常
     */
    private Byte status;

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
     * @return record_date
     */
    public Date getRecordDate() {
        return recordDate;
    }

    /**
     * @param recordDate
     */
    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    /**
     * 获取1正常班，2加班
     *
     * @return record_type - 1正常班，2加班
     */
    public Byte getRecordType() {
        return recordType;
    }

    /**
     * 设置1正常班，2加班
     *
     * @param recordType 1正常班，2加班
     */
    public void setRecordType(Byte recordType) {
        this.recordType = recordType;
    }

    /**
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取1正常、2异常
     *
     * @return record_result - 1正常、2异常
     */
    public Byte getRecordResult() {
        return recordResult;
    }

    /**
     * 设置1正常、2异常
     *
     * @param recordResult 1正常、2异常
     */
    public void setRecordResult(Byte recordResult) {
        this.recordResult = recordResult;
    }

    /**
     * 获取数据状态 0正常
     *
     * @return status - 数据状态 0正常
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置数据状态 0正常
     *
     * @param status 数据状态 0正常
     */
    public void setStatus(Byte status) {
        this.status = status;
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