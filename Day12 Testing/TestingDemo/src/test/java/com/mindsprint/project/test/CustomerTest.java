package com.mindsprint.project.test;

import com.mindsprint.project.model.Customer;
import com.mindsprint.project.service.CustomerService;
import org.junit.jupiter.api.*;

public class CustomerTest {

   static CustomerService service;
    @BeforeAll
    public static void setUp(){
        service= new CustomerService();
    }

    @AfterAll
    public static void tearDown(){
        service= null;
    }

    @Test
    public void addCustomer(){
       Customer result= service.addNewCustomer(new Customer("Rakesh",5,"Indian"));
        Assertions.assertEquals("Rakesh",result.getName());
    }
}
