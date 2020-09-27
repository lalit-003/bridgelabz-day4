package AddressBook;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class AddressUC3 {
	// arraylist created to store contact details
	private ArrayList<Initialization> contactList = new ArrayList<>();

// method to take input of contact details n 
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

// method to add details of contact in arraylist
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

// method to edit contact details
	private void editContact() {
		int match = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  first name of person whose contact details you wants to edit");
		String name = sc.nextLine();
		Initialization contactToBeEdited = contactList.get(0);
		System.out.println(contactList.get(0));

		for (int j = 0; j < contactList.size(); j++) {
			Initialization conMatch = contactList.get(j);
			System.out.println(conMatch.firstName);
			if (name.equals(conMatch.firstName)) {
				match = j;
				contactToBeEdited = contactList.get(match);

			} else {
				System.out.println("no contact with this first name ");
			}

		}

		if (match != -1) {

			System.out.print(" select the appropriate option for what you want to edit in selected contact"
					+ "\n1. Zip Code" + "\n2. First Name" + "\n3  Last Name" + "\n4. City" + "\n5. State"

					+ "\n6. Phone Number" + "\n7. Email");

			int option = sc.nextInt();
			sc.nextLine(); // catches the new line character

			switch (option) {
			case 1:
				System.out.println("enter  new zip code");
				int newZipCode = sc.nextInt();
				contactToBeEdited.setZip(newZipCode);
				break;

			case 2:
				System.out.println("enter  new first name");
				String newFirstName = sc.nextLine();
				contactToBeEdited.setFirstName(newFirstName);
				break;

			case 3:
				System.out.println("enter  new last name");
				String newLastName = sc.nextLine();
				contactToBeEdited.setFirstName(newLastName);
				break;

			case 4:
				System.out.println("enter  new city name");
				String newcityName = sc.nextLine();
				contactToBeEdited.setCity(newcityName);
				break;

			case 5:
				System.out.println("enter  new state name");
				String newStateName = sc.nextLine();
				contactToBeEdited.setState(newStateName);
				break;

			/*
			 * case 5 : System.out.println("enter  new zip code" ); int newZipCode =
			 * sc.nextInt(); contactToBeEdited.setZip(newZipCode);
			 */

			case 6:
				System.out.println("enter  new phone number");
				String newPhoneNumber = sc.nextLine();
				contactToBeEdited.setPhoneNumber(newPhoneNumber);
				break;

			case 7:
				System.out.println("enter  new email address");
				String newEmailAddress = sc.nextLine();
				contactToBeEdited.setEmail(newEmailAddress);
				break;

			default:
				System.out.println("choice does not exist");

			}

		}

	}

// main function 
	public static void main(String[] args) {

		System.out.println("this is address book feature");

		AddressUC3 entry3 = new AddressUC3();

		entry3.addContact(entry3.getInitialContactDetails());
		entry3.displayContactDetails();
		entry3.editContact();
		entry3.displayContactDetails();

	}
}
