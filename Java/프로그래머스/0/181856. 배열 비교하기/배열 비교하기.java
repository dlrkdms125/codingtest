class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int sum1=0;
        int sum2=0;
        if(n1 != n2) {
            if(n1>n2){ return 1; }
            else { return -1; }
        } else {
            for(int i=0; i<n1; i++){
                sum1 += arr1[i];
            }
            for(int i=0; i<n2; i++){
                sum2 += arr2[i];
            }
            if(sum1 != sum2){
                if(sum1>sum2) return 1;
                else return -1;
            } else {
                return 0;
            }
        }
    }
}