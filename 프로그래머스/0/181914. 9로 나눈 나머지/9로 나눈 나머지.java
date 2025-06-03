class Solution {
    public int solution(String number) {
        String str = number.toString();
        int sum = 0;
        int number1 = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            number1 = Integer.parseInt(String.valueOf(ch));
            sum += number1;
        }
        
        int answer = sum%9;
        return answer;
    }
}