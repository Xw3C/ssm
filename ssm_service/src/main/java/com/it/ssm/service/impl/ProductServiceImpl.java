package com.it.ssm.service.impl;

import com.it.ssm.dao.IProductDao;
import com.it.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.it.ssm.domain.product;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {


    @Autowired
    private IProductDao productDao;

    @Override
    public void save(product product) {
        productDao.save(product);
    }

    @Override
    public List<product> findAll() throws Exception {
        return productDao.findAll();
    }
}
