import java.util.*;
import java.io.*;

class Info {
    String name;
    String code;
    String place;
    public Info(String name, String code, String place){
        this.name=name;
        this.code=code;
        this.place=place;
    }
};

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Info[] infos = new Info[n];
        
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String code = st.nextToken();
            String place = st.nextToken();
            infos[i] = new Info(name, code, place);
        }
        int last = 0;
        for(int i=1; i<n; i++){
            if(infos[i].name.compareTo(infos[last].name)>0) last = i;
        }
        bw.write("name " + infos[last].name);
        bw.newLine();
        bw.write("addr " + infos[last].code);
        bw.newLine();
        bw.write("city " + infos[last].place);
        bw.flush();
    }
}