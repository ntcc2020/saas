package com.ntcc.servicecommon.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_record_log")
public class UserRecordLog {
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

    @Column(name = "dingtalk_user_id")
    private String dingtalkUserId;

    @Column(name = "record_date")
    private Date recordDate;

    @Column(name = "record_time")
    private Date recordTime;

    @Column(name = "ding_api_id")
    private String dingApiId;

    @Column(name = "ding_api_code")
    private String dingApiCode;

    @Column(name = "ding_source_type")
    private String dingSourceType;

    @Column(name = "ding_check_type")
    private String dingCheckType;

    @Column(name = "ding_time_result")
    private String dingTimeResult;

    @Column(name = "ding_location_result")
    private String dingLocationResult;

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

    @Column(name = "ding_api_request")
    private String dingApiRequest;

    @Column(name = "ding_api_response")
    private String dingApiResponse;

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
     * @return dingtalk_user_id
     */
    public String getDingtalkUserId() {
        return dingtalkUserId;
    }

    /**
     * @param dingtalkUserId
     */
    public void setDingtalkUserId(String dingtalkUserId) {
        this.dingtalkUserId = dingtalkUserId;
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
     * @return record_time
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * @param recordTime
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    /**
     * @return ding_api_id
     */
    public String getDingApiId() {
        return dingApiId;
    }

    /**
     * @param dingApiId
     */
    public void setDingApiId(String dingApiId) {
        this.dingApiId = dingApiId;
    }

    /**
     * @return ding_api_code
     */
    public String getDingApiCode() {
        return dingApiCode;
    }

    /**
     * @param dingApiCode
     */
    public void setDingApiCode(String dingApiCode) {
        this.dingApiCode = dingApiCode;
    }

    /**
     * @return ding_source_type
     */
    public String getDingSourceType() {
        return dingSourceType;
    }

    /**
     * @param dingSourceType
     */
    public void setDingSourceType(String dingSourceType) {
        this.dingSourceType = dingSourceType;
    }

    /**
     * @return ding_check_type
     */
    public String getDingCheckType() {
        return dingCheckType;
    }

    /**
     * @param dingCheckType
     */
    public void setDingCheckType(String dingCheckType) {
        this.dingCheckType = dingCheckType;
    }

    /**
     * @return ding_time_result
     */
    public String getDingTimeResult() {
        return dingTimeResult;
    }

    /**
     * @param dingTimeResult
     */
    public void setDingTimeResult(String dingTimeResult) {
        this.dingTimeResult = dingTimeResult;
    }

    /**
     * @return ding_location_result
     */
    public String getDingLocationResult() {
        return dingLocationResult;
    }

    /**
     * @param dingLocationResult
     */
    public void setDingLocationResult(String dingLocationResult) {
        this.dingLocationResult = dingLocationResult;
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

    /**
     * @return ding_api_request
     */
    public String getDingApiRequest() {
        return dingApiRequest;
    }

    /**
     * @param dingApiRequest
     */
    public void setDingApiRequest(String dingApiRequest) {
        this.dingApiRequest = dingApiRequest;
    }

    /**
     * @return ding_api_response
     */
    public String getDingApiResponse() {
        return dingApiResponse;
    }

    /**
     * @param dingApiResponse
     */
    public void setDingApiResponse(String dingApiResponse) {
        this.dingApiResponse = dingApiResponse;
    }
}