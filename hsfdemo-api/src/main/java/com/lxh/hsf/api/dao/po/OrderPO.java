package com.lxh.hsf.api.dao.po;

import java.util.Date;

/**
 * 描述:
 *
 * @author 刘晓禾
 * @create 2020-08-21 15:42
 */
public class OrderPO {

    private Integer orderId;

    private Integer userId;

    private String orderName;

    private Date createTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OrderPO{");
        sb.append("orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", orderName='").append(orderName).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}