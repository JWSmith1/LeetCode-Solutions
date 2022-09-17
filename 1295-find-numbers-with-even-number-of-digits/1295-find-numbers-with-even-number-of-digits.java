class Solution {
    public int findNumbers(int[] nums) {
        int counter = 0;
        String strNum;
        
        for(int i = 0; i < nums.length; i++){
            strNum = Integer.toString(nums[i]);
            if (strNum.length() % 2 == 0){
                counter++;
            }
            

        }
        return counter;
    }
}