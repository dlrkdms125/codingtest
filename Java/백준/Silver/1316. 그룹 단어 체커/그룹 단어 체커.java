import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i<N; i++){
            if(checkGroupword(br.readLine())) count++;
        }
        bw.write(String.valueOf(count));
        bw.newLine();
        br.close();
        bw.close();
    }
    static boolean checkGroupword(String str){
        boolean[] check = new boolean[26];
        int prev =-1;
        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i);
            if(prev!=now){
                if(!check[now-'a']){
                    check[now-'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}