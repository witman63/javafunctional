package nl.martin.function;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPhoneNumberValid("+000"));
		System.out.println(isPhoneNumberValid("+00"));
		
		//the predicate call .test!	
		System.out.println(predicate.test("+000"));
		System.out.println(predicate.test("+00"));
		
		
		//je kan and maar ook or gebruiken
		System.out.println(predicate.and(contain).test("+31000"));
		
		//onzinnige BiPredicate maar toch
		System.out.println("telefoon tonen"+biPredicate.test("+31",true));
		
	}
	static boolean isPhoneNumberValid(String phoneNumber) {
		
		return (phoneNumber.startsWith("+0") && phoneNumber.length()==6);
	}
	
	//The predicate 
    static Predicate<String> predicate= phoneNumber ->
              (phoneNumber.startsWith("+") && phoneNumber.length()==6);
              
    static Predicate<String> contain = phoneNumber ->
              (phoneNumber.contains("+31"));
              
    //BiPredicate
            
    static BiPredicate<String, Boolean> biPredicate=(phoneNumber, tonen)->
               (phoneNumber.contains("+31") && tonen);
              
              
    
}
