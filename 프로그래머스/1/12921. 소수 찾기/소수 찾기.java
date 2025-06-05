import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] prime = new int[n+1];
        for(int i=1; i<=n; i++){
            prime[i] = i;
        }
        for(int i=2; i<=n; i++){
            if(prime[i]==0) continue;
            for(int j=2*i; j<=n; j+=i){
                prime[j]=0;
            }
        }
        for(int i=2; i<=n; i++){
            if(prime[i] != 0) answer++;
        }
        return answer;
    }
}