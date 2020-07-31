package com.it.ssm.service;

import com.it.ssm.domain.product;

import java.util.List;

public interface IProductService {

    public List<product> findAll() throws Exception;

    void save(product product) throws Exception;
}
