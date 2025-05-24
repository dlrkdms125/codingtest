class Solution {
    public int[] solution(int start_num, int end_num) {
        int n = start_num-end_num;
        int[] answer = new int[n+1];
        int num = 0;
        for(int i=start_num; i>=end_num; i--){
            answer[num] = i;
                num++;
        }
        return answer;
    }
}