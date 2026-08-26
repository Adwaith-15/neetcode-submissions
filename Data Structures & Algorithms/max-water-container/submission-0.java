class Solution {
    public int maxArea(int[] heights) {
       int area=0;;
        int area1;
       for(int i=0;i<heights.length;i++){
        for(int j=0;j<heights.length && i!=j;j++){
            area1=Math.abs(i-j)*Math.min(heights[i],heights[j]);
            if(area<area1) area=area1;
        }
       }
       return area;
    }
}
