import java.util.*;

class Solution {
    public int[] solution(String[] idList, String[] report, int k){
        
        int[] answer = new int[idList.length];
        HashMap<String, HashSet<String>> reporterMap = new HashMap<>();
        HashMap<String, Integer> reportedCountMap = new HashMap<>();
        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        for(String reportInfo : reportSet){
            String reporter = reportInfo.split(" ")[0]; 
            String reported = reportInfo.split(" ")[1];  
            reporterMap.putIfAbsent(reporter, new HashSet<String>(){{
                add(reported);
            }});
            reporterMap.get(reporter).add(reported);
            reportedCountMap.put(reported, reportedCountMap.getOrDefault(reported, 0)+1);
        }

        for (String reported : reportedCountMap.keySet()){
            int reportedCount = reportedCountMap.get(reported);
            if(reportedCount >= k){
               
                for(int i=0; i<idList.length; i++){
                    if(reporterMap.containsKey(idList[i]) && reporterMap.get(idList[i]).contains(reported)) {
                        answer[i]++;
                    }
                }
            }
        }
        return answer;
   }
}
