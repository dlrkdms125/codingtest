class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] cipher1 = cipher.split("");
        for(int i=1; i<=cipher.length(); i++){
            if(i%code==0) {
                answer += cipher1[i-1];
            }
        }
        return answer;
    }
}