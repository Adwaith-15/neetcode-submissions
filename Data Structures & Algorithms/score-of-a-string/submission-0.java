class Solution {
    public int scoreOfString(String s) {
      int left=0;
      int right=1;
        int result=0;

      while(right<=s.length()-1 && left!=right){
        int a=s.charAt(left);
        int b=s.charAt(right);
     
        result+=Math.abs(b-a);
        left++;
        right++;
      }  
      return result;
    }
}