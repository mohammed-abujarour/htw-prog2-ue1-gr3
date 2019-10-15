package de.htwberlin.prog2.ws1920;

class Guest {
	
	private String name;
	private Address privateAdresse;
	private Address businessAdresse;
	// ... 
	
	
	public Guest(String name) {
		this.name = name;
	}
	
	public void setPrivateAdress(Address address) {
		this.privateAdresse = address;
	}

	public void setBusinessAdress(Address address) {
		this.businessAdresse = address;
	}

	public String toString() {
		return  name + ", " + privateAdresse + ", " + businessAdresse+ "";
	}
	
	

}
