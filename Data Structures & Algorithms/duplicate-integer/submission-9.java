class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int num:nums){
            if(see.contains(num)){
                return true;
            }
            see.add(num);
        }
        return false;
    }
}