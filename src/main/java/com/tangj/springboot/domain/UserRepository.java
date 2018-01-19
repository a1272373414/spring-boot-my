package com.tangj.springboot.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String userName);

	User findByUserNameLike(String userName);

	User findByUserNameOrEmail(String userName, String email);

	@SuppressWarnings("unchecked")
	User save(User user);
}