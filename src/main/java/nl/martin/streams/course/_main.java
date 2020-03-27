package nl.martin.streams.course;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
	

public class _main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//old Imperative approach
		List <Person> people = getPeople();
		//suppose you want to filter all females, you would write something like:
		
		List <Person> personen = new ArrayList<Person>();
		
		for (Person p:people) {
			if (p.getGender().equals(Gender.vrouw)) {
				personen.add(p);
			}
			
		}
		
		personen.forEach(System.out::println );
	   //till this every single step has to be defined
		
		//declarative approach
		//filter
		System.out.println("\n\n");
		List<Person> females=people.stream()
		         .filter(person->person.getGender().equals(Gender.vrouw))
		         .collect(Collectors.toList()); //Collect en Stream gaat veelal samen
		females.forEach(System.out::println);
		//sort
		System.out.println("\n\n");
		List<Person> sorted=people.stream()
		                     .sorted(Comparator.comparing(Person::getAge).reversed().thenComparing(Person::getGender)) //omgekeerd sorteren
		                     //Je kan na de .reversed ook een vervolg sortering opgeven 
		                     // idg sorteer op Gender
		                     .collect(Collectors.toList()) ; //maak er weer een lijst van
		
		sorted.forEach(System.out::println);
		
		//All match is een boolean (allmatch (predicate)
		boolean match=people.stream()
				              .allMatch(person->person.getAge()>15);
                                                          
        System.out.println("match >15 (true)"+match);
        
        //Any match
        
        boolean anymatch=people.stream()
	              .anyMatch(person->person.getAge()<15);
        
        System.out.println("Anymatch <15 (false) "+anymatch);
        
		//None Match
        
        boolean nonematch =people.stream()
        						.noneMatch(person->person.getAge()<15);
        
        System.out.println("Nonematch<15 (true)"+nonematch);
		//Max
        
        Optional<Person> maxie=people.stream()  //Optional omdat het niet perse het max hoeft zijn
	                     .max(Comparator.comparing(Person::getAge));  
        System.out.println(maxie);
        
        //Als alternatief kan dit ook
        people.stream()  //Optional omdat het niet perse het max hoeft zijn
        .max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
        		
        //MIn
        
        people.stream()  //Optional omdat het niet perse het max hoeft zijn
        .min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
		//group Lijst met Persons die bij de Gender horen 
        Map<Gender, List<Person>> collect = people.stream()  //Collector naar een group
               .collect(Collectors.groupingBy(Person::getGender));
        
		//daar doorheen loopen
        collect.forEach((gender,people1)->{System.out.println(gender);
                                              people1.forEach(System.out::println);
                                          });
        
        
        //nu de boel combineren bijv in de group vrouw wil je de oudsre
        
        Optional<String> oldestfemale = people.stream() 
        	.filter(person->person.getGender().equals(Gender.vrouw)) //vrouwen
        	.max(Comparator.comparing(Person::getAge))               //de oudste
        	.map(Person::getName);
 
        oldestfemale.ifPresent(name->{System.out.println(name);});
        oldestfemale.ifPresent(System.out::println);  //method reference identiek aan boven
        
        
	}
	
	
	
    static List<Person> getPeople(){
        return List.of(new Person("martin",57,Gender.man),
        		       new Person("Yolanda",60,Gender.vrouw),
        		       new Person("Jeffrey",16,Gender.man),
        		       new Person("Rosa",22,Gender.vrouw),
        		       new Person("Anne",25,Gender.vrouw),
        		       new Person("TEST",22,Gender.man))
        		        ;  	
    	
    	
    
    }
    
	

}
