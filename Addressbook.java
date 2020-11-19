package Q2;

/**
 * 
 * @author jenniferzhang
 *
 */

public class Addressbook{
	
	// declaration of variables
	static int numOfEntries;
	static String[] names;
	static String[] phones;
	static String[] addresses;
	
	// default constructor
	public Addressbook() {
		numOfEntries = 0;
		names = new String[50];
		phones = new String[50];
		addresses = new String[50];
	}
	
	/**
	 * 
	 * @param name
	 * @param phoneNumber
	 * @param address
	 */
	public void add (String name, String phoneNumber, String address) {
		phones[numOfEntries] = phoneNumber;
		names[numOfEntries] = name;
		addresses[numOfEntries] = address;
		numOfEntries ++;
	}

}








