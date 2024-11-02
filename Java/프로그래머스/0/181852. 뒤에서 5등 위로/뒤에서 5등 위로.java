import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        
        int[] num = new int[num_list.length-5];
        for(int i=5; i<num_list.length; i++){
            num[i-5] = num_list[i];
        }
        return num;
    }
}