package nl.martin.combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static nl.martin.combinator.CustomerRegistrationValidator.*;
import static nl.martin.combinator.CustomerRegistrationValidator.ValidationResult.*;


public interface  CustomerRegistrationValidator extends 
													Function<Customer, ValidationResult>{
	        //de Functions zijn precies als de interface dus an type Function<Customer,ValidationResult>
			static CustomerRegistrationValidator isEmailValid() {
				return customer -> customer.getEmail().contains("@") ? 
						ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
			}
			static CustomerRegistrationValidator isPhoneValid() {
				return customer -> customer.getPhoneNumber().startsWith("+0") ? 
						SUCCESS : PHONE_NUMBER_NOT_VALID;
			}
			static CustomerRegistrationValidator isAdult() {
				return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears()>16 ? 
						SUCCESS : CUSTOMER_NOT_ADULT;
			}
			
			
			//hier de magie
			default CustomerRegistrationValidator and (CustomerRegistrationValidator other) {
				return customer -> {
					ValidationResult result=this.apply(customer);
					return result.equals(SUCCESS) ?  other.apply(customer) : result;
				};
				
			}
  	 	
			
			//de resultaten van de validatie
	enum ValidationResult {
		SUCCESS,
		PHONE_NUMBER_NOT_VALID,
		EMAIL_NOT_VALID,
		CUSTOMER_NOT_ADULT,
		
	}
  }

