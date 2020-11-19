package Q2;

/**
 * 
 * @author jenniferzhang
 *
 */

// import scanner class
import java.util.Scanner;

// main class extends AddressbookOther
public class AddressBookMain extends AddressbookOther {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// create an object
		AddressbookOther ab = new AddressbookOther();
		
		// declaration of a variable
		String a = null;
		
		do {
			int b = ab.getNumOfEntries();
			System.out.println("the current number of entries is "+b);
			String name;
			String phone;
			String address;
			
			// with just one entry, create more entries
			if(b == 0) {
				System.out.println("You have zero entries. Please create entries.");
				System.out.println("Please enter the name: ");
				name = s.next();
				System.out.println("Please enter the phone number: ");
				phone = s.next();
				System.out.println("Please enter the address: ");
				address = s.next();
				ab.add(name,phone,address);
				System.out.println("Name: "+name+";"+"Phone Number: "+phone+";"+"Address: "+address);
				System.out.println("Would you like to go to the main menu?");
				a = s.next();
			}
			
			// choose an option
			System.out.println("Please choose from the following options: ");
			System.out.println("A) Create a new entry\nB) Look up the phone number and the address given a name\nC) Change an existing entry\nD) View all current entries");
			String choice = s.next();
			
			// create a new entry
			if(choice.equalsIgnoreCase("A")) {
				System.out.println("Please enter the name: ");
				name = s.next();
				System.out.println("Please enter the phone number: ");
				phone = s.next();
				System.out.println("Please enter the address: ");
				address = s.next();
				ab.add(name,phone,address);
				System.out.println("Name: "+name+";"+"Phone Number: "+phone+";"+"Address: "+address);
				System.out.println("Would you like to go to the main menu?");
				a = s.next();
			}
			
			// look up the phone number and the address
			if(choice.equalsIgnoreCase("B")) {
				System.out.println("Please enter the name:");
				name = s.next();
				for(int i=0; i<numOfEntries; i++) {
					if(name.equalsIgnoreCase(names[i])) {
						System.out.println("the phone number is: "+phones[i]+";"+"the address is: "+addresses[i]);
					}
					else {
						System.out.println("Sorry, the name you are looking for is not in the addressbook.");
					}
				}
				System.out.println("Would you like to go to the main menu?");
				a = s.next();
			}
			
			//change the info
			if(choice.equalsIgnoreCase("C")) {
				System.out.println("Please enter the name: ");
				name = s.next();
				for(int i=0; i<numOfEntries; i++) {
					if(name.equalsIgnoreCase(names[i])) {
						System.out.println("the phone number is: "+phones[i]+";"+"the address is: "+addresses[i]);
						System.out.println("Which would you like to change? Please select from the following: ");
						System.out.println("1. Phone number\n2. Address\n3. Both");
						String choice2 = s.next();
						
						// change the phone number
						if(choice2.equals("1")) {
							System.out.println("Please enter the new phone number: ");
							String Number = s.next();
							phones[i] = phones[i].replace(phones[i],Number);
							System.out.println("Name: "+name+";"+"New phone number: "+phones[i]+";"+"Address: "+addresses[i]);
						}
						
						// change the address
						else if(choice2.equals("2")) {
							System.out.println("Please enter the new address: ");
							String Address = s.next();
							addresses[i] = addresses[i].replace(addresses[i],Address);
							System.out.println("Name: "+name+";"+"Phone number: "+phones[i]+";"+"New address: "+addresses[i]);
						}
						
						// change both
						else if(choice2.equals("3")) {
							System.out.println("Please enter the new phone number: ");
							String Number = s.next();
							phones[i] = phones[i].replace(phones[i],Number);
							System.out.println("Please enter the new address: ");
							String Address = s.next();
							addresses[i] = addresses[i].replace(addresses[i],Address);
							System.out.println("Name: "+name+";"+"New phone number: "+phones[i]+";"+"New address: "+addresses[i]);
						}
					}
					else {
						System.out.println("Sorry, the name you are looking for is not in the addressbook.");
					}
				}
				System.out.println("Would you like to go to the main menu?");
				a = s.next();
			}
			
			// view all current entries
			if(choice.equalsIgnoreCase("D")) {
				System.out.println("You now have "+ab.getNumOfEntries()+" entries.");
				for(int i=0; i<numOfEntries; i++) {
					System.out.println("Name: "+names[i]+";"+"Phone number: "+phones[i]+";"+"Address: "+addresses[i]);
				}
				System.out.println("Would you like to go to the main menu?");
				a = s.next();
			}
		}while(a.equalsIgnoreCase("yes"));

	}

}
