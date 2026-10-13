class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i=0,j=0;
        int num;
        while(i<word.length() && j<abbr.length()){
            if(Character.isLetter(abbr.charAt(j))){
                if(word.charAt(i) != abbr.charAt(j)){
                    return false;
                }
                i++;
                j++;
            }
            else{
                num=0;
                while(j<abbr.length() && Character.isDigit(abbr.charAt(j))){
                    if(num==0 && abbr.charAt(j)=='0') return false;
                    num=num*10+(abbr.charAt(j)-'0');
                    j++;
                }
                i+=num;
                if(i>word.length()) return false;

            }
        }
        return true;
    }
}