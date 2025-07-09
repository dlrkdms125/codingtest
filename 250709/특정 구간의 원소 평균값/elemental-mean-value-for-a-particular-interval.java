import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
                int len = j-i+1;
                if(sum%len==0) {
                    int mean = sum/len;
                    for(int k=i; k<=j; k++){
                        if(arr[k]==mean){
                            count++;
                            break;
                        }
                    }
                }
            }
        }
    
        bw.write(String.valueOf(count));
        bw.flush();

    }
}