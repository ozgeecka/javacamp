package business.concretes;

import business.abstracts.CustomerCheckService;

public class NeroCustomerManager extends BaseCustomerManager {


		private CustomerCheckService customerCheckService;

		public NeroCustomerManager(CustomerCheckService customerCheckService) {
			super();
			this.setCustomerCheckService(customerCheckService);
  }

		public CustomerCheckService getCustomerCheckService() {
			return customerCheckService;
		}

		public void setCustomerCheckService(CustomerCheckService customerCheckService) {
			this.customerCheckService = customerCheckService;
		}
}