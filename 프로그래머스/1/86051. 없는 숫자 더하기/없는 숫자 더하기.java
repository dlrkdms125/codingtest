class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        int sum1 = 0;
        for(int i=0; i<10; i++){
            sum += i;
        }
        for(int i=0; i<numbers.length; i++){
            sum1 += numbers[i];
        }
        return sum-sum1;
    }
}