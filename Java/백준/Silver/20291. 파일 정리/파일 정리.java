import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String extension = input.substring(input.lastIndexOf('.') + 1);
            map.put(extension, map.getOrDefault(extension, 0) + 1);
        }

        List<String> extensions = new ArrayList<>(map.keySet());
        Collections.sort(extensions);

        for (String extension : extensions) {
            bw.write(extension + " " + map.get(extension));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}