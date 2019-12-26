package com.lh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lh.entity.Customer;
import com.lh.entity.CustomerDept;
import com.lh.entity.Dept;
import com.lh.mapper.CustomerDao;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired //自动注入
	private CustomerDao customerdao;
	
	public List<CustomerDept> selectAllCustomerDept() {
		// TODO Auto-generated method stub
		//1.调用dao中的方法，获取数据
		List<CustomerDept> list = customerdao.selectAllCustomerDept();
		return list;
	}

	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerdao.addCustomer(customer);
	}

	public List<Dept> findDept(Dept dept) {
		// TODO Auto-generated method stub
		List<Dept> list = customerdao.findDept(dept);
		return list;
	}

	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerdao.deleteCustomer(id);
	}

	public void deleteAllCustomer(int[] ids) {
		// TODO Auto-generated method stub
		customerdao.deleteAllCustomer(ids);
	}

	public void update(Customer customer) {
		// TODO Auto-generated method stub
		customerdao.update(customer);
	}

	public List<Customer> selectOneCustomerDept(int id) {
		// TODO Auto-generated method stub
		List<Customer> list = customerdao.selectOneCustomerDept(id);
		return list;
	}

	
	
}
