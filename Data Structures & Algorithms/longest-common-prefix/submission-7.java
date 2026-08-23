class Solution {
    public String longestCommonPrefix(String[] strs) {
       String pre = strs[0];
       for(int i=1;i<strs.length; i++){
        for(int j=0;j<pre.length();j++){
          if(pre.charAt(j) != strs[i].charAt(j))
          {
            pre=pre.substring(0,j);
          }
        }
       }
       return pre; 
    }
}