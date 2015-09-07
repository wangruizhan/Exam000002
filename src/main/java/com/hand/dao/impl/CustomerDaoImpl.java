package com.hand.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.hand.dao.ICustomerDao;
import com.hand.entity.Customer;
import com.hand.entity.CustomerMapper;




public class CustomerDaoImpl implements ICustomerDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		
	}
	public Customer find(String first_name) {
		String SQL = "select * from Customer where first_name=?";
		Customer customer = null;
		try{
			 customer = jdbcTemplateObject.queryForObject(SQL, new Object[]{first_name},new CustomerMapper());
		}catch(Exception e){
			e.getMessage();
		}
		return customer;
	}

	
}
