import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int count = 0;
        int[] arr = new int[9];
        int max = Integer.MIN_VALUE;
       
        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]>max) {
                max = arr[i];
                count = i;
        }
        }
        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(count+1));

        bw.flush();
        bw.close();
    
    }
}