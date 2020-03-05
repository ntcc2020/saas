package com.ntcc.servicecommon.entity;

import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /**
     * 1男，2女
     */
    private Byte sex;

    /**
     * 0身份证，1护照 等等
     */
    @Column(name = "cert_type")
    private Byte certType;

    @Column(name = "cert_no")
    private String certNo;

    @Column(name = "staff_no")
    private String staffNo;

    private String mobile;

    /**
     * 0普通员工，1工程师，2主管，3经理，4总监，5总经理
     */
    private Byte titile;

    /**
     * 0员级、1助级、2中级、3副高级、4正高级
     */
    private Byte position;

    /**
     * 0资料员,1钢筋工,2建筑工,3电气设备安装工,4管工,5装饰装修工,6混凝土工,7架子工,8资料员,9施工员,10木工,11杂工
     */
    @Column(name = "work_type")
    private Byte workType;

    /**
     * 0小工，1大工，2工头
     */
    @Column(name = "work_level")
    private Byte workLevel;

    /**
     * 1建设商人员、2包工头、3劳务人员
     */
    private Byte type;

    /**
     * 0启用，1停用
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
     * 获取1男，2女
     *
     * @return sex - 1男，2女
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 设置1男，2女
     *
     * @param sex 1男，2女
     */
    public void setSex(Byte sex) {
        this.sex = sex;
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
     * @return staff_no
     */
    public String getStaffNo() {
        return staffNo;
    }

    /**
     * @param staffNo
     */
    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
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
     * 获取0普通员工，1工程师，2主管，3经理，4总监，5总经理
     *
     * @return titile - 0普通员工，1工程师，2主管，3经理，4总监，5总经理
     */
    public Byte getTitile() {
        return titile;
    }

    /**
     * 设置0普通员工，1工程师，2主管，3经理，4总监，5总经理
     *
     * @param titile 0普通员工，1工程师，2主管，3经理，4总监，5总经理
     */
    public void setTitile(Byte titile) {
        this.titile = titile;
    }

    /**
     * 获取0员级、1助级、2中级、3副高级、4正高级
     *
     * @return position - 0员级、1助级、2中级、3副高级、4正高级
     */
    public Byte getPosition() {
        return position;
    }

    /**
     * 设置0员级、1助级、2中级、3副高级、4正高级
     *
     * @param position 0员级、1助级、2中级、3副高级、4正高级
     */
    public void setPosition(Byte position) {
        this.position = position;
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
     * 获取0小工，1大工，2工头
     *
     * @return work_level - 0小工，1大工，2工头
     */
    public Byte getWorkLevel() {
        return workLevel;
    }

    /**
     * 设置0小工，1大工，2工头
     *
     * @param workLevel 0小工，1大工，2工头
     */
    public void setWorkLevel(Byte workLevel) {
        this.workLevel = workLevel;
    }

    /**
     * 获取1建设商人员、2包工头、3劳务人员
     *
     * @return type - 1建设商人员、2包工头、3劳务人员
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置1建设商人员、2包工头、3劳务人员
     *
     * @param type 1建设商人员、2包工头、3劳务人员
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取0启用，1停用
     *
     * @return status - 0启用，1停用
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置0启用，1停用
     *
     * @param status 0启用，1停用
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