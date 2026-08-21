class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);

        ArrayList<Integer> ans = new ArrayList<>();

        int num = nums[0];
        int count = 1;

        for(int i = 1; i < nums.length; i++) {

            if(num == nums[i]) {
                count++;
            }
            else {
                if(count > nums.length / 3) {
                    ans.add(num);
                }

                num = nums[i];
                count = 1;
            }
        }

        if(count > nums.length / 3) {
            ans.add(num);
        }

        return ans; 
    }
}