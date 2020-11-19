package Q1;

/**
 * 
 * @author jenniferzhang
 *
 */

public class dog extends pet {
	
	/**
	 * 
	 * @param name
	 * @param feed
	 */
	public dog(String name, String feed) {
		super(name, feed);
	}
	
	// activity method
	public void activity() {
		System.out.println("dig bones");
	}
	
	// speak method 
	public void speak() {
		System.out.println("Whof Whof");
	}
	
	// fun fact
	public void funFact() {
		System.out.println("The tallest dog in the world is 44 inches tall!");
	}
	
}
