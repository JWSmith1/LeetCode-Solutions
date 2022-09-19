class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // set up 2 pointers and solution array
        int[] solution = new int[2];
        int left = 0;
        int right = numbers.length -1;
        
        // loop through looking for target sum
        while (left < right){
            // get current sum to compare to target
            int sum = numbers[left] + numbers[right];
            
            // if sum > target, reduce right pointer since the array is sorted
            if (sum > target){
                right--;
            }
            else if (sum < target){ // reduce left pointer if sum is less
                left++;
            }
            // add 1 to each pointer value to problem description of returning index + 1
            else{
                solution[0] = left + 1;
                solution[1] = right + 1;
                
                return solution;
            }
        }
        
        return solution;
    }
}