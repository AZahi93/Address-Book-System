package com.AddressBook;

public class Contact1 {
	
	
			String First_Name;
			String Last_Name;
			String Address;
			String City;
			String State;
			int Zip_code;
			int Phone_number;
			String Email;
			
			public Contact1(String first_Name, String last_Name, String address, String city, String state,
					int zip_code, int phone_number, String email) {
				super();
				First_Name = first_Name;
				Last_Name = last_Name;
				Address = address;
				City = city;
				State = state;
				Zip_code = zip_code;
				Phone_number = phone_number;
				Email = email;
			}
	


			public String toString() {
				return String.format(First_Name + " " + Last_Name + " " + Address + " " + City + " " + State + " " + Zip_code + " " + Phone_number + " " + Email);
			}
			
			
		}