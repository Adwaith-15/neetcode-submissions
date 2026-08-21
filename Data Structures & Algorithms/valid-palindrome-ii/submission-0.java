class Solution {
    public boolean validPalindrome(String s) {
    s=s.replaceAll("[^a-zA-Z0-9]","");
    s=s.toLowerCase();
    int left=0;
    int right=s.length()-1;
   while(left<right){
    if(s.charAt(left) == s.charAt(right)){
        left++;
        right--;
    }
    else return ispalindrome(left+1,right,s) || ispalindrome(left,right-1,s);
   }
   return true;
    }

    
    public static boolean ispalindrome(int l,int r,String s){
        while(l<r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }else{
                return  false;
            }
        }
        return true;

    }

}