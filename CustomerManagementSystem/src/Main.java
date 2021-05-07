import java.util.GregorianCalendar;


import adapters.MernisServiceAdapter;
import entities.Customer;
import interfaces.CustomerCheckService;
import interfaces.CustomerService;
import services.StarbucksCustomerCheckManager;
import services.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setNationalyNumber("1234567912");
		customer1.setFirstName("Rüstem Muhammed");
		customer1.setLastName("Karademir");
		customer1.setBirthDate((java.util.Date) new GregorianCalendar(1991, 10 , 3).getTime());
		
		CustomerCheckService customerCheckService = new StarbucksCustomerCheckManager(new MernisServiceAdapter());
		
		CustomerService customerService = new StarbucksCustomerManager(customerCheckService);
		customerService.add(customer1);

	}

}
