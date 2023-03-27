import java.util.*;

class Main {
    public int[] searchRange(int[] nums, int target) {
        // create an array to store the starting and ending index of target
        int[] ans = new int[2];
        // find the first occurrence of target in the array
        ans[0] = firstIndex(nums,target);
        // find the last occurrence of target in the array
        ans[1] = endingIndex(nums,target);
        // return the array with starting and ending index of target
        return ans;
    }

    // method to find the first occurrence of target in the array
    public int firstIndex(int[] nums, int target) {
        // initialize the starting and ending indices of the array
        int start = 0, end = nums.length - 1, ans = -1;

        // loop until the starting index is less than or equal to the ending index
        while(start <= end) {
            // find the middle index of the array
            int mid = start + (end - start)/2;

            // if the middle element is equal to the target, update ans and search left side of the array
            if(nums[mid] == target) {
                ans = mid;
                end = mid-1;
            }
            // if the middle element is greater than target, search left side of the array
            else if(nums[mid] > target) {
                end = mid-1;
            }
            // if the middle element is less than target, search right side of the array
            else {
                start = mid+1;
            }
        }

        // return the index of the first occurrence of target
        return ans;
    }

    // method to find the last occurrence of target in the array
    public int endingIndex(int[] nums, int target) {
        // initialize the starting and ending indices of the array
        int start = 0, end = nums.length - 1, ans = -1;

        // loop until the starting index is less than or equal to the ending index
        while(start <= end) {
            // find the middle index of the array
            int mid = start + (end - start)/2;

            // if the middle element is equal to the target, update ans and search right side of the array
            if(nums[mid] == target) {
                ans = mid;
                start = mid+1;
            }
            // if the middle element is greater than target, search left side of the array
            else if(nums[mid] > target) {
                end = mid-1;
            }
            // if the middle element is less than target, search right side of the array
            else {
                start = mid+1;
            }
        }

        // return the index of the last occurrence of target
        return ans;
    }

    // main method to test the code
    public static void main(String[] args) {
        // create an instance of the Solution class
        Main solution = new Main();
        // create an array of integers
        int[] nums = {5,7,7,8,8,10};
        // set the target value
        int target = 8;
        // call the searchRange method to find the starting and ending index of target
        int[] ans = solution.searchRange(nums, target);
        // print the starting and ending index of target
        System.out.println("Starting index of " + target + " is " + ans[0]);
        System.out.println("Ending index of " + target + " is " + ans[1]);
    }
}
