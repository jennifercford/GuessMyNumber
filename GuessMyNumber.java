import java.util.Scanner; 

public class GuessMyNumber { 
	public static void doSomething(){
		System.out.println("I'm doing something!!!");
	}

    public static void main(String[] args) { 
        System.out.println("GuessMyNumber is running!"); 

        doSomething();

        // Ask the user for their number 
        // and store it in an int variable
        System.out.println("Please enter a number between 0 and 10"); 
        Scanner inputScanner = new Scanner(System.in); 
        int userNumber = inputScanner.nextInt(); 
        System.out.println("You entered: " + userNumber); 

        // Generate a random number between 0 and 10
        // and store it in another int variable
        int computerNumber = (int) (Math.random() * 10); 
        System.out.println("Computer generated: " + computerNumber); 

        // Compare the two and display who won
        if (userNumber > computerNumber) { 
            System.out.println("You win!"); 
        } else { 
            System.out.println("I win!"); 
        }

        System.out.println("Thank you for playing!"); 
    }
}

