class Solution {
    public boolean isPalindrome(int x) {
        int reverseNum = 0;
        int remainder;
        int originalNum = x;
        
        while (x > 0){
            remainder = x % 10;
            reverseNum = (reverseNum * 10) + remainder;
            x = x / 10;
        }
        
        if (reverseNum == originalNum){
            return true;
        }
        else{
            return false;
        }
    }
}