package de.htwberlin.prog2.ws1920;

public class Starter {

	public static void main(String[] args) {
		
		Guest matt = new Guest("Matt");
		Guest anna = new Guest("Anna");
		
		Address address = new Address("Stephanstr.", "11a", "10559", "Berlin");
		
		matt.setPrivateAdress(address );
		anna.setPrivateAdress(address);
		
		
		System.out.println(matt);
		System.out.println(anna);
	}
}
