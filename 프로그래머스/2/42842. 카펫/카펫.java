class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        for(int height=1; height<=Math.sqrt(yellow); height++){
            if(yellow%height==0){
                int width = yellow/height;
                int totalWidth = width+2;
                int totalHeight = height+2;
                int totalArea = totalWidth*totalHeight;
                
                if(totalArea==brown+yellow){
                    return new int[]{totalWidth, totalHeight};
                }
            }
        }
        return new int[0];
    }
}