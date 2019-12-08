package emailapp;

public class EmailApplication {

	public static void main(String[] args) {
		EmailModel email = new EmailModel("Ashwani","Kumar");
		
		email.setAlternateEmail("ashwani.k@yahoo.com");
		email.setPasswd("P@$$W0rd");
		//System.out.println("The Alternate Email ID : "+email.getAlternateEmail());
		//System.out.println("The New Passowrd is : "+email.getPasswd());
		System.out.println(email.toString());
	}

}
