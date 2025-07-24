import java.util.*;
import java.io.*;

class Student implements Comparable<Student> {
    String name;
    int height;
    int weight;
    public Student(String name, int height, int weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
    @Override
    public int compareTo(Student student){
        if(this.height==student.height){
            return student.weight-this.weight;
        } return this.height-student.height;
    }

}


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int n = Integer.parseInt(br.readLine());
        Student[] students = new Student[n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            students[i] = new Student(name, height, weight);
        }
        Arrays.sort(students);
        for(int i=0; i<n; i++){
            bw.write(students[i].name+" "+students[i].height+" "+students[i].weight);
            bw.newLine();
        }
        bw.flush();
    }
}