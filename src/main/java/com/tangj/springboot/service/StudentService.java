package com.tangj.springboot.service;

import com.tangj.springboot.domain.Student;

public interface StudentService {

	int deleteByPrimaryKey(Long id);

	int insert(Student record);

	int insertSelective(Student record);

	Student selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(Student record);

	int updateByPrimaryKey(Student record);
}
