package product.customers.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import product.customers.utils.ILogger;
import product.customers.models.Customer;

@Repository
@Profile("prod")
public class CustomerDAO implements ICustomerDAO{

	@Autowired
	private ILogger logger ;



	public void save(Customer customer) {
		// simple sleep
		try {
			Thread.sleep(350);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("CustomerDAO: saving customer "+customer.getName());
		logger.log("Customer is saved in the DB: "+ customer.getName() );
	}

}
