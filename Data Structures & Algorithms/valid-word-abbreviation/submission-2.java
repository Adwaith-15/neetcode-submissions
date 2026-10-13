class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
/*my idea is to traverse the both strings and whe i get a char in abbr i will move only 1 time in both the strings and when i get numbers in the abbr i will move only once in the abbr and that n number  of times in the word steing and at the last everyting is done then it is true else it is false*/ 
      boolean waschar=false;
      int num=0,count=0;
      for(int i=0;i<abbr.length();i++){
        char ch=abbr.charAt(i);
        if(Character.isLetter(ch)){
            waschar=true;
            count+=num;
            num=0;
            count++;
        }
        else{
            if(waschar==true){
                waschar=false;
                num=num*10+(ch-'0');
            }
            else{
            num=num*10+(ch-'0');}
        }
        count+=num;
      }
      if(count==word.length()) return true;
      else return false;


    }
}