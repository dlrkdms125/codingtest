import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int cnt = 0;
        for(int t=0; t<n; t++){
            int target = arr[t];
            int i = 0;
            int j = n-1;
            while(i<j){
                int sum = arr[i]+arr[j];
                if(sum==target){
                    if(i!=t && j!=t) {
                        cnt++;
                        break;
                    } else if (i==t) {
                        i++;
                    } else {
                        j--;
                    }
                }
                else if(sum<target) i++;
                else j--;
            }
            
        }
        
        bw.write(String.valueOf(cnt));
        bw.close();
        br.close();
    }
}