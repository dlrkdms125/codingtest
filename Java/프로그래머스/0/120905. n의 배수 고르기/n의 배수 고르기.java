import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        // numlist에서 n의 배수만 있게끔 하자
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i] % n ==0) list.add(numlist[i]);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}