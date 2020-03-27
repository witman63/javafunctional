package nl.martin.streams;

import java.util.List;
import java.util.Set;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
//import static streams._Streams.Gender.man;
import java.util.stream.Collectors;

import nl.martin.streams._Streams.Person.Gender;


public class _Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Person> people  = List.of(
				new Person("martin",57,	Gender.man),
				new Person("Yolanda",60,Gender.vrouw),
				new Person("Pipo",34,Gender.vrouw),
				new Person("Jansen",34,Gender.man),
				new Person("Vrouwke",34,Gender.vrouw)
			);
		System.out.println("==============================================================");
		System.out.println("print de namen ");
		Set<Gender> genders=people.stream()
		             .map(person->person.gender)
		             .collect(Collectors.toSet());
		System.out.println(genders);
		
		//en dat is hetzelfde als:
		
		people.stream()
        .map(person->person.gender)
        .collect(Collectors.toSet())
        .forEach(gender->System.out.println(gender));
		
		people.stream()
	             .map(person->person.gender)
	             .collect(Collectors.toSet())  //toSet ...removing duplicates
	             .forEach(System.out::println);
		
		
		System.out.println("==============================================================");
		System.out.println("print lengtes van de namen");
		people.stream()
        .map(person->person.name)
        .mapToInt(String::length)  // 
        //.mapToInt(name->name.length())
        .forEach(System.out::println);
		
		
		System.out.println("==============================================================");
		System.out.println("filteren op vrouw");
		
		boolean isVrouw = people.stream()
		       .allMatch(person->person.gender.equals(Gender.vrouw));
		
		//hier komt natuurlijk een false uit omdat in de lijst man en vrouw zit 
		System.out.println(isVrouw);
		
		//Als je hier anymatch neemt dan komt er een true uit
		boolean isGender = people.stream()
			       .anyMatch(person->person.gender.equals(Gender.vrouw));
		
		System.out.println(isGender);
		
		//noneMatch is dan geen enkele match
		      
		
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
