import java.util.*;

//Brute Force Approach
public class Main
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array from the user
        int n = sc.nextInt();
        
        // Create an array of size n to store the input
        int[] arr = new int[n];
        
        // Read n integers from the user and store them in the array
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        // Create a new array of the same size to store the reversed elements
        int[] reversedArr = new int[n];
        
        // Copy the elements from the original array to the new array in reverse order
        for(int i = 0; i < n; i++)
        {
            //this line contains the whole logic dry run the code you will get it, Check out this code's dry run below
            reversedArr[i] = arr[n - i - 1];
        }
        
        // Print the reversed array
        for(int i = 0; i < n; i++)
        {
            System.out.print(reversedArr[i] + " ");
        }
    }
}


//Optimized Approach

import java.util.*;

public class Main
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array from the user
        int n = sc.nextInt();
        
        // Create an array of size n to store the input
        int[] arr = new int[n];
        
        // Read n integers from the user and store them in the array
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        // Reverse the order of the elements in the array
        int start = 0, end = n - 1;
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        // Print the reversed array
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}




//Check out Brute Force code's dry run below

/*
n the line reversedArr[i] = arr[n - i - 1];, we are copying the elements from the original array to the new array in reverse order.

Let's break down the expression n - i - 1. Here, n is the size of the array and i is the index of the element we want to copy.

So, for the first element in the original array (arr[0]), we want to copy it to the last index of the new array (reversedArr[n-1]). Therefore, we need to subtract 1 from n, since the last index of the array is always n-1.

Similarly, for the second element in the original array (arr[1]), we want to copy it to the second-to-last index of the new array (reversedArr[n-2]). Therefore, we need to subtract 2 from n.

In general, for the i-th element in the original array (arr[i]), we want to copy it to the (n-i-1)-th index of the new array (reversedArr[n-i-1]). Therefore, we need to subtract i from n and then subtract 1 to get the correct index in the new array.

By using this expression in our loop, we can copy the elements from the original array to the new array in reverse order*/
