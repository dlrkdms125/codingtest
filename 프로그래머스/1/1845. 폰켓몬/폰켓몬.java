import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int maxTypes = set.size();
        int selectLimit = nums.length/2;
        
        return Math.min(maxTypes,selectLimit);
    }
}