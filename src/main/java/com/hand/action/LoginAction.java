package com.hand.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.dao.impl.CustomerDaoImpl;
import com.hand.entity.Customer;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	@Override
	public String execute() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CustomerDaoImpl customerDaoImpl = 
			(CustomerDaoImpl)context.getBean("customerDaoImpl");
		
		Customer cs = customerDaoImpl.find(username);
		Customer cs1 = customerDaoImpl.find(password);
		if(cs!=null && cs1!=null ){
			
			return "success";
		}else{
		
		}
		return "fail";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
