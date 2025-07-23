import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] input = new String[n];
        for(int i=0; i<n; i++){
            input[i] = br.readLine();
        }
        Arrays.sort(input);
        for(int i=0; i<n; i++){
            bw.write(input[i]);
            bw.newLine();
        }
        bw.flush();
    }
}