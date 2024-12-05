class Solution {
    public int solution(String t, String p) {
        int length = p.length();
        long number = Long.parseLong(p);
        int result = 0;
        
        for(int i=0; i<t.length()-length+1; i++){
            long newNumber = Long.parseLong(t.substring(i, i+length));
            if(newNumber<=number){
                result++;
            }
        
        }
        return result;
    }
}