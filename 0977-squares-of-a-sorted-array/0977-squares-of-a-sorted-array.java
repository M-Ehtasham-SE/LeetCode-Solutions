class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int left=0;
        int right=n-1;
        int index=n-1;
        while(left<=right){
            int leftmax=nums[left]*nums[left];
            int rightmax=nums[right]*nums[right];
            if(leftmax>rightmax){
                result[index--]=leftmax;
                left++;
            }
            else{
                result[index--]=rightmax;
                right--;
            }
        }
        return result;
    }
}