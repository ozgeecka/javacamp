package business.concretes;

import business.abstracts.CustomerCheckService;
import entities.concretes.leect4hw2.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService= customerCheckService;
		
	}

	@Override
	public void save (Customer customer) {
		if (customerCheckService.CheckRealPerson(customer)) {
			
			super.save(customer);
			
		}else {
			System.out.println("Not a valid person");
		}
	} 
}
