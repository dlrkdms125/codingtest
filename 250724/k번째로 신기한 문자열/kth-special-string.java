import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String t = st.nextToken();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = br.readLine();
        }
        ArrayList<String> words = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(arr[i].contains(t)) words.add(arr[i]);
        }
        String[] result = new String[words.size()];
        for(int i=0; i<words.size(); i++){
            result[i] = words.get(i);
        }
        Arrays.sort(result);
        bw.write(result[k-1]);
        bw.flush();

    }
}