package com.ntcc.servicecommon.entity;

import java.util.Date;
import javax.persistence.*;

public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "sub_name")
    private String subName;

    /**
     * 1.建设商 2.劳务公司 
     */
    private Byte type;

    private String desc;

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
     * 获取1.建设商 2.劳务公司 
     *
     * @return type - 1.建设商 2.劳务公司 
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置1.建设商 2.劳务公司 
     *
     * @param type 1.建设商 2.劳务公司 
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
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