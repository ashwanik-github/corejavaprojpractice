/*
 * @author : Ashwani K
 * @version :1.0
 */
package emailapp;

import java.util.Scanner;

/**
 * The Class EmailModel.
 */
public class EmailModel {
	
	/** The first name. */
	private String firstName;
	
	/** The last name. */
	private String lastName;
	
	/** The department. */
	private String department;
	
	/** The passwd. */
	private String passwd;
	
	/** The passwd length. */
	private int passwdLength = 10;
	
	/** The email. */
	private String email;
	
	/** The company suffix. */
	private final String companySuffix = "ashcompany.com";
	
	/** The mail box capacity. */
	private  final int mailBoxCapacity = 200;
	
	/** The alternate email. */
	private String alternateEmail;
	
	/**
	 * Instantiates a new email model.
	 */
	public EmailModel() {
		
	}
	
	/**
	 * Instantiates a new email model.
	 *
	 * @param firstName the first name
	 * @param lastName  the last name
	 */
	public EmailModel(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Enter the details for : "+firstName);
		
		//call the method department here
		this.department = setDepartment();
		//System.out.println("The Department entered : "+ this.department);
		//setting the passwd here
		this.passwd = setPassword(passwdLength);
		//System.out.println("The Password Generated : "+ this.passwd);
		//generate the emailid here
		email = ""+firstName.toLowerCase()+"."+lastName.toLowerCase()
		+"@"+department.toLowerCase()+"."+companySuffix;
		//System.out.println("The Email ID is ready for you : "+email);
	}
	
	

	
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	private String getEmail() {
		return email;
	}
	
	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	private void setEmail(String email) {
		this.email = email;
	}
	
	
	
	/**
	 * Sets the department.
	 *
	 * @return the string
	 */
	
	private String setDepartment() {
		System.out.println("Select the Department from the list : \n1. Development\n"
				+ "2. Sales\n3. Accounting\n4. None ");
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter here : ");
		int choice = in.nextInt();
		if(choice == 1) return ("Development");
		else if (choice == 2) return ("Sales");
		else if (choice == 3) return ("Accounting");
		else return ("");
		
	}
	
	/**
	 * Sets the password.
	 *
	 * @param length the length
	 * @return the string
	 */
	
	private  String setPassword(int length) {
		String passwdSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%&";
		char[] passwd = new char[length];
		for(int i = 1;i<length;i++) {
			int rand = (int)(Math.random()*passwdSet.length());
			//System.out.println(rand);
			passwd[i]=passwdSet.charAt(rand);
			//System.out.println(passwd);
		}
		 return(new String(passwd));
	}
	

	/**
	 * Gets the passwd.
	 *
	 * @return the passwd
	 */
	public String getPasswd() {
		return passwd;
	}

	/**
	 * Sets the passwd.
	 *
	 * @param passwd the new passwd
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	/**
	 * Gets the alternate email.
	 *
	 * @return the alternate email
	 */
	public String getAlternateEmail() {
		return alternateEmail;
	}

	/**
	 * Sets the alternate email.
	 *
	 * @param alternateEmail the new alternate email
	 */
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "--- Email Created Successfully with details below --- \nfirstName=" + firstName + "\nlastName=" + lastName + "\ndepartment=" + department
				+ "\npasswd=" + passwd + "\npasswdLength=" + passwdLength + "\nemail=" + email + "\ncompanySuffix="
				+ companySuffix + "\nmailBoxCapacity=" + mailBoxCapacity + "mb\nalternateEmail=" + alternateEmail;
	}
	
	
	
	
	
	
}
