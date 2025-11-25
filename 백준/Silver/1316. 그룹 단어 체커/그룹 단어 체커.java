import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int groupcnt = 0;
        for(int i=0; i<n; i++){
            String input = br.readLine();
            // 그룹단어이면 true
            if(groupcheck(input)) groupcnt++;
        }
        
        bw.write(String.valueOf(groupcnt));
        bw.flush();
        bw.close();
        br.close();
    }
    private static boolean groupcheck(String input) {
        boolean[] vi = new boolean[26];
        char prev = 0;
        for(int i=0; i<input.length(); i++){
            char now = input.charAt(i);
            if(now!=prev) {
                if(vi[now-'a']) return false;
                vi[now-'a'] = true;
                prev = now;
            }
        }
        return true;
    }
}