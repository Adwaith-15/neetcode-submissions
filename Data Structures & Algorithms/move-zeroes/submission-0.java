class Solution {
    public void moveZeroes(int[] nums) {
       int j=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            
            if(nums[i]==0){
                int k=i;
                while(k<j){
                    
                    nums[k]=nums[k+1];
                   
                   
                    
                     k++;
                }
                 if(k==j){ nums[j]=0;
                    j--;}
            } 
             
        }
        
    }
}