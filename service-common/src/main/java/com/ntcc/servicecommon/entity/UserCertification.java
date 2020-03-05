package com.ntcc.servicecommon.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_certification")
public class UserCertification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Userid")
    private Long userid;

    private String name;

    /**
     * 0身份证，1护照 等等
     */
    @Column(name = "cert_type")
    private Byte certType;

    @Column(name = "cert_no")
    private String certNo;

    private String mobile;

    /**
     * 0资料员,1钢筋工,2建筑工,3电气设备安装工,4管工,5装饰装修工,6混凝土工,7架子工,8资料员,9施工员,10木工,11杂工
     */
    @Column(name = "work_type")
    private Byte workType;

    @Column(name = "cert_front_url")
    private String certFrontUrl;

    @Column(name = "cert_back_url")
    private String certBackUrl;

    @Column(name = "auth_video_url")
    private String authVideoUrl;

    /**
     * 1成功，2失败，3异常
     */
    @Column(name = "auth_result")
    private Byte authResult;

    @Column(name = "auth_reason")
    private String authReason;

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

    @Column(name = "auth_api_request")
    private String authApiRequest;

    @Column(name = "auth_api_response")
    private String authApiResponse;

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
     * @return Userid
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取0身份证，1护照 等等
     *
     * @return cert_type - 0身份证，1护照 等等
     */
    public Byte getCertType() {
        return certType;
    }

    /**
     * 设置0身份证，1护照 等等
     *
     * @param certType 0身份证，1护照 等等
     */
    public void setCertType(Byte certType) {
        this.certType = certType;
    }

    /**
     * @return cert_no
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * @param certNo
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取0资料员,1钢筋工,2建筑工,3电气设备安装工,4管工,5装饰装修工,6混凝土工,7架子工,8资料员,9施工员,10木工,11杂工
     *
     * @return work_type - 0资料员,1钢筋工,2建筑工,3电气设备安装工,4管工,5装饰装修工,6混凝土工,7架子工,8资料员,9施工员,10木工,11杂工
     */
    public Byte getWorkType() {
        return workType;
    }

    /**
     * 设置0资料员,1钢筋工,2建筑工,3电气设备安装工,4管工,5装饰装修工,6混凝土工,7架子工,8资料员,9施工员,10木工,11杂工
     *
     * @param workType 0资料员,1钢筋工,2建筑工,3电气设备安装工,4管工,5装饰装修工,6混凝土工,7架子工,8资料员,9施工员,10木工,11杂工
     */
    public void setWorkType(Byte workType) {
        this.workType = workType;
    }

    /**
     * @return cert_front_url
     */
    public String getCertFrontUrl() {
        return certFrontUrl;
    }

    /**
     * @param certFrontUrl
     */
    public void setCertFrontUrl(String certFrontUrl) {
        this.certFrontUrl = certFrontUrl;
    }

    /**
     * @return cert_back_url
     */
    public String getCertBackUrl() {
        return certBackUrl;
    }

    /**
     * @param certBackUrl
     */
    public void setCertBackUrl(String certBackUrl) {
        this.certBackUrl = certBackUrl;
    }

    /**
     * @return auth_video_url
     */
    public String getAuthVideoUrl() {
        return authVideoUrl;
    }

    /**
     * @param authVideoUrl
     */
    public void setAuthVideoUrl(String authVideoUrl) {
        this.authVideoUrl = authVideoUrl;
    }

    /**
     * 获取1成功，2失败，3异常
     *
     * @return auth_result - 1成功，2失败，3异常
     */
    public Byte getAuthResult() {
        return authResult;
    }

    /**
     * 设置1成功，2失败，3异常
     *
     * @param authResult 1成功，2失败，3异常
     */
    public void setAuthResult(Byte authResult) {
        this.authResult = authResult;
    }

    /**
     * @return auth_reason
     */
    public String getAuthReason() {
        return authReason;
    }

    /**
     * @param authReason
     */
    public void setAuthReason(String authReason) {
        this.authReason = authReason;
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

    /**
     * @return auth_api_request
     */
    public String getAuthApiRequest() {
        return authApiRequest;
    }

    /**
     * @param authApiRequest
     */
    public void setAuthApiRequest(String authApiRequest) {
        this.authApiRequest = authApiRequest;
    }

    /**
     * @return auth_api_response
     */
    public String getAuthApiResponse() {
        return authApiResponse;
    }

    /**
     * @param authApiResponse
     */
    public void setAuthApiResponse(String authApiResponse) {
        this.authApiResponse = authApiResponse;
    }
}