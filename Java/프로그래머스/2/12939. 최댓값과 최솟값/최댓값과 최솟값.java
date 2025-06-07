class Solution {
    public String solution(String s) {
        int max = Integer.MIN_VALUE; 
        int min = Integer.MAX_VALUE;
        String[] arr = s.split(" ");
        for(int i=0; i<arr.length; i++){
            int num = Integer.parseInt(arr[i]);
            if(max<num) max = num;
            if(min>num) min = num;
        }
        return min+" "+max;
    }
}