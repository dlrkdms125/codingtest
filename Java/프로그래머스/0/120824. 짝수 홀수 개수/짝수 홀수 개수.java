class Solution {
    public int[] solution(int[] num_list) {
        int result1 = 0;
        int result2 = 0;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0) result1++;
            else result2++;
        }
        int[] answer = new int[2];
        answer[0] = result1;
        answer[1] = result2;
        return answer;
    }
}