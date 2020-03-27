package nl.martin.function;

import java.util.function.BiConsumer;

public class _BiConsumer {

	public static void main (String[] args) {
		
		Customer c = new Customer("martin","123456789");
		//let op accept
		greetConsumer.accept(c,false);
	}
   
	//functional
	
	static BiConsumer<Customer, Boolean> greetConsumer= (consumer,showPhoneNumber)-> 
		System.out.println("Hello "+consumer.naam +" thanks for registering:"+ (showPhoneNumber ? consumer.phone :"******"));
	
	
	static class Customer {
		
		private final  String naam;
		private final String phone;
		
		public Customer(String naam, String phone) {
			super();
			this.naam = naam;
			this.phone = phone;
		}
		 
	}
}