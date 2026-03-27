class Solution {
    public int addDigits(int num) {
        String n = String.valueOf(num);
        int i=0;
        int res = 0;
        while(n.length()>1&&i<n.length()){
            
            res = res+n.charAt(i)-'0';
            i++;
            if(i==n.length()){
                n = String.valueOf(res);
                i=0;
                res = 0;
            }
        }
        return Integer.valueOf(n);   
    }
}