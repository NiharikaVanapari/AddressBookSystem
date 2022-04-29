package addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem		
{
	
		
	static Scanner sc = new Scanner(System.in);
	 static ArrayList<Contact> contactList = new ArrayList<>();
	   
	    public static void main(String[] args) 
	    {
	    	// Welcome message
	        System.out.println("Welcome to the Address book program"); 
	        AddressBookSystem addressMain = new AddressBookSystem();
	        addressMain.addingContactList();
	    }
	    
	    // Display the  Address book
	    public void display(ArrayList<Contact> contactList)
	   {
	        for (Contact contact : contactList) 
	        {
	            System.out.println(contact);
	        }
	    }
	    
	    // method to choose an option	
	    public void addingContactList() 
	    {
	        while (true)
	        {
	            System.out.println("Press 0 - Display all contacts");
	            System.out.println("Press 1 - Add contact");
	            System.out.println("Press 2 - Edit contact");
	            System.out.println("Press 3 - Delete contact");
	            System.out.println("Press 4 - Exit");
	            int option = sc.nextInt();
	            sc.nextLine();

	            switch (option)
	            {
	                case 0 -> display(contactList);
	                case 1 -> addingContact(null, contactList);
	                case 2 -> editContact();
	                case 3 -> deletingContact(contactList);
	            }
	            if (option == 4)
	            {
	                break;
	            }
	        }
	    }
	    
	    // adding contacts to addBook
	    public void addingContact(Contact contact, ArrayList<Contact> contactList) {

	        contact = new Contact();

	        System.out.println("Enter first name : ");
	        contact.firstname = sc.next();

	        System.out.println("Enter last name : ");
	        contact.lastname = sc.next();

	        System.out.println("Enter address : ");
	        contact.city = sc.next();
	       

	        System.out.println("Enter city : ");
	        contact.city = sc.next();

	        System.out.println("Enter state : ");
	        contact.state = sc.next();

	        System.out.println("Enter zip code : ");
	        contact.zipcode = sc.nextInt();

	        System.out.println("Enter phone number : ");
	        contact.phonenumber = sc.nextLong();

	        System.out.println("Enter email : ");
	        contact.email = sc.next();

	        contactList.add(contact);

	    }
  
	    // method for deleting contact in addBook
	    public void deletingContact(ArrayList<Contact> contactList) 
	    {
	        System.out.println("Enter the first name of the contact you wish to delete");
	        String delete = sc.next();
	        contactList.removeIf(contact -> contact.firstname.equals(delete));   
	    }
	    
		// method for editing contact in addBook
	    public void editContact() 
		{
	        System.out.println("Enter the first name of contact you wish to edit");
	        String edit = sc.nextLine();
	        System.out.println("Press 1 - To edit first name");
	        System.out.println("Press 2 - To edit last name");
	        System.out.println("Press 3 - To edit address");
	        System.out.println("Press 4 - To edit city");
	        System.out.println("Press 5 - To edit state");
	        System.out.println("Press 6 - To edit zip code");
	        System.out.println("Press 7 - To edit phone number");
	        System.out.println("Press 8 - To edit email");
	        int choice = sc.nextInt();
	        if (choice == 1) {
	            for (Contact contactItems : contactList) {
	                if (contactItems.firstname.equals(edit)) {
	                    System.out.println("Enter new first name");
	                    contactItems.firstname = sc.next();
	                }
	            }
	        }
	        if (choice == 2) {
	            for (Contact contactItems : contactList) {
	                if (contactItems.firstname.equals(edit)) {
	                    System.out.println("Enter new last name");
	                    contactItems.lastname = sc.next();
	                }
	            }
	        }
	        if (choice == 3) {
	            for (Contact contactItems : contactList) {
	                if (contactItems.firstname.equals(edit)) {
	                    System.out.println("Enter new address");
	                    contactItems.city = sc.next();
	                }
	            }
	        }
	        if (choice == 4) {
	            for (Contact contactItems : contactList) {
	                if (contactItems.firstname.equals(edit)) {
	                    System.out.println("Enter new city");
	                    contactItems.city = sc.next();
	                }
	            }
	        }
	        if (choice == 5) {
	            for (Contact contactItems : contactList) {
	                if (contactItems.firstname.equals(edit)) {
	                    System.out.println("Enter new state");
	                    contactItems.state = sc.next();
	                }
	            }
	        }
	        if (choice == 6) {
	            for (Contact contactItems : contactList) {
	                if (contactItems.firstname.equals(edit)) {
	                    System.out.println("Enter new zip code");
	                    contactItems.zipcode = sc.nextInt();
	                }
	            }
	        }
	        if (choice == 7) {
	            for (Contact contactItems : contactList) {
	                if (contactItems.firstname.equals(edit)) {
	                    System.out.println("Enter new phone number");
	                    contactItems.phonenumber = sc.nextLong();
	                }
	            }
	        }
	        if (choice == 8) {
	            for (Contact contactItems : contactList) {
	                if (contactItems.firstname.equals(edit)) {
	                    System.out.println("Enter new email");
	                    contactItems.email = sc.next();
	                }
	            }
	        }
	    }	   
}