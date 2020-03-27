package nl.martin.combine;

import java.util.function.Function;

public class Combine
{

	public static void main(String[] args) {

		//zo kan het 
		int increment= incrementFunction.apply(10);
		
		int result = multiplyBy10.apply(increment);
		System.out.println("In variabelen:"+result);
		
		
		//Maar nog mooier is om de functies te combineren to een nw functie:
		
		Function<Integer,Integer> combine =incrementFunction.andThen(multiplyBy10);
		
		System.out.println("combine:"+combine.apply(10));
	}
	
	//Functional way
	static Function<Integer ,Integer> incrementFunction= 
			number->number+ 1;
	
		
	static Function<Integer,Integer> multiplyBy10= 
				number->number*10;

}
