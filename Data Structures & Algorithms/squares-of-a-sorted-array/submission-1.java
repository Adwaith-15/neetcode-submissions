class Solution {
    public int[] sortedSquares(int[] nums) {
       int left=0;
       int right=nums.length-1;
      int [] result = new int[nums.length];
      int pos=nums.length-1;
      while(left<=right){
        if(nums[left]*nums[left]>= nums[right]*nums[right]){
            result[pos]=nums[left]*nums[left];
            left++;pos--;
        }
        else{
            result[pos]=nums[right]*nums[right];
            right--;
            pos--;
        }
      }
      return result;
    }
}