package com.ntcc.servicecommon.entity;

import javax.persistence.*;

@Table(name = "labour_builder")
public class LabourBuilder {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "BuilderID")
    private Long builderid;

    @Column(name = "LabourCompanyID")
    private Long labourcompanyid;

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