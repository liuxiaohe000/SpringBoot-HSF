package com.lxh.hsf.api.dao.mapper;


import com.lxh.hsf.api.dao.po.OrderPO;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderPO record);

    int insertSelective(OrderPO record);

    OrderPO selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(OrderPO record);

    int updateByPrimaryKey(OrderPO record);
}