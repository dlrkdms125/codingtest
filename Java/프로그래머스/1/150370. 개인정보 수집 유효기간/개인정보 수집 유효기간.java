import java.util.*;

class Solution {
	public int[] solution(String today, String[] terms, String[] privacies) {
		List<Integer> answer = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		
		int checkDate = getDate(today);
		// 약관 종류와 기간을 map에 저장해서 날짜 계산
		for(String s: terms) {
			String[] term = s.split(" ");
			map.put(term[0], Integer.parseInt(term[1]));
		}
		// 개인 정보 배열 privacies를 순회하며 
		for(int i=0; i<privacies.length; i++) {
			String[] privacy = privacies[i].split(" ");
			if(getDate(privacy[0])+(map.get(privacy[1])*28)<=checkDate) {
				answer.add(i+1);
			}
		}
		return answer.stream().mapToInt(integer -> integer).toArray();
		}
	private int getDate(String today) {
		String[] date = today.split("\\.");
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);
		return (year*12*28) + (month*28) + day;
	}
}