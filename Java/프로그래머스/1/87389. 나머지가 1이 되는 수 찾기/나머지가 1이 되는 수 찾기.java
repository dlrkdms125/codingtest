import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int x = 1; x < n; x++) {
            if (n % x == 1) {
                arr.add(x);
            }
        }
        Collections.sort(arr);
        return arr.get(0);
    }
}