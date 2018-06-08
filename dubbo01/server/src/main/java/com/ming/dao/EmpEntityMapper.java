package com.ming.dao;

import java.util.List;

import com.ming.entity.EmpEntity;
import org.springframework.stereotype.Repository;

public interface EmpEntityMapper {

	List<EmpEntity> selectall();

    int insertemp(EmpEntity emp);

    int delemp(int id);
}