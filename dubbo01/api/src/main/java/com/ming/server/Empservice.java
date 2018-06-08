package com.ming.server;

import com.ming.entity.EmpEntity;

import java.util.List;

public interface Empservice {
     List<EmpEntity> selectall();
     int insertemp(EmpEntity emp);
     int delemp(int id);
}
