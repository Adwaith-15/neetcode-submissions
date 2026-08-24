class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ArrayList<Integer> rowlist = new ArrayList<>(); 
            for(int j=1;j<=i;j++){
                if(j == 1  || j == i){
                    rowlist.add(1);
                }
                else{
                    rowlist.add(ans.get(i-2).get(j-2) + ans.get(i-2).get(j-1));
                }
            }
            ans.add(rowlist);
        }

        return ans;

       
    }
}