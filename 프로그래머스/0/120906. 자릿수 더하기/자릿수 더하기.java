class Solution {
    public int solution(int n) {
        // 문자열로 바꾼후 계산해보고, while문으로 10으로 나누면서 계산해보기
        String str = String.valueOf(n);
        int answer = 0;
        for(int i=0; i<str.length(); i++){
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        
        return answer;
    }
}