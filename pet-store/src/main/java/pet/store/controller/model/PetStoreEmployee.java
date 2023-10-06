package pet.store.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Employee;

@NoArgsConstructor
@Data
public class PetStoreEmployee {
	
	private Long employeeId;
	
	private String employeeFirstName;
	
	private String employeeLastName;
	
	private String employeePhone;
	
	private String employeeJobTitle;
	
	public PetStoreEmployee(Employee employee){
		
	}
}
