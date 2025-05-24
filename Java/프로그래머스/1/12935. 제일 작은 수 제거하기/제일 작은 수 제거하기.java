import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]) min = arr[i];
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==min) continue;
            else list.add(arr[i]);
        }
        if(list.size()==0) list.add(-1);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}