package com.hand.dao;

import javax.sql.DataSource;

import com.hand.entity.Customer;

public interface ICustomerDao {
	 public void setDataSource(DataSource ds);
	 public Customer find(String first_name);
	 
}
