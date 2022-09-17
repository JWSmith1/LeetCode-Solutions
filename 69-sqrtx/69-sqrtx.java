class Solution {
    public int mySqrt(int x) {
        long j = 0;
        long b = x / 2 + 1;
        while (j <= b){
            long middle = (j + b) / 2;
            if (middle * middle == x){
                return (int)middle;
            }
            if (middle * middle < x){
                j = middle + 1;
            }
            else{
                b = middle - 1;
            }
        }
        return (int)b;
    }
}