package nl.martin.callback;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

	public static void main(String[] args) {
		
		Function<String, String> upperCaseName= name -> name.toUpperCase();
		//dat is hetzelfde als: method reference 
		Function<String, String> upperCaseName1= String::toUpperCase;
		
		
		//iets meet logica
		Function<String, String> upperCaseName2= name -> {
			if (name.isBlank()) throw new IllegalStateException("name is leeg");
			return name.toUpperCase();
	
		};
		
		BiFunction<String,Integer, String> function3= (name , age )-> {
			if (name.isBlank()) throw new IllegalStateException("name is leeg");
			System.out.println("Age:"+age);
			return name.toUpperCase();
	
		};
		
		//gebruik:
		System.out.println(upperCaseName.apply("martin"));
		
		System.out.println(upperCaseName1.apply("martin"));
		
		
		
		System.out.println(function3.apply("martin", 57));
		
		System.out.println(upperCaseName2.apply(""));
		
		
	}
}
