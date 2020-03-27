package nl.martin.imperative;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import nl.martin.imperative.Declarative.Person.Gender;

public class Declarative {
	public static void main(String[] args) {
		
		List <Person> people  = List.of(
			new Person("martin",57,	Gender.man),
			new Person("Yolanda",60,Gender.vrouw),
			new Person("Pipo",34,Gender.vrouw)
		);
		System.out.println("//Declarative approach");	
		List <Person> vrouwen = new ArrayList();
		for (Person persoon:people) {
			if (Gender.vrouw.equals(persoon.getGender()))
			{ 
				vrouwen.add(persoon);
			}
		}
		for (Person persoon:vrouwen) {
			
		System.out.println(persoon);
		}
		
		System.out.println("//Imperative approach (Streams with Collections)");		
		people.stream()
			.filter(person -> Gender.vrouw.equals(person.gender)) //Predicate 
			.collect(Collectors.toList()) // deze hoeft niet echt omdat je alleen maar print 
			.forEach(System.out::println);
		
		System.out.println("\n\n");
		
		List <Person> female = people.stream()
				.filter(person -> Gender.man.equals(person.gender))
				.collect(Collectors.toList());
		//is hetzelfde als de vrouwen lijst
		female.forEach(System.out::println);
		
		
		
		
	}

	static class Person {
		
		
		private final String  name ;
		private final int  age;
		private final Gender gender;
		
		
		public String getName() {
			return name;
		}


		public int getAge() {
			return age;
		}


		public Gender getGender() {
			return gender;
		}


		public Person(String name, int age, Gender gender) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
		}


		enum Gender {
			man,
			vrouw
		}


		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
		}
		
	}
}
 
