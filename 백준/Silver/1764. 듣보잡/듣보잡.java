import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;

        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            map.put(br.readLine(), 1);
        }

        for(int i=0; i<m; i++){
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0)+1);
            if(map.get(name)==2) list.add(name);
        }

        StringBuilder sb = new StringBuilder();
        Collections.sort(list);
        sb.append(list.size()+"\n");
        for(String s: list){
            sb.append(s+"\n");
        }
        bw.write(sb.toString());  
        bw.flush();
        bw.close();
    }
}