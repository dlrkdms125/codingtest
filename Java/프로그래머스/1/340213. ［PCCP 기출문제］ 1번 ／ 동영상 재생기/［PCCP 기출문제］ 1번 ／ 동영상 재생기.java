class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        for(int i=0; i<commands.length; i++){
            if(commands[i]=="prev"){
                pos = pos-10;
                if(pos<10){
                    pos = 0;
                }
            } else {
                pos = video_len;
                if(video_len.length()-pos.length()<10){
                    pos=video_len;
                }
            }
        }
        return answer;
    }
}