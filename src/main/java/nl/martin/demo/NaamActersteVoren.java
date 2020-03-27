package nl.martin.demo;

import java.util.ArrayList;
import java.util.List;

public class NaamActersteVoren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String naam="BILAL";
		
		System.out.println("Mijn naam is:"+naam);
		
		for (int i=0;i<naam.length();i++) {
			System.out.println("Het "+i+ "-de karakter va mijn naam is:"+naam.charAt(i));
		}
		int j=naam.length();
		System.out.println(j);
		
		for (int i=j-1;i>=0 ;i--) {
			System.out.println("Het "+i+ "-de karakter va mijn naam is:"+naam.charAt(i));
		}
		
		
		List <String> tekst = new ArrayList();
		tekst.add(naam.replace("I", "A"));
		tekst.add(naam.toLowerCase());
		tekst.add("pipodeclown");
		
		
		for (int i=0;i<tekst.size();i++) System.out.println(tekst.get(i));
		
	}

}
