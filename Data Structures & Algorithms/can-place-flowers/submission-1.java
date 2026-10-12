class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
            for(int i=0;i<flowerbed.length;i++){
              if(i==0){
                if(flowerbed[i]==0 && flowerbed[1]==0){
                    n--;
                 }
                }
            else if(i==flowerbed.length-1){
                    if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
                        n--;
                    }
                }
            else(flowerbed[i]==0 && flowerbed[i+1] == 0 && flowerbed[i-1]==0) n--;

                if(n==0) return true;
               
               
            }
            return false;


        }

}