import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int maxStart = Integer.MIN_VALUE;
        int minEnd = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            maxStart = Math.max(maxStart, x1);
            minEnd = Math.min(minEnd, x2);
        }

        if (maxStart <= minEnd) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
