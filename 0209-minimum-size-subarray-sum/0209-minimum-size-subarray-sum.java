class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int curr_sum=0;
        int min_length=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            curr_sum += nums[right];
            while(curr_sum>=target){
                int curr_length=right-left+1;
                min_length=Math.min(min_length,curr_length);
                curr_sum -= nums[left];
                left++;
            }
        }
        return (min_length == Integer.MAX_VALUE) ? 0 : min_length;
    }
}