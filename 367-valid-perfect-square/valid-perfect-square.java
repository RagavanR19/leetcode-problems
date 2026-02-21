class Solution {
    public boolean isPerfectSquare(int num) {
        double x = num,prev = 0;

        while(Math.abs(x-prev)>1e-10){
            prev = x;
            x = 0.5*(x+num/x);
        }
        if(x%1==0){
            return true;
        }
        return false;
    }
}