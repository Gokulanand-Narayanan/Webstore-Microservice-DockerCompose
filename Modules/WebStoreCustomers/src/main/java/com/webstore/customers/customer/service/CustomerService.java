/*
 * #%L
 * jVoiD Open Platform
 * %%
 * Copyright 2014-2015 Schogini Systems Pvt Ltd (http://www.schogini.com)
 * Project Website: http://www.jvoid.com
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
 package com.webstore.customers.customer.service;

import java.util.List;

import com.webstore.customers.customer.model.Customer;

/**
 * Service class for Customer
 * 
 * @author Shajir K, Rajeev Pillai
 * @version 1.0
 */
public interface CustomerService {

	public void addcustomer(Customer p);
	public void updatecustomer(Customer p);
	public List<Customer> listcustomers();
	public Customer getcustomerById(int id);
	public void removecustomer(int id);
	public Customer getCustomerByEmailId(String email);
}
