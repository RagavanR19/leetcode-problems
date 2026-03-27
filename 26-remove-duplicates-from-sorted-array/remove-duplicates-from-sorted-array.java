class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length,l=0,r=1;
        int count = 1;
        while(r<n){
            if(nums[l]<nums[r]){
                nums[l+1] = nums[r];
                l++;
                count++;
            }
            else if(nums[l]==nums[r]){
                r++;
            }
        }
        return count;
    }
}