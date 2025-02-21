import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());
        int s3 = Integer.parseInt(st.nextToken());

        int[] total = new int[s1+s2+s3+1];

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j<= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    int sum = i+j+k;
                    total[sum]++;
                }
            }
        }
        int maxCount = 0;
        int result = 0;
        for (int i = 0; i < total.length; i++) {
            if(total[i]>maxCount){
                maxCount = total[i];
                result = i;
            }
        }
        bw.write(result+"\n");
        bw.flush();
        bw.close();
        
    }
}