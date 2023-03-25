import java.util.*;

class Solution {

    //Function to find the sum of contiguous subarray with maximum sum.
    static long maxSubarraySum(int arr[], int n) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            currSum += arr[i];
            
            //if the current sum is greater than max sum, update max sum
            if(currSum > maxSum) {
                maxSum = currSum;
            }
            
            //if current sum is negative, then start over from next index
            if(currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }
    
    //main method to test the code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("Maximum sum of subarray: " + maxSum);
    }
}
