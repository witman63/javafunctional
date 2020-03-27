 package nl.martin.combinator;

import java.time.LocalDate;



import nl.martin.combinator.CustomerRegistrationValidator.ValidationResult;


public class Main {

	public static void main(String[] args)  {
		
		Customer c = new Customer("martin","a@b", "+01x1", LocalDate.of(1963, 1, 1));
		
		CustomervalidationService validator = new CustomervalidationService();
		/*klassieke wijze van oplossen hier komt een true or false uit */
		System.out.println("OP de oude manier:"+validator.isCustomerValid(c));
		
	
	
		//Als true dan in db opslaan of zoiets
		
		//so far , so good maar als meerdere checks falen wil je die check er uit filteren en rapporteren
		// gebruik makenn van de combinator pattern.
		
	     
		// Gebruik van de Combinator Pattern
		ValidationResult validatie = CustomerRegistrationValidator
											.isEmailValid()
											.and(CustomerRegistrationValidator.isPhoneValid())
											.and(CustomerRegistrationValidator.isAdult()) 
											.apply(c);
		//LETOP 
		// de apply MOET omdat de pattern ander lazy is en er feitelijk NIETS gebeurd.
		System.out.println(validatie);

		if (validatie != ValidationResult.SUCCESS) {
			throw new IllegalStateException(validatie.name()); 
		}
		
	}

	

}
