class Solution {
    public String longestCommonPrefix(String[] strs) {
       
    char[] pre= strs[0].toCharArray();
    boolean y=true;
    for(int i=0;i<pre.length;i++){
      for(int j=1;j<strs.length;j++){
        char[] pre2 = strs[j].toCharArray();
        if(pre[i] != pre2[i]){
          y=false;
          break;
        }
      }
      if(y==false){
        pre=Arrays.copyOf(pre,i);
      }
    }
    return new String(pre); 
    }
}