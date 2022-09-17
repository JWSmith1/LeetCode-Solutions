class Solution {
    public int removeElement(int[] nums, int val) {
        int pointer = 0;
        
        // if nums at a given index does not equal a given value, bring those elements to the front and then return pointer
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[pointer++] = nums[i];
            }
        }
        
        return pointer;
    }
}