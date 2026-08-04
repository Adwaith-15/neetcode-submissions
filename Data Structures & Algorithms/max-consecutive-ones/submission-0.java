class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> count= new ArrayList<>();
        int seq=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                seq++;
            }
            else {
                count.add(seq);
                seq=0;
            }
        }
        count.add(seq);

        return Collections.max(count);
    }
}