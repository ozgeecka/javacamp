package adapters;

import java.rmi.RemoteException;

import business.abstracts.CustomerCheckService;
import entities.concretes.leect4hw2.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class mernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
				
				try {
					result = client.TCKimlikNoDogrula(
							Long.parseLong(customer.getNationalityId()), 
							customer.getFirstName().toUpperCase(), 
							customer.getLastName().toUpperCase(), 
							customer.getBirthDate());
				} catch (RemoteException e) {
					e.printStackTrace();
				}
				return result;
	}

}
