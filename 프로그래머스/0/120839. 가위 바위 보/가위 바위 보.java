class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<rsp.length(); i++){
            char ch = rsp.charAt(i);
            if(ch=='2') answer.append('0');
            else if(ch=='0') answer.append('5');
            else answer.append('2');
        }
        return answer.toString();
    }
}