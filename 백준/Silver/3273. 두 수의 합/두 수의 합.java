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
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int target = Integer.parseInt(br.readLine());
        int count = 0;
        int left = 0;
        int right = n-1;
        
        while(left<right) {
            int sum = arr[left] + arr[right];
            if(sum==target) {
                count++;
                left++;
                right--;
            } else if(sum<target){
                left++;
            } else {
                right--;
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
        br.close();
    }
}