package com.myzonespringboot.service;

import com.myzonespringboot.model.Customer;
import com.myzonespringboot.model.PageBean;

import java.util.List;

public interface IUserService {
	Customer login(String username, String password);
	
	Customer register(Customer customer);
	
	int deleteByPrimaryKey(Long id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
    
    List<Customer> findall();
    
    PageBean queryForPage(int pageSize, int currentPage);
}
