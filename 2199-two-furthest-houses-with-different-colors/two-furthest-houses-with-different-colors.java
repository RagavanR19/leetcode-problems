class Solution {
    public int maxDistance(int[] colors) {
        int l = 0;
        int r = colors.length-1;
        int result=0,max = 0,max1=0,max2=0;
        for(int i = 0;i<colors.length;i++){
            if(l == r){
                break;
            }
            if(colors[l] != colors[r]){
                result = r-l;
                max1 = Math.max(max1,result);
            }
            r--;
        }

        l=0;
        r=colors.length - 1;
        result = 0;
        for(int i = 0;i<colors.length;i++){
            if(l == r){
                break;
            }
            if(colors[l] != colors[r]){
                result = r-l;
                max2 = Math.max(max2,result);
            }
            l++;
        }
        return Math.max(max1,max2);
    }
}