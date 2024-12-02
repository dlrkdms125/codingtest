class Solution {
	public int solution(String s) {
		int answer = 0;
		int count = 1; // 현재 문자의 개수
		char firstChar = s.charAt(0); // 첫번째 x
		
		for(int i=1; i<s.length(); i++) {
			char currentChar = s.charAt(i);
			
			if(count==0) {
				firstChar = currentChar;
				count++;
				continue;
			}
			if(firstChar == currentChar) {
				count++;
			} else {
				count--;
			}
			if(count==0) {
				answer++;
			}
		}
		if(count != 0) {
			answer++;
		}
		return answer;
	}
}							