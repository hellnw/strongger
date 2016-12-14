package com.fairy.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fairy.core.dao.RoleDao;
import com.fairy.core.domain.Role;
import com.fairy.core.service.RoleService;

@Transactional
@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao roleDao;

	@Override
	public Role get(Long id) {
		return roleDao.get(id);
	}

	@Transactional(rollbackFor=Exception.class)
	@Override
	public void save(Role role) throws Exception {
		roleDao.insert(role);
		//throw new RuntimeException("test");
	}

}
