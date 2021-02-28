package com.demo.springcloud.entity;

import java.io.Serializable;

/**
 * payment表(Payment)实体类
 *
 * @author makejava
 * @since 2021-02-28 18:32:56
 */
public class Payment implements Serializable {
    private static final long serialVersionUID = 153250583043691625L;
    /**
     * id
     */
    private Long id;
    /**
     * 序列号
     */
    private String serialNo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

}
