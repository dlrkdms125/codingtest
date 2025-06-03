import java.util.*;
class Solution {
    public long solution(long n) {
        String word = String.valueOf(n);
        Integer[] arr = new Integer[word.length()];
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            int number = ch - '0';
            arr[i] = number;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }
        return Long.parseLong(sb.toString());
    }
}