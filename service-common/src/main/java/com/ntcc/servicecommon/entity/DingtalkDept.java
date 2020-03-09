package com.ntcc.servicecommon.entity;

import javax.persistence.*;

@Table(name = "dingtalk_dept")
public class DingtalkDept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dept_name")
    private String deptName;

    private Long parentid;

    /**
     * 当前部门在父部门下的所有子部门中的排序值，接口中为order
     */
    private Byte pos;

    /**
     * 是否同步创建一个关联此部门的企业群，true表示是，false表示不是
     */
    @Column(name = "createDeptGroup")
    private Boolean createdeptgroup;

    /**
     * 当部门群已经创建后，是否有新人加入部门会自动加入该群，true表示是，false表示不是
     */
    @Column(name = "autoAddUser")
    private Boolean autoadduser;

    /**
     * 部门的主管列表，取值为由主管的userid组成的字符串，不同的userid使用“|”符号进行分割
     */
    @Column(name = "deptManagerUseridList")
    private String deptmanageruseridlist;

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
     * @return dept_name
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return parentid
     */
    public Long getParentid() {
        return parentid;
    }

    /**
     * @param parentid
     */
    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取当前部门在父部门下的所有子部门中的排序值，接口中为order
     *
     * @return pos - 当前部门在父部门下的所有子部门中的排序值，接口中为order
     */
    public Byte getPos() {
        return pos;
    }

    /**
     * 设置当前部门在父部门下的所有子部门中的排序值，接口中为order
     *
     * @param pos 当前部门在父部门下的所有子部门中的排序值，接口中为order
     */
    public void setPos(Byte pos) {
        this.pos = pos;
    }

    /**
     * 获取是否同步创建一个关联此部门的企业群，true表示是，false表示不是
     *
     * @return createDeptGroup - 是否同步创建一个关联此部门的企业群，true表示是，false表示不是
     */
    public Boolean getCreatedeptgroup() {
        return createdeptgroup;
    }

    /**
     * 设置是否同步创建一个关联此部门的企业群，true表示是，false表示不是
     *
     * @param createdeptgroup 是否同步创建一个关联此部门的企业群，true表示是，false表示不是
     */
    public void setCreatedeptgroup(Boolean createdeptgroup) {
        this.createdeptgroup = createdeptgroup;
    }

    /**
     * 获取当部门群已经创建后，是否有新人加入部门会自动加入该群，true表示是，false表示不是
     *
     * @return autoAddUser - 当部门群已经创建后，是否有新人加入部门会自动加入该群，true表示是，false表示不是
     */
    public Boolean getAutoadduser() {
        return autoadduser;
    }

    /**
     * 设置当部门群已经创建后，是否有新人加入部门会自动加入该群，true表示是，false表示不是
     *
     * @param autoadduser 当部门群已经创建后，是否有新人加入部门会自动加入该群，true表示是，false表示不是
     */
    public void setAutoadduser(Boolean autoadduser) {
        this.autoadduser = autoadduser;
    }

    /**
     * 获取部门的主管列表，取值为由主管的userid组成的字符串，不同的userid使用“|”符号进行分割
     *
     * @return deptManagerUseridList - 部门的主管列表，取值为由主管的userid组成的字符串，不同的userid使用“|”符号进行分割
     */
    public String getDeptmanageruseridlist() {
        return deptmanageruseridlist;
    }

    /**
     * 设置部门的主管列表，取值为由主管的userid组成的字符串，不同的userid使用“|”符号进行分割
     *
     * @param deptmanageruseridlist 部门的主管列表，取值为由主管的userid组成的字符串，不同的userid使用“|”符号进行分割
     */
    public void setDeptmanageruseridlist(String deptmanageruseridlist) {
        this.deptmanageruseridlist = deptmanageruseridlist;
    }
}