package springdemonew.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component(value="CustomerDaoImp")
public class CustomerDaoImp implements CustomerDao {

	private JdbcTemplate jdbcTemplate;
	
	private DataSource dataSource;
	
	
	

	public CustomerDaoImp() {
		System.out.println("Customer Doa Imp constructor...");
	}


	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}



	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		String sql = "insert into customer value (?,?,?)";
		
		int i = jdbcTemplate.update(sql, new Object[] {customer.getCustomerId(),customer.getCustomerName(),customer.getCustomerAddress()});

		if (i>0) {
			System.out.println("Customer added...");
		}
	}


	@Override
	public List<Customer> getAllCustomers() {

		String sql = "select * from customer";
		
		return jdbcTemplate.query(sql, new extractData(ResultSet rs) throws SQLException, DataAccessException{
			
			@ovier
		});
		
	}

}
