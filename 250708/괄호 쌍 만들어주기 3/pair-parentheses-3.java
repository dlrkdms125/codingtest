import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int n = input.length();
        int count = 0;
        for(int i=0; i<n; i++){
            if(input.charAt(i)=='('){
                for(int j=i+1; j<n; j++){
                    if(input.charAt(j)==')') count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();

    }
}