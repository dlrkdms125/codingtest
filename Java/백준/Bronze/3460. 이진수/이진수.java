import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int number = Integer.parseInt(br.readLine());
            int index = 0;

            while(number>0){
                if(number%2==1){
                    bw.write(index+" ");
                }
                number /= 2;
                index++;
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();

    }
}