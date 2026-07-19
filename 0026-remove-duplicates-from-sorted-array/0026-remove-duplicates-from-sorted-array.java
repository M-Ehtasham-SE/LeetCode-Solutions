class Solution {
    public int removeDuplicates(int[] nums) {
        int i=nums.length;
        if(i==0){
            return i;
        }
        int k=0;
        int left=0;
        int right=nums.length;
        while(left<right){
            if(left==nums.length-1||nums[left]!=nums[left+1]){
            nums[k]=nums[left];
            k++;
            }
            left++;
        }
        return k;
    }
}