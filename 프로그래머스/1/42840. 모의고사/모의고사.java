import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer1 = {1,2,3,4,5};
        int[] answer2 = {2,1,2,3,2,4,2,5};
        int[] answer3 = {3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == answer1[i%answer1.length]) score[0]++;
            if(answers[i] == answer2[i%answer2.length]) score[1]++;
            if(answers[i] == answer3[i%answer3.length]) score[2]++;
        }
        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (score[i] > max) max = score[i];
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<3; i++){
            if(score[i]==max) list.add(i+1);
        }
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}