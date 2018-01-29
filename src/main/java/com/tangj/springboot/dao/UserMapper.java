package com.tangj.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tangj.springboot.domain.User;

@Mapper
public interface UserMapper {
	

	@Select("SELECT * FROM user WHERE user_name = #{userName}")
	List<User> findByUserName(@Param("userName") String userName);

}