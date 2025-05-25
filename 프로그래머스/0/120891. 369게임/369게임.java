class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)-'0'==3) answer++;
            else if(str.charAt(i)-'0'==6) answer++;
            else if(str.charAt(i)-'0'==9) answer++;
        
        }
        return answer;
    }
}