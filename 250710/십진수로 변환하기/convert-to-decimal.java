import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String input = String.valueOf(n);
        int[] arr = new int[n];
        for(int i=0; i<input.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        int num = 0;
        for(int i=0; i<input.length(); i++){
            num  = num * 2+ arr[i];
        }
        bw.write(String.valueOf(num));
        bw.flush();

    }
}