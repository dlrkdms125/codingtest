class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        int sum = 1;
        int answer = 0;

        if(num_list.length>10) {
            for (int i = 0; i < num_list.length; i++) {
                count += num_list[i];
                answer = count;
            }
        } else {
            for (int i = 0; i < num_list.length; i++) {
                 sum *= num_list[i];
                 answer = sum;
            }
        }
        return answer;
    }
}