package com.bridgelab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static boolean validateName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		if (firstName.isEmpty())
			return false;
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	/**
	 * Purpose: Boolean method to validate mail ID of user.
	 * 
	 * @param mail: mail to validate.
	 */
	public static boolean validateEmail(String mail) {
		String regex = "^([a-zA-z0-9-_+\\.]+)@([a-z0-9-]+)\\.([a-z,]{2,4})((\\.[a-z]{2,4})?)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mail);
		return matcher.matches();
	}

	/**
	 * Purpose: Boolean method to validate first name. Condition for regex is, name
	 * should start with capital letter and name should have minimum 3 letters.
	 */
	public void validateUserDetails() {
		Scanner sc = new Scanner(System.in);
		UserDetails details = new UserDetails();
		UserRegistration registration = new UserRegistration();
		System.out.println("Enter first name");
		details.setfirstName(sc.next());
		boolean flag = registration.validateName(details.getFirstName());
		if (flag)
			System.out.println("Entered name is valid");
		else
			System.out.println("Entered name is invalid");

		// validating last name.
		System.out.println("Enter your last name");
		details.setlastName(sc.next());

		boolean lName = registration.validateName(details.getLastName());
		if (lName)
			System.out.println("Last name is valid");
		else
			System.out.println("Last name is invalid");

		// validate Email.
		System.out.println("Enter your mail");
		details.setMail(sc.next());

		boolean mail = registration.validateEmail(details.getMail());
		if (mail)
			System.out.println("Entered mail is valid");
		else
			System.out.println("Entered mail is invalid");
		sc.close();
	}
}