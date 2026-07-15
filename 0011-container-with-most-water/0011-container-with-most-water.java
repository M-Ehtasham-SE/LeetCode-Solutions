class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int width=right-left;
            int currheight=Math.min(height[left],height[right]);
            int currarea=currheight*width;
            max=Math.max(max,currarea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }

        }
    return max;
    }
}