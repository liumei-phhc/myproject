package com.lh.mapper;

import java.util.List;

import com.lh.entity.Customer;
import com.lh.entity.CustomerDept;
import com.lh.entity.Dept;

public interface CustomerDao {

	//�ͻ�չʾ
	public List<CustomerDept> selectAllCustomerDept();
	//��ӿͻ���Ϣ
	public void addCustomer(Customer customer);
	
	public List<Dept> findDept(Dept dept);
	
	public void deleteCustomer(int id);
	
	public void deleteAllCustomer(int[] ids);
	
	public void update(Customer customer);
	public List<Customer> selectOneCustomerDept(int id);
}
