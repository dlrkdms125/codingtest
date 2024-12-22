class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countp = 0;
        int county = 0;
        String str = s.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'P') countp++;
            else if (str.charAt(i) == 'Y') county++;
        }
        if (countp == county) answer = true;
        else answer = false;

        return answer;
    }
}