package de.htwberlin.prog2.ws1920;

public class Hotel {

	private Guest [] guests = new Guest[1000];
	
	public boolean addGuest(Guest guest) {
		int numberOfGuests = findNumberofGuests();
		guests[numberOfGuests] = guest;
		return true;
	}

	private int findNumberofGuests() {
		return 0;
	}
}
