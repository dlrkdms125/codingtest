import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nation = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int[][] arrs = new int[nation][4];

        for (int i = 0; i < nation; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arrs[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 금, 은, 동 내림차순 정렬
        Arrays.sort(arrs, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                if (o1[2] == o2[2]) {
                    return Integer.compare(o2[3], o1[3]); 
                }
                return Integer.compare(o2[2], o1[2]);
            }
            return Integer.compare(o2[1], o1[1]); 
        });

        int endpoint = -1;
        for (int i = 0; i < nation; i++) {
            if (arrs[i][0] == target) {
                endpoint = i;
                break;
            }
        }
        if (endpoint == -1) { 
            throw new IllegalArgumentException("Target nation not found");
        }

        int rank = 1;
        for (int i = 0; i < endpoint; i++) {
            if (!(arrs[i][1] == arrs[endpoint][1] && arrs[i][2] == arrs[endpoint][2] && arrs[i][3] == arrs[endpoint][3])) {
                rank++;
            }
        }

        bw.write(rank + "\n");
        bw.flush();
    }
}
