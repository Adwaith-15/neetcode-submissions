class Solution {
    public int maxProfit(int[] prices) {
      int left=0;
      int right=left+1;
      int max=0,profit;
      while( right!=prices.length){
        if(prices[left] < prices[right]){
        profit=prices[right]-prices[left];
        max=Math.max(max,profit);}
         else{
        left=right;
        
      }
      right++;
      } 
      return  max;
     
    }
    
}
