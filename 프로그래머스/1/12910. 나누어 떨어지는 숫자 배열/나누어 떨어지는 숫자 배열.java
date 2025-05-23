import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> array = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor ==0) array.add(arr[i]);
        }
        if(array.size()==0) {array.add(-1);}
        int[] answer = new int[array.size()];
        for(int i=0; i<array.size(); i++){
            answer[i]=array.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}