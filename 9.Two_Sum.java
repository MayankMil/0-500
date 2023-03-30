/************************************************************************** Problem ***********************************************************************************/

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/


/************************************************************************** CODE ***********************************************************************************/

//Approach 1:

public int[] twoSum(int[] nums, int target) 
{
    int n = nums.length; // get the length of the input array
    int[] ans = new int[2]; // create an array to store the indices of the two elements whose sum equals the target

    // loop through each element in the input array
    for(int i=0; i<n; i++)
    {
        // loop through the remaining elements to check if their sum with the current element equals the target
        for(int j=i+1; j<n; j++)
        {
           int sum = nums[i] + nums[j]; // calculate the sum of the current element and the next element

           // if the sum equals the target, store the indices of the two elements in the ans array and break out of the loop
           if(sum == target)
           {
               ans[0] = i;
               ans[1] = j;
               break;
           }
        }
    }
    return ans; // return the ans array with the indices of the two elements
}

/************************************************************************** CODE ***********************************************************************************/


//Appraoch 2:

class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int n = nums.length;
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>(); // create a hash map to store the elements and their indices

        // loop through each element in the input array
        for(int i=0; i<n; i++)
        {
            // check if the hash map already contains the complement of the current element
            if(map.containsKey(target - nums[i]))
            {
                // if the complement exists, return the indices of the two elements whose sum equals the target
                return new int[] {map.get(target-nums[i]), i};
            }

            // if the complement doesn't exist in the hash map, add the current element and its index to the hash map
            map.put(nums[i],i);
        }

        return null; // return null if no pair of elements in the array equals the target
    }
}


/************************************************************************** Dry Run ***********************************************************************************/


/*
Example: nums = [2, 7, 11, 15], target = 9

Initialize n to 4, ans to [0, 0], and create an empty hash map.

Loop through each element in nums:

On the first iteration, i=0 and nums[i]=2. Check if the hash map contains the complement of 2, which is 9-2=7. The hash map is empty, so this condition is false. Add 2 and its index (0) to the hash map.
On the second iteration, i=1 and nums[i]=7. Check if the hash map contains the complement of 7, which is 9-7=2. The hash map contains 2 with index 0, so this condition is true. Return [0, 1] as the indices of the two elements whose sum equals the target.
End of loop. Return [0, 1] as the final answer.*/
