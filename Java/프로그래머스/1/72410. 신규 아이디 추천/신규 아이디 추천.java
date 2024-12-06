class Solution {
    public String solution(String new_id) {
        // 1
        String answer = new_id.toLowerCase();
        // 2
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        // 3
        while(answer.contains("..")){
            answer = answer.replace("..",".");
        }
        // 4
        if(answer.charAt(0)=='.'){
            answer = answer.substring(1);
        }
        if(answer.length() >0 && answer.charAt(answer.length()-1)=='.'){
            answer = answer.substring(0, answer.length()-1);
        }
        // 5
        if(answer.length()==0) answer="a";
        // 6
        if(answer.length()>15){
            answer = answer.substring(0,15);
            if(answer.charAt(answer.length()-1)=='.'){
                answer = answer.substring(0, answer.length()-1);
            }
        }
        // 7
        if(answer.length()==1){
            answer += String.valueOf(answer.charAt(0))+ String.valueOf(answer.charAt(0));
        } else if (answer.length()==2){
            answer += String.valueOf(answer.charAt(1));
        }
        return answer;
    }
}