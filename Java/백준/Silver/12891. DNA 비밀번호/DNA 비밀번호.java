import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int S = Integer.parseInt(st.nextToken()); 
        int P = Integer.parseInt(st.nextToken()); 
        String dna = br.readLine(); 
        
        int[] minCounts = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            minCounts[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] currentCounts = new int[4]; 
        for (int i = 0; i < P; i++) {
            addChar(currentCounts, dna.charAt(i));
        }
        
        int result = 0;
        if (isValid(currentCounts, minCounts)) result++;
        
        for (int i = P; i < S; i++) {
            removeChar(currentCounts, dna.charAt(i - P)); 
            addChar(currentCounts, dna.charAt(i));       
            if (isValid(currentCounts, minCounts)) result++;
        }
        
        bw.write(String.valueOf(result));
        bw.newLine();
        bw.flush();
        bw.close();
    }
    
    private static void addChar(int[] counts, char c) {
        if (c == 'A') counts[0]++;
        else if (c == 'C') counts[1]++;
        else if (c == 'G') counts[2]++;
        else if (c == 'T') counts[3]++;
    }

    private static void removeChar(int[] counts, char c) {
        if (c == 'A') counts[0]--;
        else if (c == 'C') counts[1]--;
        else if (c == 'G') counts[2]--;
        else if (c == 'T') counts[3]--;
    }

    private static boolean isValid(int[] currCounts, int[] minCounts) {
        for (int i = 0; i < 4; i++) {
            if (currCounts[i] < minCounts[i]) return false;
        }
        return true;
    }
}

