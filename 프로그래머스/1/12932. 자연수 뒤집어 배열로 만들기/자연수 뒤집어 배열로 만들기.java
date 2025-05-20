import java.io.*;
import java.util.*;
class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int k = str.length();
        int[] answer = new int[k];
        for(int i=k; i>0; i--){
            answer[k-i] = Integer.parseInt(str.substring(i-1, i));
        }
        return answer;
    }
}