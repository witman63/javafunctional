package nl.martin.function;

import java.util.function.Consumer;

public class _Consumer {

	public static void main (String[] args) {
		
		Customer c = new Customer("martin","123456789");
		greet(c);
		
		//let op accept
		greetConsumer.accept(c);
	}
    //pojo
	static void greet(Customer consumer) {
		System.out.println("Hello "+consumer.naam +" thanks for registering:"+ consumer.phone);
	}
	//functional
	
	static Consumer<Customer> greetConsumer= consumer-> 
		System.out.println("Hello "+consumer.naam +" thanks for registering:"+ consumer.phone);
	
	
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