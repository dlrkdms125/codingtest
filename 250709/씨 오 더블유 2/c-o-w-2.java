import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int[] cCount = new int[n];
        int[] wCount = new int[n];

        cCount[0] = input.charAt(0)=='C'? 1: 0;
        for(int i=1; i<n; i++){
            cCount[i] = cCount[i-1] + (input.charAt(i)=='C' ? 1: 0);
        }
        wCount[n-1] = input.charAt(n-1)=='W'? 1:0;
        for(int i=n-2; i>=0; i--){ // <-- 여기 수정!
            wCount[i] = wCount[i+1] + (input.charAt(i)=='W' ? 1:0);
        }
        int cnt = 0;
        for(int i=1; i<n-1; i++){
            if(input.charAt(i)=='O') cnt += cCount[i-1]*wCount[i+1];
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}

