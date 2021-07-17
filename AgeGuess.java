import java.util.Scanner; 
public class AgeGuess {
	public static void main(String[] args) {
		
		try (Scanner var = new Scanner(System.in)) {			 
			String name;
			String ageGuess;
			System.out.println("Enter Your Username :");
			name= var.nextLine();
			System.out.println("Enter Your Age :"); 
			ageGuess= var.nextLine();
			System.out.println("Name :" + name);
			System.out.println("Age :" + ageGuess );
		}
				
	}
	

}
