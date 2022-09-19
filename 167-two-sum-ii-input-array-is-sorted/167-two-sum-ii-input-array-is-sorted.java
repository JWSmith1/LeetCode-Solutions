class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] solution = new int[2];
        int left = 0;
        int right = numbers.length -1;
        
        while (left < right){
            int sum = numbers[left] + numbers[right];
            
            if (sum > target){
                right--;
            }
            else if (sum < target){
                left++;
            }
            else{
                solution[0] = left + 1;
                solution[1] = right + 1;
                
                return solution;
            }
        }
        
        return solution;
    }
}