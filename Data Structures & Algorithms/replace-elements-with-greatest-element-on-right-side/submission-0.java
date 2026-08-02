class Solution {
    public int[] replaceElements(int[] arr) {
       int n = arr.length;
        int[] ans= new int[arr.length];
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                ans[n-1]=-1;

            }
            else{
                int max=arr[i+1];
                for(int j=i+2;j<n;j++){
                    if(max<arr[j]){
                        max=arr[j];
                    }
                }
                ans[i]=max;
                
            }
        }
        return ans;
       } 
    }

