import java.util.*;
class Solution {
    public String[] solution(String myString) {
        // 이렇게 하면 빈 문자열도 포함됨. x가 연속일때
        String[] answer = myString.split("x"); 
        List<String> list = new ArrayList<>();
        for(String s: answer){
            if(!s.equals("")) list.add(s);
        }
        Collections.sort(list);
        
        return list.toArray(new String[0]);
    }
}