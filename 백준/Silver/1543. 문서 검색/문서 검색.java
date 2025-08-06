import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        String find = br.readLine();
        int cnt = 0;
        int index = 0;
        
        while(index<=word.length()-find.length()) {
            boolean match = true;
            for(int j=0; j<find.length(); j++){
                if(word.charAt(index+j)!=find.charAt(j)){
                    match = false;
                    break;
                }
            }
            if(match) {
                cnt++;
                index += find.length();
            } else {
                index++;
            }
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}