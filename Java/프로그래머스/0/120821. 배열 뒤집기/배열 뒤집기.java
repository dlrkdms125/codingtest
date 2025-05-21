class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = num_list[n-i-1];
        }
      
        return arr;
    
    }
}