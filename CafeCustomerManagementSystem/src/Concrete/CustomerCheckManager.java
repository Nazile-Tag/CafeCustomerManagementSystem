package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}
