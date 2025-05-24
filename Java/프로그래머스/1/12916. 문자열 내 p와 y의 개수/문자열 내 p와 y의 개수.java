class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int plen = 0;
        int ylen = 0;
        for(int i=0; i<s.length(); i++){
            if(String.valueOf(s.charAt(i)).equals("p")) plen++;
            if(String.valueOf(s.charAt(i)).equals("y")) ylen++;
        }
        if(plen==ylen) return true;
        else return false;
    }
}