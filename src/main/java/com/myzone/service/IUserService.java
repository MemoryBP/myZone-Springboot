package com.myzone.service;

import java.util.List;

import com.myzone.model.PageBean;
import com.myzone.model.User;

public interface IUserService {
	User login(String username,String password);
	
	User register(User user);
	
	int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> findall();
    
    PageBean queryForPage(int pageSize, int currentPage);
}
