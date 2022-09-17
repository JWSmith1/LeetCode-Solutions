class Solution {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        int total = 0;
        for (int i = 0; i < nums.length; i++){
            total += nums[i];
            sums[i] = total;
        
        }
        
        return sums;
    }
}