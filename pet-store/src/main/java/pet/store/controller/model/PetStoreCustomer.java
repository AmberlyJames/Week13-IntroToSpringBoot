package pet.store.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Customer;

@NoArgsConstructor
@Data
public class PetStoreCustomer {
	
	private Long customerId;
	
	private String customerFirstName;
	
	private String customerLastName;
	
	private String customerEmail;
	
	public PetStoreCustomer(Customer customer){
		
	}
}
