import java.util.*;
import java.io.*;

class Student {
    String name;
    int height;
    double weight;
    public Student(String name, int height, double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        Student[] students = new Student[5];
        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());
            students[i] = new Student(name, height, weight);
        }
        // 이름 순
        Arrays.sort(students, Comparator.comparing(s -> s.name));
        bw.write("name"+'\n');
        for(Student s: students){
            bw.write(s.name+" "+s.height+" "+s.weight);
            bw.newLine();
        }   
        bw.newLine();
        // 키 순
        Arrays.sort(students, Comparator.comparing((Student s)-> s.height).reversed());
        bw.write("height"+'\n');
        for(Student s: students){
            bw.write(s.name+" "+s.height+" "+s.weight);
            bw.newLine();
        }
        bw.flush();
        
    }
}