class Solution {
    public int solution(int n) {
        String answer = "";
        String number = Integer.toString(n,3);
        for(int i=number.length()-1; i>=0; i--){
            answer += number.charAt(i);
        }
        return Integer.parseInt(answer, 3);
    }
}