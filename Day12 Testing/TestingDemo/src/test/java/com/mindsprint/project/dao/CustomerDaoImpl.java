package com.mindsprint.project.dao;

import com.mindsprint.project.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements  CustomerDAO{
    private List<Customer> list=null;
    public CustomerDaoImpl(){
        list=new ArrayList<>();
        list.add(new Customer("Lokesh",1,"Naidupeta"));
        list.add(new Customer("Chandhan",2,"Silk Board"));
        list.add(new Customer("Sasi",3,"Chennai"));
        list.add(new Customer("Uma Mahesh",4,"Bangalore"));

    }
    @Override
    public Customer addNewCustomer(Customer customer) {
        list.add(customer);
        return  customer;
    }

    @Override
    public Customer getCustomer(int id) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomer() {
        return getAllCustomer();
    }

    @Override
    public boolean deleteCustomer(int id) {
        return false;
    }

    @Override
    public boolean upadteCustomer(int id, String address) {
        return false;
    }
}
