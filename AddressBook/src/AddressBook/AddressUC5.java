package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressUC5 {
	// arraylist created to store contact details
	private ArrayList<Initialization> contactList = new ArrayList<>();

	// method to take input of contact details
	private static Initialization getInitialContactDetails() {
		System.out.println("enter contact details ----");

		Scanner scan = new Scanner(System.in);

		System.out.println("enter first name");
		String firstName = scan.nextLine();

		System.out.println("enter last name");
		String lastName = scan.nextLine();

		System.out.println("enter city name");
		String cityName = scan.nextLine();

		System.out.println("enter state name");
		String stateName = scan.nextLine();
		System.out.println("enter phone number");
		String phoneNumber = scan.nextLine();

		System.out.println("enter email Address");
		String emailAddress = scan.nextLine();

		System.out.println("enter zip code of address -- interger type");
		int zipCode = scan.nextInt();

		Initialization entry = new Initialization(firstName, lastName, cityName, stateName, zipCode, phoneNumber,
				emailAddress);
		return entry;

	}
	// method to add contact details in linked list

	private void addContact(Initialization contact) {
		contactList.add(contact);
		System.out.println("contact added whose name is :  " + contact.firstName + " " + contact.lastName);

	}
	// method to display all entries of arraylist

	private void displayContactDetails() {
		System.out.println("displaying contact details :");
		for (int i = 0; i < contactList.size(); i++) {
			System.out.println("contact no" + (i + 1));
			Initialization con = contactList.get(i);
			System.out.println("first name is :" + con.firstName);
			System.out.println(" last name is :" + con.lastName);

			System.out.println(" city name is :" + con.addressCity);

			System.out.println(" state name is :" + con.addressState);

			System.out.println(" zip code is  :" + con.addresszip);

			System.out.println(" phone number is :" + con.phoneNumber);

			System.out.println(" email address is :" + con.email);
		}
	}

// main method 
	public static void main(String[] args) {

		System.out.println("this is address book feature");

		AddressUC5 entry5 = new AddressUC5();

		entry5.displayContactDetails();
		System.out.println("Enter  no of contacts you wants to add");
		Scanner scn = new Scanner(System.in);
		int contactNumber = scn.nextInt();

		for (int k = 0; k < contactNumber; k++) {
			System.out.println("Enter   new contact details ");
			entry5.addContact(entry5.getInitialContactDetails());
		}
		System.out.println("contact book after addition");
		// System.out.println("no of entries in contact book are "+contactBook.size());
		entry5.displayContactDetails();

	}
}
