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
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==1){
                arr[b-1]=c;
            } else if(a==2){
                for(int j=b-1; j<=c-1; j++){
                    if(arr[j]==0) arr[j]=1;
                    else arr[j]=0;
                }
            } else if(a==3){
                for(int j=b-1; j<=c-1; j++){
                    arr[j]=0;
                }
            } else if(a==4){
                for(int j=b-1; j<=c-1; j++){
                    arr[j]=1;
                }
            }
        }

        for(int i=0; i<n; i++){
            bw.write(arr[i]+" ");
        }
    
        bw.flush();   
    }
}