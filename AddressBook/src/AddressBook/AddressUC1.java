package AddressBook;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddressUC1 {

	// linked list created

	private LinkedList<Initialization> contacts = new LinkedList<>();

	// method to add contact details in Linkedlist

	public void addContactDetails(String firstName, String lastName, String addressCity, String addressState,
			int addresszip, String phoneNumber, String email) {
		Initialization member = new Initialization(firstName, lastName, addressCity, addressState, addresszip,
				phoneNumber, email);
		contacts.add(member);
		System.out.println(" contact added");

	}
	// method display details of contact book entries

	public String display(Initialization member) {
		return "first name is : " + member.firstName + " last name is : " + member.lastName + " city is : "
				+ member.addressCity + " state is : " + member.addressCity + " zip code is " + member.addresszip
				+ " phone number is " + member.phoneNumber + " email is :" + member.email;

	}

// main function
	public static void main(String[] args) {
		System.out.println("main starts");

		AddressUC1 entry1 = new AddressUC1();

		// entries of new contact
		entry1.addContactDetails("sumit", "phogat", "makarani", "haryana", 124367, "9087654590", "sumit@abc");
		// printing out details of contact added
		System.out.println(entry1.display(
				new Initialization("sumit", "phogat", "makarani", "haryana", 124367, "9087654590", "sumit@abc")));

		entry1.addContactDetails("amit", "sharma", "hisar", "haryana", 125367, "9087654590", "amit@abc");
		System.out.println(entry1
				.display(new Initialization("amit", "sharma", "hisar", "haryana", 125367, "9087654590", "amit@abc")));
		System.out.println("main ends");

	}
}
