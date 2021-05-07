package abstracts;

import entities.Customer;
import interfaces.CustomerService;

public abstract class CustomerManager implements CustomerService {
	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " ba�ar�l� bir �ekilde kaydedildi.");
	}
}
