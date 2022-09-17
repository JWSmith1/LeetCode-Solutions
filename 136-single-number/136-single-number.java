class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        for (int n : nums){
            // Binary XOR copies the bit if it is set in one but not both, hence just one number in the array
            x = x ^ n;
        }
        
        return x;
    }
}