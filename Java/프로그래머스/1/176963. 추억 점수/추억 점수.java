import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> point = new HashMap<>();
        for(int i=0; i<name.length; i++){
            point.put(name[i], yearning[i]);
        }
        for(int i=0; i<photo.length; i++){
            String[] person = photo[i];
            int score = 0;
            
            for(int j=0; j<person.length; j++){
                if(point.containsKey(person[j])){
                    score+=point.get(person[j]);
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}