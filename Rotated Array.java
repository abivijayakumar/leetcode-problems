class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            while(left<right && nums[left]==nums[left+1]) left++;
            while(left<right && nums[right]==nums[right-1]) right--;
            int mid=(left+right)/2;
            if(nums[mid]>nums[right]) left=mid+1;   // means minimum will be in the next half
            else
            {
                min=Math.min(min, nums[mid]);
                right=mid-1;
            }

        }
        return min;
    }
}
