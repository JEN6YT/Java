package Q1;

/**
 * 
 * @author jenniferzhang
 *
 */

public class fish extends pet {

	/**
	 * 
	 * @param name
	 * @param feed
	 */
	public fish(String name, String feed) {
		super(name, feed);
	}

	// activity method
	public void activity() {
		System.out.println("blow bubbles");
	}
	
	// speak method
	public void speak() {
		System.out.println("bub bub");
	}
	
	// fun fact
	public void funFact() {
		System.out.println("What is the loudest fish? Answer: the croaker!");
	}

}
