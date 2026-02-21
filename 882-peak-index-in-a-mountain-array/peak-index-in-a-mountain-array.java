class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int mid = 0,l = 0 ,r = n-1;
        while(l<r){
           // mid = i;
           mid = l+(r-l)/2;
            if(arr[mid]<arr[mid+1]){
                l = mid+1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }
}