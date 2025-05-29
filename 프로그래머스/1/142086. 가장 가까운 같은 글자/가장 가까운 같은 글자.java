import java.util.*;
class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                answer[i] = i - map.get(ch);
            } else {
                answer[i] = -1;
            }
            map.put(ch, i);
        }
    
        return answer;
    }
}