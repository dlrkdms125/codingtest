import java.util.*;
class Solution{
    public int solution(int []A, int []B){
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B); 
        // 배열 뒤집기
        for (int i = 0; i < B.length / 2; i++) {
            int temp = B[i];
            B[i] = B[B.length - 1 - i];
            B[B.length - 1 - i] = temp;
        }
        for(int i=0; i<A.length; i++){
            answer += A[i] * B[i];
        }
        return answer;
    }
}