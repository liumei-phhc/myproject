package com.lh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lh.entity.Customer;
import com.lh.entity.CustomerDept;
import com.lh.entity.Dept;
import com.lh.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/cust/findCustomer")
	public String findCustomer(Model model){
		//1.调用service中的方法，把数据传递到前台
		List<CustomerDept> list = customerService.selectAllCustomerDept();
		//2.addAttribute()把数据传递到前台
		model.addAttribute("list", list);
		return "list";
	}
	@RequestMapping("/cust/findept")
	public String findept(Dept dept ,Model model){

		List<Dept> list = customerService.findDept(dept);
		
		model.addAttribute("list", list);
		return "add";
		
	}
	@RequestMapping("/cust/addcustomer")
	public String addcustomer(Customer customer){
		
		customerService.addCustomer(customer);
		return "redirect:/cust/findCustomer.do";
		
	}
	@RequestMapping("/cust/deleteCustomer")
	public String deleteCustomer(int id){
		
		customerService.deleteCustomer(id);
		return "redirect:/cust/findCustomer.do";
		
	}
	
	@RequestMapping("/cust/deleteAllUser")
	public String deleteAllCustomer(int[] ids){
		
		customerService.deleteAllCustomer(ids);
		return "redirect:/cust/findCustomer.do";
		
	}
	
	
	@RequestMapping("/cust/findone")
	public String findone(int id,Model model){
		Dept dept = null;
	    List<Customer> list = customerService.selectOneCustomerDept(id);
		List<Dept> list1 = customerService.findDept(dept);
		model.addAttribute("list", list);
		model.addAttribute("list1", list1);
		return "update";
		
	}
	
	@RequestMapping("/cust/update")
	public String update(Customer customer){
		customerService.update(customer);
		return "redirect:/cust/findCustomer.do";
		
	}
}

