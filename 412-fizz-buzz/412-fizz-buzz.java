class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> solution = new ArrayList<>(n);
        
        for (int i = 1; i <= n; i++){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            
            String answer = "";
            
            if (divisibleBy3 && divisibleBy5){
                solution.add("FizzBuzz");
            }
            else if (divisibleBy3){
                solution.add("Fizz");
            }
            else if (divisibleBy5){
                solution.add("Buzz");
            }
            else{
                solution.add(String.valueOf(i));
            }
        }
        
        return solution;
    }
}