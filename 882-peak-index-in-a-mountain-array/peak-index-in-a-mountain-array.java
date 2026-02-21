class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int mid = 0;
        for(int i = 1;i<n-1;i++){
            mid = i;
            if(arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1]){
                return mid;
            }
        }
        return arr[0]>arr[n-1]?0:1;
    }
}