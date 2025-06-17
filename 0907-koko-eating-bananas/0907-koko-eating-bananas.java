class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max =0;
        for(int i: piles){
            max = Math.max(max, i);
        }
        int min = max;
        int low =1;
        int high = max;
        while(low<=high){
            int mid = (low+high)/2;
            if(eat(piles, mid, h)){
                high = mid-1;
            }else{
                low= mid+1;
            }
        }
        return low;
    }

    public boolean eat(int[] piles,int speed, int h){
       int m=0;
        for(int jk: piles){
            m+=Math.ceil(((double)jk/(double)speed));
        }
        return m<=h;
    }
}