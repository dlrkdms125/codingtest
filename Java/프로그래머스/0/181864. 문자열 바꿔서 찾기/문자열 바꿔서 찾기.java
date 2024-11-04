class Solution {
    public int solution(String myString, String pat) {
        String modifiedString = "";
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.substring(i, i + 1).equals("A")) {
                modifiedString += "B";
            } else {
                modifiedString += "A";
            }
        }
        
        if (modifiedString.contains(pat)) {
            return 1;
        }
        return 0;
    }
}