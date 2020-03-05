package com.ntcc.servicecommon.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user_salary_tpl")
public class UserSalaryTpl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "leader_id")
    private Long leaderId;

    @Column(name = "staff_id")
    private Long staffId;

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

    @Column(name = "begin_date")
    private Date beginDate;

    @Column(name = "end_date")
    private Date endDate;

    /**
     * 1计天，2包月，3计量
     */
    @Column(name = "salary_type")
    private Byte salaryType;

    @Column(name = "salary_money")
    private BigDecimal salaryMoney;

    @Column(name = "hour_per_day")
    private Byte hourPerDay;

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
     * @return staff_id
     */
    public Long getStaffId() {
        return staffId;
    }

    /**
     * @param staffId
     */
    public void setStaffId(Long staffId) {
        this.staffId = staffId;
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
     * 获取1计天，2包月，3计量
     *
     * @return salary_type - 1计天，2包月，3计量
     */
    public Byte getSalaryType() {
        return salaryType;
    }

    /**
     * 设置1计天，2包月，3计量
     *
     * @param salaryType 1计天，2包月，3计量
     */
    public void setSalaryType(Byte salaryType) {
        this.salaryType = salaryType;
    }

    /**
     * @return salary_money
     */
    public BigDecimal getSalaryMoney() {
        return salaryMoney;
    }

    /**
     * @param salaryMoney
     */
    public void setSalaryMoney(BigDecimal salaryMoney) {
        this.salaryMoney = salaryMoney;
    }

    /**
     * @return hour_per_day
     */
    public Byte getHourPerDay() {
        return hourPerDay;
    }

    /**
     * @param hourPerDay
     */
    public void setHourPerDay(Byte hourPerDay) {
        this.hourPerDay = hourPerDay;
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