class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low =0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(mid!=0 && mid+1 < nums.length && nums[mid]!=nums[mid-1] && nums[mid+1]!=nums[mid])      {
                return nums[mid];
            }
            if(mid%2==1 && mid!=0 && nums[mid]!=nums[mid-1]){
                high = mid-1;
            }else if(mid%2==0 && mid!=0 && nums[mid]==nums[mid-1]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return nums[high];
    }
}