package com.myzonespringboot.repository;

import com.myzonespringboot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 陈 on 2017/7/19.
 */
public interface UserRepository extends JpaRepository<Customer,Long>{
    Customer findByUsernameAndPassword(String username, String password);
    Customer findById(Long id);
    Customer findByUsername(String username);
    void deleteById(long id);

    /*@Modifying
    @Query("update Customer c set c.username = ?1 where c.id = ?2")
    int updateByPrimaryKeySelective(long id,String username);*/
}
