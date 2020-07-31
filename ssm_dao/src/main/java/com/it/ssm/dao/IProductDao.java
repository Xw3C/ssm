package com.it.ssm.dao;

import com.it.ssm.domain.product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {
    //根据ID查询产品的操作
    @Select("select * from product where id = #{id} ")
    public product findById(String id)throws Exception;


    //查询所有的产品信息
    @Select("select * from product")
    public List<product> findAll() throws Exception;

    @Insert("insert into Product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(product product);
}
