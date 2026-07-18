class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,max=0;

        while(l<r){
            int d = r-l;
            int dist = d*Math.min(height[l],height[r]);
            max = Math.max(max,dist);
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