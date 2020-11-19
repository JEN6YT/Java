package Q1;

public class snake extends pet {
	
	/**
	 * 
	 * @param name
	 * @param feed
	 */
	public snake(String name, String feed) {
		super(name, feed);
	}

	// activity method
	public void activity() {
		System.out.println("catch rabbits");
	}
	
	// speak method
	public void speak() {
		System.out.println("Zzzz Ssss");
	}
	
	// fun fact
	public void funFact() {
		System.out.println("Snakes have internal ears but not external ones...");
	}

}
