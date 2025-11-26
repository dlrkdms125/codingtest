import java.io.*;
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        for(int i=0; i<5; i++){
            print5Stars();
            bw.newLine();
        }
        bw.flush();
    }
    private static void print5Stars() throws IOException {
        for(int i=0; i<10; i++){
            bw.write("*");
        }
    }
}