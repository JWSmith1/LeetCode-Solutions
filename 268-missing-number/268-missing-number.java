class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length;
        while (left < right){
            int middle = (left + right) / 2;
            if (nums[middle] > middle){
                right = middle;
            }
            else{
                left = middle + 1;
            }
        }
        return right;
    }
}