package com.ntcc.servicecommon.entity;

import javax.persistence.*;

@Table(name = "labour_project")
public class LabourProject {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ProjectId")
    private Long projectid;

    @Column(name = "LabourCompanyID")
    private Long labourcompanyid;

    /**
     * 1.建设方发放 2.劳务公司自己发放
     */
    @Column(name = "WagePaymentType")
    private Byte wagepaymenttype;

    /**
     * 0是，1否
     */
    @Column(name = "isProfessional")
    private Byte isprofessional;

    /**
     * @return Id
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
     * @return ProjectId
     */
    public Long getProjectid() {
        return projectid;
    }

    /**
     * @param projectid
     */
    public void setProjectid(Long projectid) {
        this.projectid = projectid;
    }

    /**
     * @return LabourCompanyID
     */
    public Long getLabourcompanyid() {
        return labourcompanyid;
    }

    /**
     * @param labourcompanyid
     */
    public void setLabourcompanyid(Long labourcompanyid) {
        this.labourcompanyid = labourcompanyid;
    }

    /**
     * 获取1.建设方发放 2.劳务公司自己发放
     *
     * @return WagePaymentType - 1.建设方发放 2.劳务公司自己发放
     */
    public Byte getWagepaymenttype() {
        return wagepaymenttype;
    }

    /**
     * 设置1.建设方发放 2.劳务公司自己发放
     *
     * @param wagepaymenttype 1.建设方发放 2.劳务公司自己发放
     */
    public void setWagepaymenttype(Byte wagepaymenttype) {
        this.wagepaymenttype = wagepaymenttype;
    }

    /**
     * 获取0是，1否
     *
     * @return isProfessional - 0是，1否
     */
    public Byte getIsprofessional() {
        return isprofessional;
    }

    /**
     * 设置0是，1否
     *
     * @param isprofessional 0是，1否
     */
    public void setIsprofessional(Byte isprofessional) {
        this.isprofessional = isprofessional;
    }
}