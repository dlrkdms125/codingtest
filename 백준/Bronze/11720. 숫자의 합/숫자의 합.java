import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}