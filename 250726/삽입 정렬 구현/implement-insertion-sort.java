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
        insertionSort(arr);
        for(int i=0; i<n; i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();


    }
    private static int[] insertionSort(int[] arr){
        int size = arr.length;
        for(int i=1; i<size; i++){
            int j = i-1;
            int key = arr[i];
            while(j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

}