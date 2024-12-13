class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cards1Index = 0;
        int cards2Index = 0;
        
        int i=0;
        while(i<goal.length) {
            if(cards1Index<cards1.length && goal[i].equals(cards1[cards1Index])) cards1Index++;
            else if (cards2Index<cards2.length && goal[i].equals(cards2[cards2Index])) cards2Index++;
            else {
                answer = "No";
                break;
            }
            i++;
        } 
        return answer;
    }
}