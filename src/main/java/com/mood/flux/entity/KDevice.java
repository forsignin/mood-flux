package com.mood.flux.entity;/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.0.0
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * K_DEVICE
 * 
 * @author bianj
 * @version 1.0.0 2018-07-15
 */
@Entity
@Table(name = "K_DEVICE")
public class KDevice implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3743395520462441763L;

    /**  */
    @Id
    @Column(name = "ID", unique = true, nullable = false, length = 19)
    private Long id;

    /** mac地址 */
    @Column(name = "MAC", unique = true, nullable = false, length = 64)
    private String mac;

    /** 备注 */
    @Column(name = "REMARK", nullable = true, length = 255)
    private String remark;

    /**  */
    @Column(name = "ACCOUNT_ID", nullable = true, length = 19)
    private Long accountId;

    /**  */
    @Column(name = "VERSION", nullable = true, length = 64)
    private String version;

    /**
     * 获取
     * 
     * @return 
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置
     * 
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取mac地址
     * 
     * @return mac地址
     */
    public String getMac() {
        return this.mac;
    }

    /**
     * 设置mac地址
     * 
     * @param mac
     *          mac地址
     */
    public void setMac(String mac) {
        this.mac = mac;
    }

    /**
     * 获取备注
     * 
     * @return 备注
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 设置备注
     * 
     * @param remark
     *          备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * 设置
     * 
     * @param accountId
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * 设置
     * 
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }
}