import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][4];
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken(); 
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken(); 
            arr[i][3] = st.nextToken(); 
        }
        
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                // 국어 점수 내림차순
                if (!o2[1].equals(o1[1])) {
                    return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
                }
                // 영어 점수 오름차순
                if (!o1[2].equals(o2[2])) {
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                }
                // 수학 점수 내림차순
                if (!o1[3].equals(o2[3])) {
                    return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]);
                }
                // 이름 사전순 오름차순
                return o1[0].compareTo(o2[0]);
            }
        });
        
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i][0]);
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}
