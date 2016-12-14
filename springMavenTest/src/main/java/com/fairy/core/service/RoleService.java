package com.fairy.core.service;

import com.fairy.core.domain.Role;

public interface RoleService {
	/**
	 * get role
	 * @param id
	 * @return
	 */
	Role get(Long id);
	
	/**
	 * save
	 * @param role
	 */
	void save(Role role) throws Exception;
}
