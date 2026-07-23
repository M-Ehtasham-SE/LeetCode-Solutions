class Solution {
    public int characterReplacement(String s, int k) {
        int[] count=new int[26];
        int left=0;
        int maxcount=0;
        int maxlength=0;
        for(int i=0;i<s.length();i++){
            char currchar=s.charAt(i);
            count[currchar-'A']++;
            maxcount=Math.max(maxcount,count[currchar - 'A']);
            while((i-left+1) - maxcount >k){
                count[s.charAt(left)-'A']--;
                left++;
            }
            maxlength=Math.max(maxlength,i-left+1);
        }
        return maxlength;
    }
}