class Solution {
    public int lengthOfLongestSubstring(String s) {
       int l=0,r;
       int maxlength=0;
      
       for(r=0;r<s.length();r++){
           int i=l;
           while(i<r){
            if(s.charAt(i) == s.charAt(r)){
               l=i+1;
               break;
            }
            i++;
           }
           maxlength=Math.max(r-l+1,maxlength);
       }
       return maxlength;
       
    }
}
