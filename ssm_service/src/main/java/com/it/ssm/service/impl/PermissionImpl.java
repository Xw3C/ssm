package com.it.ssm.service.impl;

import com.it.ssm.dao.IPermissionDao;
import com.it.ssm.dao.IRoleDao;
import com.it.ssm.domain.Permission;
import com.it.ssm.service.IPermissionService;
import com.it.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PermissionImpl implements IPermissionService {


    @Autowired
    private IPermissionDao permissionDao;


    @Override
    public void deleteById(String id) throws Exception {
        permissionDao.deleteFromRole_Permission(id);
        permissionDao.deleteById(id);
    }

    @Override
    public Permission findById(String id) throws Exception {
        return permissionDao.findById(id);
    }

    @Override
    public void save(Permission permission) throws Exception{
        permissionDao.save(permission);

    }

    @Override
    public List<Permission> findAll() throws Exception {
        return permissionDao.findAll();
    }
}
