import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arra = new int[n];
        int[] arrb = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arra[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            arrb[i] = Integer.parseInt(st.nextToken());
        }
        int[] merged = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;      
        while(i < n && j<m) {
            if(arra[i]<arrb[j]) {
                merged[k] = arra[i];
                i++;
            } else {
                merged[k] = arrb[j];
                j++;
            }
            k++;
        }
        while(i<n) merged[k++] = arra[i++];
        while(j<m) merged[k++] = arrb[j++];

        for(int t=0; t<n+m; t++){
            bw.write(merged[t]+" ");
        }

        bw.close();
        br.close();
    }
}