class Solution {
    public int solution(String t, String p) {
        int count = 0;
        for(int i=0; i<=t.length()-p.length(); i++){
            
                int number = Integer.parseInt(t.substring(i,i+p.length()));
                int pn = Integer.parseInt(p);
                if(number<=pn) count++;
            
        }
        return count;
    }
}