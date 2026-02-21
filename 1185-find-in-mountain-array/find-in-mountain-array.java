/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int res = -1,mid1 = 0,mid2 = 0;
        int l = 0,r = mountainArr.length()-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                l = mid+1;
            }
            else{
                r = mid;
            }
        }
        int peak = l;
        int l1 = 0,r1 = peak;
        while(l1<r1){
            mid1 = l1+(r1-l1)/2;
            if(mountainArr.get(mid1)==target){
                return mid1;
            }
            if(mountainArr.get(mid1)<target){
                l1 = mid1+1;
            }
            else{
                r1 = mid1;
            }
        }
        int l2 = peak,r2 = mountainArr.length()-1;
        while(l2<r2){
            mid2 = l2+(r2-l2)/2;
            if(mountainArr.get(mid2)==target){
                return mid2;
            }
            if(mountainArr.get(mid2)>target){
                l2 = mid2+1;
            }
            else{
                r2 = mid2;
            }
        }
        if(mountainArr.get(l1) == target && mountainArr.get(l2) == target){
            return Math.min(l1,l2);
        }
        else if(mountainArr.get(l1) == target){
         return l1;
        }
        else if(mountainArr.get(l2) == target){
         return l2;
        }
        return res;
    }
}