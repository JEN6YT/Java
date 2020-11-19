package Q1;

/**
 * 
 * @author jenniferzhang
 *
 */

public class pet {
	
	// variables
	private String name, feed;
	
	/**
	 * 
	 * @param name
	 * @param feed
	 */
	public pet(String name, String feed) {
		this.name = name;
		this.feed = feed;
	}
	
	/**
	 * 
	 * @return name of the pet
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	public String setName(String name) {
		return name;
	}

	/**
	 * 
	 * @return the food of the pet
	 */
	public String getFeed() {
		return feed;
	}

	/**
	 * 
	 * @param feed
	 * @return
	 */
	public String setFeed(String feed) {
		return feed;
	}

	// activity method
	public void activity() {
		System.out.println("do something");
	}
	
	// speak method
	public void speak() {
		System.out.println("say something");
	}

	@Override
	public String toString() {
		return "pet [name=" + name + ", feed=" + feed + "]";
	}

}
