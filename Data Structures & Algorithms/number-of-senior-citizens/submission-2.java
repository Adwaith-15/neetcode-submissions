class Solution {
    public int countSeniors(String[] details) {
       int count=0;
       for(String p : details){
        char[] person=p.toCharArray();
        if(person[11] > '6'){
            count++;
        } else if(person[11] == '6'){
            if(person[12] > '0'){
                count++;
            }
        }
       }
       return count;
    }
}