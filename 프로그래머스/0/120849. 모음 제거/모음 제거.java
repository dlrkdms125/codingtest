class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String[] arr = {"a","e","i","o","u"};
        for(int i=0; i<my_string.length(); i++){
            String ch = String.valueOf(my_string.charAt(i));
            boolean isVowel = false;
            for(int j=0; j<arr.length; j++){
                if(ch.equals(arr[j])) {
                    isVowel = true;
                    break;
                }
            }
            if(!isVowel) answer.append(ch);
        }
        return answer.toString();
    }
}