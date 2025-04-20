class Solution {
    public int[] solution(int[] arr, int n) {
        int k = arr.length;
        if(k%2==1){
            for(int i=0; i<k; i=i+2){
                arr[i] += n;
            }
        } else {
            for(int i=1; i<k; i=i+2){
                arr[i] += n;
            }
        }
        return arr;
    }
}