package nl.martin.function;

import java.util.function.*;


public class BiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
   				   multiply.apply(3,3)
				);
	}
    static BiFunction<Integer,Integer,Integer> 
	         multiply=
			(number1, number2)->number1*number2;
	//let op de haakjes
}
