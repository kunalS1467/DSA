class Solution {
    public int partitionArray(int[] nums, int k) {
        if(nums.length<=1)return nums.length;
        Arrays.sort(nums);
        int min = nums[0];
        int max = min;
        int count =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-min>k){
                count+=1;
                min = nums[i];
            }
            max = nums[i];
        }
        return count;
    }
}