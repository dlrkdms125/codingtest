import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine()); 
            arr[i] = n;
            sum += arr[i]; 
        }
        Arrays.sort(arr);

        int number1 = 0, number2= 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    number1 = i;
                    number2 = j;
                    break;
                }
            }
            if (number1 != 0 || number2 != 0) break; 
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != number1 && i != number2) { 
                bw.write(arr[i] + "\n");
            }
        }

        bw.flush(); 
        bw.close();
    }
}
