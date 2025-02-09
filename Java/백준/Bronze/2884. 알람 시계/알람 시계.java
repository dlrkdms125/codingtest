import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int H = Integer.parseInt(input[0]); 
        int M = Integer.parseInt(input[1]); 

        if (M >= 45) {
            M -= 45; 
        } else {
            M += 15; 
            H -= 1; 
            if (H < 0) {
                H = 23; 
            }
        }

        bw.write(H + " " + M + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}