package com.ming.service.impl;

import com.ming.dao.EmpEntityMapper;
import com.ming.entity.EmpEntity;
import com.ming.server.Empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Empserviceimpl implements Empservice {


    @Autowired
    private EmpEntityMapper empmapper;

    public List<EmpEntity> selectall() {
        List<EmpEntity> list = new ArrayList<EmpEntity>();
        try {
            System.out.println("进入serviceimpl");
            list=empmapper.selectall();
            System.out.println(list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int insertemp(EmpEntity emp) {

        //return empmapper.insertemp(emp);
        return 151;
    }

    public int delemp(int id) {

        return empmapper.delemp(id);
    }

    ;
}
