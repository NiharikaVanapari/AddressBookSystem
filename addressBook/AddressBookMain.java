package addressBook;

import java.util.Scanner;

public class AddressBookMain
{

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
	
		AddressBookSystem contact = new AddressBookSystem();
		
		while (true)
		{
			System.out.println("Please choose from below choices .");
			System.out.println(" 1 Add Contact "
					+ "\n 2 Edit Contact "
					+"\n 3 Delete Contact "
					+ "\n 4 Display Contact "
					+ "\n 5 Search "
					+ "\n 6 Quit ");
			int userChoice = scanner.nextInt();
			switch (userChoice) 
			{
				case 1:
					contact.addContact();	
					break;
				case 2:
					System.out.println("Enter the Phone Number");
					String phoneNumber = scanner.next();
					boolean updated = contact.editContact(phoneNumber);	
					if(updated)
					{
						System.out.println("Contact Updated.");
					}
					else
					{
						System.out.println("Contact not found");
					}
					break;
				case 3:
					System.out.println("Enter the Phone Number");
					String phoneNumberToDel = scanner.next();
					 boolean status = contact.deleteContact(phoneNumberToDel);
					 if(status)
						{
							System.out.println("Contact Deleted Successfully");
						}
						else
						{
							System.out.println("Contact not found");
						}
					 break;
				case 4:	
					contact.displayContacts();
					break;
				case 5:
					System.out.println("Enter the city or state which to be searched");
					String searchKey = scanner.next();
					contact.searchPerson(searchKey);
					break;
				default:
					System.out.println("You just Quit");
					System.exit(0);
			}
		}
	}
}