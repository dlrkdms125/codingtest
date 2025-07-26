import java.util.*;
import java.io.*;

public class Main {
    private static int[] mergedArr = new int[100000];
    private static int[] arr = new int[100000];
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(0, n-1);
        for(int i=0; i<n; i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();
    }
    private static void merge(int low, int mid, int high){
        int i = low;
        int j = mid+1;
        int k = low; // 병합시 원소를 담을 위치 유지
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]) mergedArr[k++] = arr[i++];
            else mergedArr[k++] = arr[j++];
        }
        while(i<=mid) mergedArr[k++] = arr[i++];
        while(j<=high) mergedArr[k++] = arr[j++];

        for(int l=low; l<=high; l++){
            arr[l] = mergedArr[l];
        }
    }
    public static void mergeSort(int low, int high){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(low, mid);
            mergeSort(mid+1, high);
            merge(low, mid, high);
        }
    }

}