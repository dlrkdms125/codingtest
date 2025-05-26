class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int len = p.length();
        long pn = Long.parseLong(p);
        for(int i=0; i<=t.length()-p.length(); i++){
            long number = Long.parseLong(t.substring(i, i+len));
            if(number<=pn) count++;
        }
        return count;
    }
}