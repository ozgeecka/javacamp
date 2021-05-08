package business.concretes;

import entities.abstracts.CustomerService;
import entities.concretes.leect4hw2.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	
	public void save(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName());

	}
}