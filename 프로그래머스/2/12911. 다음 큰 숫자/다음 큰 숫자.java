import java.util.*;
class Solution {
    public int solution(int n) {
        int count = Integer.bitCount(n);
        int answer = n+1;
        while(true){
            if(Integer.bitCount(answer)==count) break;
            answer++;
        }
        return answer;
    }
}