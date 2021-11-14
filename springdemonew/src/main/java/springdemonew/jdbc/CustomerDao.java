package springdemonew.jdbc;

import java.util.List;

public interface CustomerDao {
	
	public void addCustomer(Customer customer);
	
	public List<Customer> getAllCustomers();
}
