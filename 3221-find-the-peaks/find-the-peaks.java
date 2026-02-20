class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        int n = mountain.length;
        int mid = 1;
        List<Integer> res = new ArrayList<>();
        for(int i = 1;i < n-1;i++){
            mid = i;
            if(mountain[mid-1]<mountain[mid] && mountain[mid+1]<mountain[mid]){
                res.add(mid);
            }
        }
        return res;
    }
}