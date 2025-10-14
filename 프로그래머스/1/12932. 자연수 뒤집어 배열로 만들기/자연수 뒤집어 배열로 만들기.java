class Solution {
    public int[] solution(long n) {
        String[] var = Long.toString(n).split("");
        int[] answer = new int[var.length];
        for(int i=0; i<answer.length; i++){
            answer[answer.length-i-1] = Integer.parseInt(var[i]);
        }
        return answer;
    }
}