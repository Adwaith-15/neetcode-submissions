class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);

       String str = strs[0];
       for(int i=1;i<strs.length;i++){
        if(str.equals(strs[i].substring(0,str.length()-1))) continue;
        else str=str.substring(0,str.length()-1);
       } 
       return str;
    }
}