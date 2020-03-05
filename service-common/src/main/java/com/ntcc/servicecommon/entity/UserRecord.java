package com.ntcc.servicecommon.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_record")
public class UserRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "project_id")
    private String projectId;

    @Column(name = "user_id")
    private String userId;

    /**
     * 自有、劳务、专业
     */
    @Column(name = "user_type")
    private String userType;

    @Column(name = "record_date")
    private Date recordDate;

    @Column(name = "record_type")
    private String recordType;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "record_result")
    private String recordResult;

    /**
     * 数据状态
     */
    private String status;

    /**
     * 0未删除，1已删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return project_id
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * @param projectId
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取自有、劳务、专业
     *
     * @return user_type - 自有、劳务、专业
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置自有、劳务、专业
     *
     * @param userType 自有、劳务、专业
     */
    public void setUserType(String userType) {
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
     * @return record_type
     */
    public String getRecordType() {
        return recordType;
    }

    /**
     * @param recordType
     */
    public void setRecordType(String recordType) {
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
     * @return record_result
     */
    public String getRecordResult() {
        return recordResult;
    }

    /**
     * @param recordResult
     */
    public void setRecordResult(String recordResult) {
        this.recordResult = recordResult;
    }

    /**
     * 获取数据状态
     *
     * @return status - 数据状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置数据状态
     *
     * @param status 数据状态
     */
    public void setStatus(String status) {
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
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy
     */
    public void setCreatedBy(String createdBy) {
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
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * @param updatedBy
     */
    public void setUpdatedBy(String updatedBy) {
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