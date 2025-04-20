import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n-5];
        Arrays.sort(num_list);
        for(int i=5; i<n; i++){
            answer[i-5] = num_list[i];
        }
        return answer;
    }
}