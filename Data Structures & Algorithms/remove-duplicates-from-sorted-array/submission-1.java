class Solution {
    public int removeDuplicates(int[] nums) {
    int l=0;
    int r=1;
    for(int i=1;i<nums.length;i++){
        if(nums[r]==nums[l]){
            r++;
        }
        else{
            nums[l+1]=nums[r];
            l++;
            r++;
        }
    }
    return l+1;

    }
}