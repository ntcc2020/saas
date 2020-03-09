package com.ntcc.servicecommon.entity;

import javax.persistence.*;

@Table(name = "labour_user")
public class LabourUser {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "UserID")
    private Long userid;

    @Column(name = "LabourID")
    private Long labourid;

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
     * @return UserID
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
     * @return LabourID
     */
    public Long getLabourid() {
        return labourid;
    }

    /**
     * @param labourid
     */
    public void setLabourid(Long labourid) {
        this.labourid = labourid;
    }
}