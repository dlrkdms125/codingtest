import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String s = br.readLine().toUpperCase();
            int count = 0;
            if(s.equals("#")) break;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='A'|| s.charAt(i)=='E' || s.charAt(i)=='O' || s.charAt(i)=='I' || s.charAt(i)=='U') {
                    count++;
                }
            }
            bw.write(count+"\n");
        }
        bw.flush();
        bw.close();
    }
}