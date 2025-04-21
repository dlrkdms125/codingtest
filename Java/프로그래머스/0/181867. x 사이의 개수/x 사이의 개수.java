class Solution {
    public int[] solution(String myString) {
        String[] my = myString.split("x",-1);
        int[] answer = new int[my.length];
        for(int i=0; i<answer.length; i++){
            answer[i] = my[i].length();
        }
        return answer;
    }
}