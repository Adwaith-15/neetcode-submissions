class Solution {
    public boolean isPalindrome(String s) {
    String rev;
   s= s.replaceAll("[^a-zA-Z0-9]","");
   s= s.toLowerCase();
    rev=revstr(s);
    if(rev.equals(s)){
        return true;
    }    
    else return false;
    }
    public static String revstr(String str){
        char[] r= str.toCharArray();
        char[] ans= new char[str.length()];
        for(int i=str.length()-1 ; i>=0;i--){
                ans[str.length()-i-1]=r[i];
        }
    return new String(ans);
    }
}
