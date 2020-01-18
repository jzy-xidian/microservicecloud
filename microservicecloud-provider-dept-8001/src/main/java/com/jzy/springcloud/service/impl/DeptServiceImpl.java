package com.jzy.springcloud.service.impl;

import com.jzy.springcloud.dao.DeptDao;
import com.jzy.springcloud.entities.Dept;
import com.jzy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    public DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {

        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
