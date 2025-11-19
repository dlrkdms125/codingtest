import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            int number = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(binarySearch(arr, number)));
            bw.newLine();
        }
        bw.flush();
        
    }
    public static int binarySearch(int[] array, int number){
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(number==array[mid]) return 1;
            else if(number>array[mid]) start = mid+1;
            else end = mid-1;
        }
        return 0;
    }

}