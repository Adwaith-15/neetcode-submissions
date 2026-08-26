class Solution {
    public int maxArea(int[] heights) {
        int left=0, right=heights.length-1,max=0,max1;
        
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
