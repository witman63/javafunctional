package nl.martin.optionals;

import java.util.Optional;

public class Optioneel {

	public static void main(String[] args) {
		
		
	
		// allemaal Supplier lambdas
		Object value = Optional.ofNullable(null)
	                            .orElseGet(() -> "default value");
		System.out.println(value);

		Object value2 = Optional.ofNullable("kll")
                               .orElseThrow(()->new IllegalStateException("Null not allowed"));
         System.out.println(value2);
         
         
         //Consumer bij null wordt dus niets getoond
         Optional.ofNullable(null)
                                 .ifPresent(value4-> {
                                  System.out.println("value4="+value4);
                                 });  
         //toepassinkje
         Optional.ofNullable("john@gmail.com")
                                 .ifPresent(email->{
                                	 System.out.println("sending email to :"+email);
                                 });
                                 
       //Consumer bij null wordt dus niets getoond maar 
         Optional.ofNullable(null)
                                 .ifPresentOrElse(
                                		 emaill-> {System.out.println("sending email to:"+emaill); }, 
                                		 ()->{
                                                 System.out.println("cannot send email");
                                             });                     
         
	}

}
