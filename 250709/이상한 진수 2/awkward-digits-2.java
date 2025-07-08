import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split("");
        int n = input.length;
        for(int i=0; i<n; i++){
            if(input[i].equals("1")) continue;
            else {
                input[i] = "1";
                break;
            }
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