package com.bridgelab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static boolean validateFirstName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		if (firstName.isEmpty())
			return false;
		Matcher matcher = pattern.matcher(firstName);
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
		boolean flag = registration.validateFirstName(details.getFirstName());
		if (flag)
			System.out.println("Entered name is valid");
		else
			System.out.println("Entered name is invalid");
		sc.close();
	}
}