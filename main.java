package Q1;

// import Scanner class
import java.util.Scanner;

/**
 * 
 * @author jenniferzhang
 *
 */

public class main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// declaration of a variable
		String a = null;
		
		do {
			System.out.println("Welcome! Please choose from the following animals: ");
			System.out.println("A) Fish\nB) Dog\nC) Snake");
			String b = s.next();
			
			// fish 
			if(b.equalsIgnoreCase("a")) {
				System.out.println("Please enter a fish's name: ");
				String name = s.next();
				System.out.println("Please enter what fish eats: ");
				String food = s.next();
				
				// create a fish object
				fish f = new fish(name, food);
				System.out.println(f.toString());
				System.out.print(f.getName()+" likes to ");
				f.activity();
				System.out.print(f.getName()+ " makes such a sound: ");
				f.speak();
				System.out.println("Want to know a fun fact about fish?");
				f.funFact();
				
				// change the pet name
				System.out.println("Do you want to change the name of your pet?");
				String change = s.next();
				if(change.equalsIgnoreCase("yes")) {
					System.out.println("Please enter the new pet name: ");
					name = f.setName(s.next());
					System.out.print(name+" likes to ");
					f.activity();
					System.out.print(name+ " makes such a sound: ");
					f.speak();
				}
				
				// change the pet food
				System.out.println("Do you want to change his/her diet?");
				String anochange = s.next();
				if(anochange.equalsIgnoreCase("yes")) {
					System.out.println("Please enter the pet's new food: ");
					food = f.setFeed(s.next());
					System.out.println(name+" now eats "+food);
				}
				
				// whether return to the menu
				System.out.println("Would you like to return to the menu?");
				a = s.next();
			}
			
			// dog
			else if(b.equalsIgnoreCase("b")) {
				System.out.println("Please enter a dog's name: ");
				String name = s.next();
				System.out.println("Please enter what a dog eats: ");
				String food = s.next();
				
				// create a dog object
				dog d = new dog(name, food);
				System.out.println(d.toString());
				System.out.print(d.getName()+" likes to ");
				d.activity();
				System.out.print(d.getName()+ " makes such a sound: ");
				d.speak();
				System.out.println("Want to know a fun fact about dog?");
				d.funFact();
				
				// change the pet name
				System.out.println("Do you want to change the name of your pet?");
				String change = s.next();
				if(change.equalsIgnoreCase("yes")) {
					System.out.println("Please enter the new pet name: ");
					name = d.setName(s.next());
					System.out.print(name+" likes to ");
					d.activity();
					System.out.print(name+ " makes such a sound: ");
					d.speak();
				}
				
				// change the pet food
				System.out.println("Do you want to change his/her diet?");
				String anochange = s.next();
				if(anochange.equalsIgnoreCase("yes")) {
					System.out.println("Please enter the pet's new food: ");
					food = d.setFeed(s.next());
					System.out.println(name+" now eats "+food);
				}
				
				// whether return to the menu
				System.out.println("Would you like to return to the menu?");
				a = s.next();
			}
			
			// snake
			else if(b.equalsIgnoreCase("c")) {
				System.out.println("Please enter a snake's name: ");
				String name = s.next();
				System.out.println("Please enter what a snake eats: ");
				String food = s.next();
				
				// create a snake object
				snake n = new snake(name, food);
				System.out.println(n.toString());
				System.out.print(n.getName()+" likes to ");
				n.activity();
				System.out.print(n.getName()+ " makes such a sound: ");
				n.speak();
				System.out.println("Want to know a fun fact about snake?");
				n.funFact();
				
				// change the pet name
				System.out.println("Do you want to change the name of your pet?");
				String change = s.next();
				if(change.equalsIgnoreCase("yes")) {
					System.out.println("Please enter the new pet name: ");
					name = n.setName(s.next());
					System.out.print(name+" likes to ");
					n.activity();
					System.out.print(name+ " makes such a sound: ");
					n.speak();
				}
				
				// change the pet food
				System.out.println("Do you want to change his/her diet?");
				String anochange = s.next();
				if(anochange.equalsIgnoreCase("yes")) {
					System.out.println("Please enter the pet's new food: ");
					food = n.setFeed(s.next());
					System.out.println(name+" now eats "+food);
				}
				
				// whether to return to the menu
				System.out.println("Would you like to return to the menu?");
				a = s.next();
			}
		}while(a.equalsIgnoreCase("yes"));

	}

}
