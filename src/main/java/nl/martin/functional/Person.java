package nl.martin.functional;

public class Person {
 public class Gender {

	}



String Naam;
 GENDER geslacht;



public Person(String naam, GENDER geslacht) {
	super();
	Naam = naam;
	this.geslacht = geslacht;
}



public String getNaam() {
	return Naam;
}



public void setNaam(String naam) {
	Naam = naam;
}



public GENDER getGeslacht() {
	return geslacht;
}



public void setGeslacht(GENDER geslacht) {
	this.geslacht = geslacht;
}



enum GENDER {
	man, vrouw, wilnietzeggen
}
 
}
