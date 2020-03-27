package nl.martin.function;

import java.util.List;
import java.util.function.Supplier;


public class _Supplier {

	
	//een supplier return een waarde van elk type
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDBConnection()); //old school
		System.out.println(getDBConnectionSupplier.get());
		System.out.println(getDBConnectionSupplierList.get());

	}
	static String getDBConnection() {
		return "jdbc://localhost:5432/users";
	}
	static Supplier<String> getDBConnectionSupplier=() 
			->"jdbc://localhost:5432/users";
			
	static Supplier<List <String>> getDBConnectionSupplierList=() 
					-> List.of("jdbc://localhost:5432/users", "jdbc://localhost:5432/customers");

}
