import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int min = 100000001;
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]<min) min = arr[i];
        }
        if(n==2){
            for(int j=1; j<=min; j++){
                if(arr[0]%j==0 && arr[1]%j==0) {
                    bw.write(String.valueOf(j));
                    bw.newLine();
                }    
            }
        } else {
            for(int j=1; j<=min; j++){
                if(arr[0]%j==0 && arr[1]%j==0 && arr[2]%j==0) {
                    bw.write(String.valueOf(j));
                    bw.newLine();
                }
            }
        }

        bw.flush();
    }
}