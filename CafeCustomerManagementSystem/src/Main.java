



import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "Emir","Tað","12345678910", LocalDate.of(2012, 12, 7)));
	}

}
