import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        // read input from user
        int number = input.nextInt();
        
        int sum = 0;
        
        // store the original number for later comparison
        int actualNumber = number;
        
        // loop through each digit of the number
        while (number != 0) {
            
            // get the last digit of the number
            int digit = number % 10;
            
            // add the cube of the digit to the sum
            sum = sum + (digit * digit * digit);
            
            // remove the last digit from the number
            number = number / 10;
        }
        
        // check if the sum is equal to the original number
        if (sum == actualNumber) {
            System.out.println(actualNumber + " is an Armstrong number.");
        } else {
            System.out.println(actualNumber + " is not an Armstrong number.");
        }
    }
}
