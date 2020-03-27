package nl.martin.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class PredicateFunction {

	public static void main(String[] args) {
	    /*List<Person> persons = List.of (
	    		                        new Person("Martin",  Person.GENDER.man),
	    		                        new Person("Yolanda",Person.GENDER.vrouw),
	    		                        new Person("Weetniet", Person.GENDER.wilnietzeggen)
	    		                       );*/

		
		 List<Person> persons = new ArrayList();
				 
                  persons.add(new Person("Martin",  Person.GENDER.man));
                 persons.add(new Person("Yolanda",Person.GENDER.vrouw));
                 persons.add(new Person("Weetniet", Person.GENDER.wilnietzeggen));
                 
                 /*persons.stream()
                           .map(person-> person.Naam) // return gender
                           .mapToInt(String::length)	  
                           .forEach(System.out::println);*/
                 
                 //funtie return true of false 
                 Predicate<Person> containsMan = person -> Person.GENDER.man.equals(person.geslacht);
                 boolean containsOnlyMan =persons.stream()
                           .noneMatch(containsMan);
                 
                 System.out.print(containsOnlyMan);
                 
                
	}
	enum GENDER {
		man, vrouw, wilnietzeggen
	}
}
