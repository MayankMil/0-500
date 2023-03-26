import java.util.*;

class Main 
    {
        // function to find a continuous subarray that adds up to a given number
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        
        ArrayList<Integer> result = new ArrayList<>();
        
         //Using this codition because any subarray with a sum of zero would have at least one positive,
        //and one negative number but there only positive number in the arrays
        if (s == 0) {
            result.add(-1);
            return result;
        }
      
        // initialize left and right pointers and sum variable
        int l = 0, r = 0, sum = 0;
        
        // loop through the array until the right pointer reaches the end
        while(r < n) {
            sum += arr[r]; // add the current element to the sum
            
            // if the current window sum is greater than the target sum
            // and left pointer is less than or equal to right pointer,
            // move the left pointer and subtract the corresponding element from the sum
            while(sum > s && l <= r) {
                sum -= arr[l];
                l++;
            }
    
            // if the current window sum is equal to the target sum,
            // add the starting and ending indices of the subarray to the result
            // and return the result
            if(sum == s) {
                result.add(l + 1); // add 1 for one-based indexing
                result.add(r + 1); // add 1 for one-based indexing
                return result;
            }
            
            r++; // move the right pointer to expand the window
        }
        
        // if no subarray found, add -1 to the result
        result.add(-1);
        return result;
    }
    
    public static void main(String[] args) {
        
        // sample input array
        int[] arr = {1, 2, 3, 7, 5};
        
        // target sum
        int s = 12;
        
        // find the subarray with the given sum
        ArrayList<Integer> result = subarraySum(arr, arr.length, s);
        
        // print the result
        if (result.size() == 1 && result.get(0) == -1) {
            System.out.println("No subarray found");
        } else {
            System.out.println("Subarray found from index " + result.get(0) + " to index " + result.get(1));
            }
        }
}
