package com.AddressBook;

public class AddressBookMain2 {
	
	public static void main(String[] args) {
		System.out.println("--------------------Welcome To Address Book Program-----------------------");
		Contact_Methods2 obj = new Contact_Methods2();
		obj.addContact();
		obj.displayContacts();
		
	}
}