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
        radix(arr, 6);
        for(int i=0; i<n; i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();
    }
    private static int[] radix(int[] arr, int k){
        int n = arr.length;
        int pow = 1;

        for(int pos=0; pos<k; pos++){
            List<List<Integer>> buckets = new ArrayList<>(10);
            for(int i=0; i<10; i++){
                buckets.add(new ArrayList<>());
            }
            for(int i=0; i<n; i++){
                int digit = (arr[i]/pow)%10;
                buckets.get(digit).add(arr[i]);
            }
            int idx = 0;
            for(int d=0; d<10; d++){
                for(int val: buckets.get(d)){
                    arr[idx++] = val;
                }
            }
            pow *= 10;
        }
        return arr;
    }

}