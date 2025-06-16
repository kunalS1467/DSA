class Solution {
    public int findMin(int[] arr) {
        int k=arr.length;
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=(high+low)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return arr[high];
    }
}