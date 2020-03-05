package com.ntcc.servicecommon.entity;

import java.util.Date;
import javax.persistence.*;

public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_id")
    private Long companyId;

    private String name;

    @Column(name = "sub_name")
    private String subName;

    private String code;

    /**
     * 0未开工，1在建，2已完工
     */
    private Byte status;

    private String manager;

    private Byte province;

    private Byte city;

    private Byte area;

    private String address;

    private String constructor;

    private String supervisor;

    private String builder;

    private String designer;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "finish_date")
    private Date finishDate;

    /**
     * -1 未分类  , 0 工厂  ,1住宅
     */
    private Byte type;

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
     * @return sub_name
     */
    public String getSubName() {
        return subName;
    }

    /**
     * @param subName
     */
    public void setSubName(String subName) {
        this.subName = subName;
    }

    /**
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取0未开工，1在建，2已完工
     *
     * @return status - 0未开工，1在建，2已完工
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置0未开工，1在建，2已完工
     *
     * @param status 0未开工，1在建，2已完工
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * @param manager
     */
    public void setManager(String manager) {
        this.manager = manager;
    }

    /**
     * @return province
     */
    public Byte getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(Byte province) {
        this.province = province;
    }

    /**
     * @return city
     */
    public Byte getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(Byte city) {
        this.city = city;
    }

    /**
     * @return area
     */
    public Byte getArea() {
        return area;
    }

    /**
     * @param area
     */
    public void setArea(Byte area) {
        this.area = area;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return constructor
     */
    public String getConstructor() {
        return constructor;
    }

    /**
     * @param constructor
     */
    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    /**
     * @return supervisor
     */
    public String getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor
     */
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * @return builder
     */
    public String getBuilder() {
        return builder;
    }

    /**
     * @param builder
     */
    public void setBuilder(String builder) {
        this.builder = builder;
    }

    /**
     * @return designer
     */
    public String getDesigner() {
        return designer;
    }

    /**
     * @param designer
     */
    public void setDesigner(String designer) {
        this.designer = designer;
    }

    /**
     * @return start_date
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return finish_date
     */
    public Date getFinishDate() {
        return finishDate;
    }

    /**
     * @param finishDate
     */
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    /**
     * 获取-1 未分类  , 0 工厂  ,1住宅
     *
     * @return type - -1 未分类  , 0 工厂  ,1住宅
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置-1 未分类  , 0 工厂  ,1住宅
     *
     * @param type -1 未分类  , 0 工厂  ,1住宅
     */
    public void setType(Byte type) {
        this.type = type;
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