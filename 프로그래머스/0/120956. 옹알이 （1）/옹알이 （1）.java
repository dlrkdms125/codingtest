import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("aya",1);
        map.put("ye",1);
        map.put("woo",1);
        map.put("ma",1);
        for(String word: babbling){
            int idx = 0;
            boolean isvalid = true;
            while(idx<word.length()){
                boolean found = false;
                if(idx+3<=word.length()){
                    String sub = word.substring(idx, idx+3);
                    if(map.containsKey(sub)) {
                        idx += 3;
                        found = true;
                    }
                }
                if(!found && idx+2<=word.length()){
                    String sub = word.substring(idx, idx+2);
                    if(map.containsKey(sub)){
                        idx += 2;
                        found = true;
                    }
                }
                if(!found) {
                    isvalid = false;
                    break;
                }
            }
            if(isvalid) answer++;
        }
        return answer;
    }
}