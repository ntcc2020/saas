package com.ntcc.accountservice.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "account_auth")
public class AccountAuth {
    @Id
    @Column(name = "AUTHNO")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select nextval(seq_account_auth);")
    private Integer authno;

    @Column(name = "USERNO")
    private Integer userno;

    @Column(name = "AUTHVALUETYPE")
    private Integer authvaluetype;

    @Column(name = "AUTHVALUE")
    private String authvalue;

    @Column(name = "AUTHPWD")
    private String authpwd;

    @Column(name = "AUTHSTATUS")
    private Integer authstatus;

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
     * @return AUTHNO
     */
    public Integer getAuthno() {
        return authno;
    }

    /**
     * @param authno
     */
    public void setAuthno(Integer authno) {
        this.authno = authno;
    }

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
     * @return AUTHVALUETYPE
     */
    public Integer getAuthvaluetype() {
        return authvaluetype;
    }

    /**
     * @param authvaluetype
     */
    public void setAuthvaluetype(Integer authvaluetype) {
        this.authvaluetype = authvaluetype;
    }

    /**
     * @return AUTHVALUE
     */
    public String getAuthvalue() {
        return authvalue;
    }

    /**
     * @param authvalue
     */
    public void setAuthvalue(String authvalue) {
        this.authvalue = authvalue;
    }

    /**
     * @return AUTHPWD
     */
    public String getAuthpwd() {
        return authpwd;
    }

    /**
     * @param authpwd
     */
    public void setAuthpwd(String authpwd) {
        this.authpwd = authpwd;
    }

    /**
     * @return AUTHSTATUS
     */
    public Integer getAuthstatus() {
        return authstatus;
    }

    /**
     * @param authstatus
     */
    public void setAuthstatus(Integer authstatus) {
        this.authstatus = authstatus;
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