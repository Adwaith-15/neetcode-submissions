class Solution {
    public void sortColors(int[] nums) {
        mergesort(nums);
        
    }
     private static void mergesort(int[] array){
        if(array.length<=1) return;
        int leftsize=array.length/2;
        int rightsize=array.length-leftsize;
        int [] leftarray = new int[leftsize];
        int [] rightarray= new int[rightsize];
        int j=0;
        for(int i=0;i<array.length;i++){
            if(i<leftsize){
                leftarray[i]=array[i];
        }
            else{
                rightarray[j]=array[i];
                j++;
        }
        }
        mergesort(leftarray);
        mergesort(rightarray);
        merge(leftarray,rightarray,array);
    }
      private static void merge(int[] leftarray,int[]rightarray,int[]array){
     int i=0,l=0,r=0;
     int leftsize=leftarray.length;
     int rightsize=rightarray.length;
     while(l<leftsize && r<rightsize){
        if(leftarray[l] <= rightarray[r]){
            array[i]=leftarray[l];
            i++;
            l++;
        }
        else{
            array[i]=rightarray[r];
            i++;
            r++;
        }
     }
     while(l<leftsize){
        array[i]=leftarray[l];
        i++;
        l++;
     }
     while(r<rightsize){
        array[i]=rightarray[r];
        i++;
        r++;
     }
    }
}