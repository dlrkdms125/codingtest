import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = {2,2,2,2,2,2,2,2,2,2,2};
        int cnt = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int where = Integer.parseInt(st.nextToken());
            if(arr[num]!=2 && arr[num]!=where){
                cnt++;
                arr[num]=where;
            } else {
                arr[num]=where;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();   
    }
}