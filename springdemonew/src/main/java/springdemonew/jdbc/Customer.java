package springdemonew.jdbc;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerAddress;
	public Customer(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, String customerAddress) {
		
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerAddress=customerAddress;
		// TODO Auto-generated constructor stub
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + "]";
	}
	
	

}
