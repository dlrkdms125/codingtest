class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while(true){
        int WMIN = Math.min(wallet[0], wallet[1]);
        int WMAX = Math.max(wallet[0], wallet[1]);
        int BMIN = Math.min(bill[0], bill[1]);
        int BMAX = Math.max(bill[0], bill[1]);
        
        if(BMIN>WMIN || BMAX>WMAX){
            if(bill[0]>bill[1]){
                bill[0] = bill[0]/2;
            } else {
                bill[1] = bill[1]/2;
            }
            answer++;
        } else {
           break;
        }
      }
        return answer;
    }
}