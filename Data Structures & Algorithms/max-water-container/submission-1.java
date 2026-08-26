class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int max=0;
        int max1;
        while(left<right){
            max1=(right-left)*Math.min(heights[left],heights[right]);
            if(max<max1) max=max1;
            if(heights[left] < heights[right])
            left++;
            else right--;
        }
        return max;
    }
}
