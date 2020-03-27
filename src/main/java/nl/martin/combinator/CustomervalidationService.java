package nl.martin.combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomervalidationService {

	/*old java*/
    private boolean isEmailvalid (String email) {
    	return email.contains("@");
    }
    private boolean isPhoneNumberValid (String phoneNumber) {
    	return phoneNumber.startsWith("+0");
    }
    private boolean isAdult (LocalDate dob) {
    	return Period.between(dob, LocalDate.now()).getYears()>16;    
    	
    }
    public boolean isCustomerValid (Customer cu) {
    	return isEmailvalid(cu.getEmail())&& isPhoneNumberValid(cu.getPhoneNumber()) && isAdult(cu.getDob());
    }
    
    //in de klassieke java zou je dan de dcombinaties ook uitschrijven bijv phone+adult  email + phone 
    // zie ook CustomerRegistrationValidator
    //visibility is alleen over de isCustomerValid 
    
}
