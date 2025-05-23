class Solution {
    public String solution(String phone_number) {
        String[] arr = phone_number.split("");
        int len = phone_number.length();
        for(int i=0; i<len-4; i++){
            arr[i] = "*";
        }
        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            sb.append(s);
        }
        String result = sb.toString();
        return result;
    }
}