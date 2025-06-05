// 해시맵이나 배열로 풀 수 있을 거 같음
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] alph = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0; i<alph.length; i++){
            s = s.replace(alph[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}