class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if(nums[left]==nums[left+1]){
                return true;
            }
            left++;
        }
        return false;
    }
}