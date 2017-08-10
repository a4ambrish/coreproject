package Shopping;

import java.util.List;

import Shopping.beans.Customer;

public interface CustomerDAO {
	
	public int addNewCustomer(Customer customer);
	public List<Customer> listAllCustomers();
	public Customer findByCustomerId(int customerId);
	public int editCustomerDetails(Customer customer);
	public int deleteCustomer(int customerId);
