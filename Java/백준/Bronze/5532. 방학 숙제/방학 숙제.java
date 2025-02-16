import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int koreanDays = (int) Math.ceil((double) A / C);
        int mathDays = (int) Math.ceil((double) B / D);


        int maxDays = Math.max(koreanDays, mathDays);


        bw.write(String.valueOf(L - maxDays) + "\n");
        
        bw.flush();
        bw.close();
        br.close();

    }
}