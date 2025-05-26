class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))) continue;
            else return false;
        }
        return true;
    }
}