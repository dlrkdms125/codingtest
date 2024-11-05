import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        String arr = Integer.toString(n);
        for(int i=0; i<arr.length(); i++){
            sum += Integer.parseInt(arr.substring(i,i+1));
        }
        return sum;
    }
}