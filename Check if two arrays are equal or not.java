/******************************************* Question ********************************************/

/*
Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.
Example 1:
Input:
N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
Output: 1
Explanation: Both the array can be 
rearranged to {0,1,2,4,5}
*/

/******************************************* Approach ********************************************/



/******************************************* Code ********************************************/

//Approach 1:

lass Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int n)
    {
        //if lenghth not equal then return false
        if (A.length != B.length) return false;
      
      //Sort both arrays
        Arrays.sort(A);
        Arrays.sort(B);
      
        //check at each index
       for(int i=0; i<n; i++)
        {
            if(A[i] != B[i]) return false;
        }
        
        // If we reach this point, the arrays are equal so return true.
        return true;
    }
}

......................................................................................................................................................

//Approach 2:


class Solution 
{
    // Function to check if two arrays are equal or not.
    public static boolean check(long A[], long B[], int n) 
    {
        // Create a HashMap to store the frequency of each element in array A
        Map<Long, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) 
        {
            // Increase the frequency count for each element in array A
            // If the element doesn't exist in the HashMap, it defaults to 0
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        // Check if all elements in array B are present in array A with the same frequency
        for (int i = 0; i < n; i++) 
        {
            if (!map.containsKey(B[i]) || map.get(B[i]) == 0) 
            {
                // If an element in B is not present in A, arrays are not equal
                return false; 
            } 
                else 
                {
                    // Decrement the frequency of the element in A
                    map.put(B[i], map.get(B[i]) - 1); 
                }
            }
        }

        // Arrays are equal
        return true; 
    }
}



/******************************************* Dry Run ********************************************/


Approach 2 dry run:

/*
A = {1, 2, 5, 4, 0}
B = {2, 4, 5, 0, 1}
map = {1:1, 2:1, 5:1, 4:1, 0:1}
Next, the code iterates through array B and checks if each element is present in A with the same frequency.
For each element in B, the code checks if it's in the map. If it's not in the map, then B and A are not equal.
If it is in the map, the code checks the frequency of the element in A. If the frequency is 0, then B and A are not equal. 
If the frequency is not 0, the code decrements the frequency of the element in A.
  
i = 0: B[i] = 2. The element is in the map with a frequency of 1. We decrement the frequency of 2 in the map to get:
map = {1:1, 2:0, 5:1, 4:1, 0:1}
i = 1: B[i] = 4. The element is in the map with a frequency of 1. We decrement the frequency of 4 in the map to get:
map = {1:1, 2:0, 5:1, 4:0, 0:1}
i = 2: B[i] = 5. The element is in the map with a frequency of 1. We decrement the frequency of 5 in the map to get:
After the first loop, the map will be:
Copy code
{1=1, 2=1, 5=1, 4=1, 0=1}
After the second loop, the map will be:
Copy code
{1=0, 2=0, 5=0, 4=0, 0=0}
Since all elements in B are present in A with the same frequency, the function will return true.
*/
