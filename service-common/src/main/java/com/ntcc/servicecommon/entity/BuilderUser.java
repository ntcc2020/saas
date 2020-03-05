package com.ntcc.servicecommon.entity;

import javax.persistence.*;

@Table(name = "builder_user")
public class BuilderUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "UserID")
    private Long userid;

    @Column(name = "BuilderID")
    private Long builderid;

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
     * @return BuilderID
     */
    public Long getBuilderid() {
        return builderid;
    }

    /**
     * @param builderid
     */
    public void setBuilderid(Long builderid) {
        this.builderid = builderid;
    }
}