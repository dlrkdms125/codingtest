import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int total = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            total += arr[i];
            freq.put(arr[i], freq.getOrDefault(arr[i], 0)+1);
        }
        int maxFreq = Collections.max(freq.values());
        List<Integer> modes = new ArrayList<>();
        for(int key: freq.keySet()){
            if(freq.get(key)==maxFreq){
                modes.add(key);
            }
        }
        Arrays.sort(arr);
        Collections.sort(modes);
        int modeResult = (modes.size()>1) ? modes.get(1) : modes.get(0);
        int mean = (int) Math.round((double) total / n);
        int result2 = arr[n/2];
        int result4 = arr[n-1]-arr[0];

        bw.write(String.valueOf(mean));
        bw.newLine();
        bw.write(String.valueOf(result2));
        bw.newLine();
        bw.write(String.valueOf(modeResult));
        bw.newLine();
        bw.write(String.valueOf(result4));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }
}