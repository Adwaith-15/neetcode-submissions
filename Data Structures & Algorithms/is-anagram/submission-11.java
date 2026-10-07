class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;

        HashMap<Character,Integer> scount = new HashMap<>();
        HashMap<Character,Integer> tcount= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!scount.contains(s.charAt(i))){
             scount.put(s.charAt(i),1);   

            }
            scount.put(s.charAt(i),scount.get(s.charAt(i))+1);
             if(!tcount.contains(t.charAt(i))){
             tcount.put(t.charAt(i),1);   

            }
            tcount.put(t.charAt(i),tcount.get(t.charAt(i))+1);
        }
        return scount.equals(tcount);
    }
}
