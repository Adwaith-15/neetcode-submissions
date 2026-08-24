class Solution {
    public void rotate(int[] nums, int k) {
      for(int i=0;i<k;i++){
       int last=nums[nums.length-1];
      for(int j=1;i<nums.length;j++){
         nums[j]=nums[j-1];
      }
      nums[0]=last;
      } 
      return nums;
    }
}