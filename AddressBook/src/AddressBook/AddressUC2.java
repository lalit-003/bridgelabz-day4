package AddressBook;

import java.util.LinkedList;
import java.util.Scanner;

public class AddressUC2 {

	// linked list created to add employee contact
	private LinkedList<Initialization> contacts = new LinkedList<>();

	// method to add contact details in linked list
	public void addContactDetails(String firstName, String lastName, String addressCity, String addressState,
			int addresszip, String phoneNumber, String email) {
		Initialization member = new Initialization(firstName, lastName, addressCity, addressState, addresszip,
				phoneNumber, email);
		contacts.add(member);
		System.out.println(" contact added");

	}

	// method display details of contact book entries
	public void display(Initialization member) {

		System.out.println("first name is :" + member.firstName);

		System.out.println(" last name is :" + member.lastName);

		System.out.println(" city name is :" + member.addressCity);

		System.out.println(" state name is :" + member.addressState);

		System.out.println(" zip code is  :" + member.addresszip);

		System.out.println(" phone number is :" + member.phoneNumber);

		System.out.println(" email address is :" + member.email);

	}

	public static void main(String[] args) {
		// taking input from console
		System.out.println("main starts");
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

		System.out.println("enter zip code of address");
		int zipCode = scan.nextInt();

		// adding console input in contactlist
		AddressUC2 entry = new AddressUC2();
		entry.addContactDetails(firstName, lastName, cityName, stateName, zipCode, phoneNumber, emailAddress);
		entry.display(new Initialization(firstName, lastName, cityName, stateName, zipCode, phoneNumber, emailAddress));

		/*
		 * entry.addContactDetails("amit", "sharma", "hisar", "haryana", 125367,
		 * "9087654590", "amit@abc"); System.out.println( entry.display( new
		 * Initialization ("amit", "sharma", "hisar", "haryana", 125367, "9087654590",
		 * "amit@abc"))); System.out.println("main ends");
		 */

	}
}
