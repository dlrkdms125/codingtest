import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split("");
        int n = input.length;
        boolean changed = false; // 바꿨는지 체크

        for(int i=0; i<n; i++){
            if(input[i].equals("1")) continue;
            else {
                input[i] = "1";
                changed = true;
                break;
            }
        }
        // 만약 한 번도 바꾸지 않았다면, 마지막 1을 0으로 바꾼다
        if(!changed) {
            input[n-1] = "0";
        }

        StringBuilder sb = new StringBuilder();
        for(String s: input){
            sb.append(s);
        }
        int result = Integer.parseInt(sb.toString(),2);
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
