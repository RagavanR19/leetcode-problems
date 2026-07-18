class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,max=0;

        while(l<r){
            int d = r-l;
            max = Math.max(max,d*Math.min(height[l],height[r]));
            if(height[r]>height[l]){
                l++;
            }
            else {
                r--;
            }
        }
        return max;
    }
}