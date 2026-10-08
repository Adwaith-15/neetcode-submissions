class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> map = new HashMap<>();
       HashSet<Character> used = new HashSet<>();
       for(int i=0;i<s.length();i++){
         if(!map.containsKey(s.charAt(i))){
            map.put(s.charAt(i),t.charAt(i));
            used.add(t.charAt(i));
         }
         else{
            
            if(t.charAt(i) != map.get(s.charAt(i)) || used.contains(map.get(t.charAt(i))) ) return false;
         }
       } 
       return true;
    }
}