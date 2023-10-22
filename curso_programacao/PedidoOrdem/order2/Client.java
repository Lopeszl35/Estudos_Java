package order2;

import java.time.LocalDate;

public class Client {
	private String name;
	private String email;
	private LocalDate birthDate;
	
	public Client (String name, String email, LocalDate date) {
		this.name = name;
		this.email = email;
		this.birthDate = date;
	}
	
	public Client() {
		
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return "Client Name: " + name + "\n "
				+ "Email: " + email + "\n"
				+ " birthDate: " + birthDate +"";
	}
	
	
	
	

}
