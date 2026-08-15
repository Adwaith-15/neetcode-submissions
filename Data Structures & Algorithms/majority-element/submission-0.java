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

     }
     int ans;
     for(int key:count.keySet()){
        if(count.get(key) > n/2){
            return key;
        }
     }
     return 0;
    
    }
}