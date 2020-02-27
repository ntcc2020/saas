package com.ntcc.accountservice.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "account_profile")
public class AccountProfile {
    @Id
    @Column(name = "USERNO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userno;

    @Column(name = "PROFILEDOMAIN")
    private Integer profiledomain;

    @Column(name = "NICKNAME")
    private String nickname;

    @Column(name = "REALNAME")
    private String realname;

    @Column(name = "PROFILESTATUS")
    private Integer profilestatus;

    @Column(name = "PROFILEDESC")
    private String profiledesc;

    @Column(name = "CREATEDATE")
    private Date createdate;

    @Column(name = "CREATEIP")
    private String createip;

    @Column(name = "LASTUPDATEDATE")
    private Date lastupdatedate;

    @Column(name = "LASTUPDATEIP")
    private String lastupdateip;

    @Column(name = "LASTSIGNONDATE")
    private Date lastsignondate;

    @Column(name = "LASTSIGNONIP")
    private String lastsignonip;

    /**
     * @return USERNO
     */
    public Integer getUserno() {
        return userno;
    }

    /**
     * @param userno
     */
    public void setUserno(Integer userno) {
        this.userno = userno;
    }

    /**
     * @return PROFILEDOMAIN
     */
    public Integer getProfiledomain() {
        return profiledomain;
    }

    /**
     * @param profiledomain
     */
    public void setProfiledomain(Integer profiledomain) {
        this.profiledomain = profiledomain;
    }

    /**
     * @return NICKNAME
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return REALNAME
     */
    public String getRealname() {
        return realname;
    }

    /**
     * @param realname
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * @return PROFILESTATUS
     */
    public Integer getProfilestatus() {
        return profilestatus;
    }

    /**
     * @param profilestatus
     */
    public void setProfilestatus(Integer profilestatus) {
        this.profilestatus = profilestatus;
    }

    /**
     * @return PROFILEDESC
     */
    public String getProfiledesc() {
        return profiledesc;
    }

    /**
     * @param profiledesc
     */
    public void setProfiledesc(String profiledesc) {
        this.profiledesc = profiledesc;
    }

    /**
     * @return CREATEDATE
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * @return CREATEIP
     */
    public String getCreateip() {
        return createip;
    }

    /**
     * @param createip
     */
    public void setCreateip(String createip) {
        this.createip = createip;
    }

    /**
     * @return LASTUPDATEDATE
     */
    public Date getLastupdatedate() {
        return lastupdatedate;
    }

    /**
     * @param lastupdatedate
     */
    public void setLastupdatedate(Date lastupdatedate) {
        this.lastupdatedate = lastupdatedate;
    }

    /**
     * @return LASTUPDATEIP
     */
    public String getLastupdateip() {
        return lastupdateip;
    }

    /**
     * @param lastupdateip
     */
    public void setLastupdateip(String lastupdateip) {
        this.lastupdateip = lastupdateip;
    }

    /**
     * @return LASTSIGNONDATE
     */
    public Date getLastsignondate() {
        return lastsignondate;
    }

    /**
     * @param lastsignondate
     */
    public void setLastsignondate(Date lastsignondate) {
        this.lastsignondate = lastsignondate;
    }

    /**
     * @return LASTSIGNONIP
     */
    public String getLastsignonip() {
        return lastsignonip;
    }

    /**
     * @param lastsignonip
     */
    public void setLastsignonip(String lastsignonip) {
        this.lastsignonip = lastsignonip;
    }
}