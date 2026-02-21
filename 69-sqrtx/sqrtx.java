class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return x;
        }
        double num = x,prev = 0;

        while(Math.abs(num - prev)>1e-10){
            prev = num;
            num = 0.5*(num+x/num);
        }
        return (int)num;
    }
}