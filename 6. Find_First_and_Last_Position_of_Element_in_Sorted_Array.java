class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int[] ans = new int[2];
        ans[0] = firstIndex(nums,target);
        ans[1] = endingIndex(nums,target);

        return ans;

    }

    public int firstIndex(int[] nums, int target)
    {
        int start = 0, end = nums.length - 1, ans = -1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;// mid = start+end;

            if(nums[mid] == target)
            {
                ans = mid;
                end = mid-1;
            }

            if(nums[mid] > target)
            {
                end = mid-1;
            }

            if(nums[mid] < target)
            {
                start = mid+1;
            }
        }

        return ans;
    }

    public int endingIndex(int[] nums, int target)
    {
        int start = 0, end = nums.length - 1, ans = -1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;// mid = start+end;

            if(nums[mid] == target)
            {
                ans = mid;
                start = mid+1;
            }

            if(nums[mid] > target)
            {
                end = mid-1;
            }

            if(nums[mid] < target)
            {
                start = mid+1;
            }
        }

        return ans;
    }
}
