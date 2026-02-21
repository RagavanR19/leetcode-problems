class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int mid = 1;
        for(int i = 1;i<n-1;i++){
            mid = i;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
        }
        return nums[0]>nums[n-1]?0:n-1;
    }
}