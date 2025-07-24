import java.util.*;
import java.io.*;

class Game {
    String id;
    int level;
    public Game(String id, int level) {
        this.id=id;
        this.level=level;
    }
    public Game() {
        this.id="codetree";
        this.level=10;
    }
};
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = st.nextToken();
        int input1 = Integer.parseInt(st.nextToken());
        Game game = new Game();
        bw.write("user "+game.id+" lv "+game.level);
        bw.newLine();
        game = new Game(input, input1);
        bw.write("user "+game.id+" lv "+game.level);
        bw.flush();
    }
}