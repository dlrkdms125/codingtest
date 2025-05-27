class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                char shifted = (char) ((ch - 'A' + n) % 26 + 'A');
                sb.append(shifted);
            } else if(Character.isLowerCase(ch)) {
                char shifted = (char) ((ch - 'a' + n) % 26 + 'a');
                sb.append(shifted);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}