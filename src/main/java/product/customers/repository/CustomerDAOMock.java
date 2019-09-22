package product.customers.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import product.customers.models.Customer;

@Repository
@Profile("test")
public class CustomerDAOMock implements  ICustomerDAO {

    @Override
    public void save(Customer customer) {
        System.out.println("Soy un Mock Dao");
    }
}
