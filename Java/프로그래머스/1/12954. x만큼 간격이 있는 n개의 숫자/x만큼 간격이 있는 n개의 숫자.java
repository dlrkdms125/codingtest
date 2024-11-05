class Solution {
    public long[] solution(int x, int n) {
        long[] list = new long[n];
        long value = x;
        for(int i=0; i<list.length; i++){
            list[i] = value+value*i;
        }
        return list;
    }
}