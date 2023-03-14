package com.sparta.mg.springmvcsql.services;

import com.sparta.mg.springmvcsql.entities.CustomersEntity;

public class CustomerService {
	public CustomerService() {
	}
	//extracted from controller
	public void update(CustomersEntity updatedCustomer, CustomersEntity customer) {
		customer.setCompanyName(updatedCustomer.getCompanyName());
		customer.setContactName(updatedCustomer.getContactName());
		customer.setContactTitle(updatedCustomer.getContactTitle());
		customer.setAddress(updatedCustomer.getAddress());
		customer.setCity(updatedCustomer.getCity());
		customer.setRegion(updatedCustomer.getRegion());
		customer.setPostalCode(updatedCustomer.getPostalCode());
		customer.setCountry(updatedCustomer.getCountry());
		customer.setPhone(updatedCustomer.getPhone());
		customer.setFax(updatedCustomer.getFax());
	}
}