class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;

        HashMap<Character,Integer> scount = new HashMap<>();
        HashMap<Character,Integer> tcount= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!scount.contains(s.chatAt(i))){
             scount.add(s.charAt(i),1);   

            }
            scount.add(s.charAt(i),scount.get(s.charAt(i))+1);
             if(!tcount.contains(t.chatAt(i))){
             tcount.add(t.charAt(i),1);   

            }
            tcount.add(t.charAt(i),tcount.get(t.charAt(i))+1);
        }
        return scount.equals(tcount)
    }
}
