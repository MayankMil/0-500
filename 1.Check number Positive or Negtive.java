// Importing the required package
import java.util.*;


// Defining a public class Main
public class Main{
  
// Main method of the program
public static void main(String[] args){
  
  
// Creating an object of Scanner class to read input from user
Scanner sc = new Scanner(System.in);
  
    // Reading an integer input from user and storing it in a variable called number
    int number = sc.nextInt();
    
    // Checking if the number is greater than zero
    if(number > 0){
      
        // Printing a message indicating that the number is positive
        System.out.println("Given Number Is Positive");
    }
  
    // Checking if the number is less than zero
    else if(number < 0){
      
	    // Printing a message indicating that the number is negative
	    System.out.println("Given Number Is Negative");
	}
  
	// If the number is not greater than or less than zero, it must be zero
	else{
    
	    // Printing a message indicating that the number is zero
	    System.out.println("The Number is Zero");
    }
  
  }
}
