class Solution {
    public String solution(String s) {
        String[] input = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<input.length; i++){
            if(max<Integer.parseInt(input[i])) max = Integer.parseInt(input[i]);
            if(min>Integer.parseInt(input[i])) min = Integer.parseInt(input[i]);
        }
        return min+" "+max;
    }
}