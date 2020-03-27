package nl.martin.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {
		System.out.println(increment(3));
		System.out.println(incrementFunction.apply(9));
		
		//bifunction
		System.out.println(
				   multiplyBiFunction.apply(3,3)
				);
	}
	
	//Functional way
	static Function<Integer ,Integer> incrementFunction= 
			number->number+ 1;
	
	//klassieke manier
	static int increment(int getal) {
		return getal+1;
	}
	
	
	//2 arguments
	   static BiFunction<Integer,Integer,Integer> 
       multiplyBiFunction=
		(number1, number2)->number1*number2;
    //let op de haakjes
		
		
}
