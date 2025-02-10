import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] number = new int[9];
        int max = Integer.MIN_VALUE;
        int index=-1;
        
        for(int  i=0; i<9; i++){
            number[i] = Integer.parseInt(br.readLine());
            if(number[i]>max){
                max = number[i];
                index = i+1;
            }
        }
        bw.write(max+"\n");
        bw.write(index+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
