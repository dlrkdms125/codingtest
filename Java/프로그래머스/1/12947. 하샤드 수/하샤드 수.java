class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String word = String.valueOf(x);
        int sum = 0;
       for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            int n = Integer.parseInt(String.valueOf(ch));
            sum += n;     
        }
        if(x%sum!=0) answer = false; 
        return answer;
    }
}