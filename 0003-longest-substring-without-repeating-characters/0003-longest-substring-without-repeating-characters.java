class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet chk = new HashSet<>();
        int left=0;
        int len=0;
        for(int i=0;i<s.length();i++){
           while(chk.contains(s.charAt(i))){
                chk.remove(s.charAt(left));
                left++;
           }
           chk.add(s.charAt(i));
           len=Math.max(len,i-left+1);
        }
        return len;
       
    }
}