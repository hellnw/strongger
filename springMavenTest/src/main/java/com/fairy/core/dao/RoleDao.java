package com.fairy.core.dao;


import org.mybatis.spring.annotation.MapperScan;

import com.fairy.core.domain.Role;

@MapperScan
public interface RoleDao {
	public Role get(Long id);
	
	public void insert(Role role);
}
