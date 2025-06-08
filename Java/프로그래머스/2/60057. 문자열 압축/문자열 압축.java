class Solution {
    public int solution(String s) {
        if(s.length() == 1) return 1;  // ✅ 예외 처리
        
        int answer = s.length();  // ✅ 올바른 초기값
        
        for(int i=1; i <= s.length()/2; i++){  // ✅ 올바른 반복문 조건
            StringBuilder compressed = new StringBuilder();
            String prev = s.substring(0,i);
            int count = 1;
            
            for(int j=i; j < s.length(); j +=i){  // ✅ .length() 수정
                int endIdx = Math.min(j+i, s.length());
                String current = s.substring(j, endIdx);
                
                if(prev.equals(current)){
                    count++;
                } else {
                    compressed.append(count > 1 ? count : "").append(prev);
                    prev = current;
                    count = 1;
                }
            }
            compressed.append(count > 1 ? count : "").append(prev);
            answer = Math.min(answer, compressed.length());  // ✅ 최소값 갱신
        }
        return answer;
    }
}
