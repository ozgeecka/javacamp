
import adapters.mernisServiceAdapter;
import business.concretes.BaseCustomerManager;
import business.concretes.StarbucksCustomerManager;
import entities.concretes.leect4hw2.Customer;

public class Main {
	
		public static void main(String[] args) {
				
				Customer customer = new Customer(1, "OZGE", "AKCA", 1995, "11111111111");
				
				
				BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new mernisServiceAdapter());
				baseCustomerManager.save(customer);
				
			}

}
