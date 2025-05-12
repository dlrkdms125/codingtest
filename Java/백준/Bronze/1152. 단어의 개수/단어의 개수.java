import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       
        String[] str = br.readLine().trim().split("\\s+");
        if (str[0].equals("")) {
            bw.write("0");
        } else {
            bw.write(String.valueOf(str.length)); 
        }

        bw.flush();
        bw.close();
        br.close();
    }
}