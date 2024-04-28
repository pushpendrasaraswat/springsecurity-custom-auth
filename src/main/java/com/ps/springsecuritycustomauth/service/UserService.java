package com.ps.springsecuritycustomauth.service;

import com.ps.springsecuritycustomauth.dao.User;
import com.ps.springsecuritycustomauth.model.Customer;
import com.ps.springsecuritycustomauth.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    PasswordEncoder passwordEncoder;
     public User saveUser(User user){

         BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
        Customer customer=Customer.builder()
                .email(user.getEmail())
                 .pwd(passwordEncoder.encode(user.getPassword()))
                  .role(user.getRole())
                .build();
        Customer savedCustomer= customerRepository.save(customer);
        user.setId(savedCustomer.getId());
        return user;
    }
}
