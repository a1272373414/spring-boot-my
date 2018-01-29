package com.tangj.springboot.dao;

import org.apache.ibatis.annotations.Mapper;

import com.tangj.springboot.domain.Student;

@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}