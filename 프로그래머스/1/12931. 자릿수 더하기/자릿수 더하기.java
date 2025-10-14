import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] var = Integer.toString(n).split("");
        for(int i=0; i<var.length; i++){
            int number = Integer.parseInt(var[i]);
            answer += number;
        }
        return answer;
    }
}