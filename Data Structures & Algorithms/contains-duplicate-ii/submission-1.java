class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer,Integer> counts = new HashMap<>();
       for(int i =0;i<nums.length;i++){
        if(!counts.containsKey(nums[i])){
            counts.put(nums[i],i);

        }
        else{
            if(Math.abs(counts.get(nums[i])-i) <=k)
            return true;
            else{
                counts.put(nums[i],i);
            }
        }
       } 
       return false;
    }
}