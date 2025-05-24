class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] sig = new int[signs.length];
        for(int i=0; i<signs.length; i++){
            if(signs[i]==true) sig[i] = 1;
            if(signs[i]==false) sig[i] = -1;
        }
        for(int i=0; i<absolutes.length; i++){
            answer += absolutes[i] * sig[i];
        }
        return answer;
    }
}