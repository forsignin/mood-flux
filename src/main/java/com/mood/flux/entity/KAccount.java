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

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * K_ACCOUNT
 * 
 * @author bianj
 * @version 1.0.0 2018-07-15
 */
@Entity
@Table(name = "K_ACCOUNT")
public class KAccount implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2376392767982151653L;

    /**  */
    @Id
    @Column(name = "ID", unique = true, nullable = false, length = 19)
    private Long id;

    /**  */
    @Column(name = "ACCOUNT", unique = true, nullable = false, length = 64)
    private String account;

    /**  */
    @Column(name = "PASSWORD", nullable = true, length = 64)
    private String password;

    /**  */
    @Column(name = "REMARK", nullable = true, length = 255)
    private String remark;

    /** 0为未激活，1为已激活 */
    @Column(name = "ENABLED", nullable = false, length = 10)
    private Integer enabled;

    /** 经度 */
    @Column(name = "LONGITUDE", nullable = true)
    private BigDecimal longitude;

    /** 纬度 */
    @Column(name = "LATITUDE", nullable = true)
    private BigDecimal latitude;

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
     * 获取
     * 
     * @return 
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * 设置
     * 
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 设置
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 设置
     * 
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取0为未激活，1为已激活
     * 
     * @return 0为未激活
     */
    public Integer getEnabled() {
        return this.enabled;
    }

    /**
     * 设置0为未激活，1为已激活
     * 
     * @param enabled
     *          0为未激活
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取经度
     * 
     * @return 经度
     */
    public BigDecimal getLongitude() {
        return this.longitude;
    }

    /**
     * 设置经度
     * 
     * @param longitude
     *          经度
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     * 
     * @return 纬度
     */
    public BigDecimal getLatitude() {
        return this.latitude;
    }

    /**
     * 设置纬度
     * 
     * @param latitude
     *          纬度
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
}