package com.tangj.springboot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tangj.springboot.dao.StudentMapper;
import com.tangj.springboot.domain.Student;
import com.tangj.springboot.service.StudentService;

public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		return studentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Student record) {
		return studentMapper.updateByPrimaryKey(record);
	}

	@Override
	public int insertSelective(Student record) {
		return studentMapper.insertSelective(record);
	}

	@Override
	public Student selectByPrimaryKey(Long id) {
		return studentMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Student record) {
		return studentMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Student record) {
		return studentMapper.updateByPrimaryKey(record);
	}

}
