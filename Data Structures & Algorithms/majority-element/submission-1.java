class Solution {
    public int majorityElement(int[] nums) {
     int n= nums.length;
     HashMap<Integer,Integer> count= new HashMap<>();
     for(int i=0;i<n;i++){
        if(!count.containsKey(nums[i])){
            count.put(nums[i],1);
        }
        else{
            count.put(nums[i],count.get(nums[i])+1);
        }
        if(count.get(nums[i]) > n/2){
            return nums[i];
        }

     }
     
     return -1;
    
    }
}