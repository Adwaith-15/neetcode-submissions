class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] w=new char[word1.length()+word2.length()];
        int c1=0,c2=0;
        for(int i=0;i<word1.length()+word2.length(); i++){
           if(i%2==0   && c1!=word1.length()){
            w[i] = word1.charAt(c1);
            c1++;
           } 
           else if(c2!=word2.length()){
            w[i]= word2.charAt(c2);
            c2++;

           }
           else{
            if(c1==word1.length() && c2!=word2.length()){
                w[i]=word2.charAt(c2);
                c2++;
            }
            else if(c1!=word1.length() && c2==word2.length()){
                w[i]=word1.charAt(c1);
                c1++;
            }
        }
        }
        String ans= new String(w);
        return ans;
 
    }
}