import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int price = Integer.parseInt(br.readLine());
        int payment = 1000 - price;

        int total = 0;
        total += payment / 500; payment %= 500;
        total += payment / 100; payment %= 100;
        total += payment / 50; payment %= 50;
        total += payment / 10; payment %= 10;
        total += payment / 5; payment %= 5;
        total += payment;

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();
    }
}