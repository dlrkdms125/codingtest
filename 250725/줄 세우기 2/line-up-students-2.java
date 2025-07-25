import java.util.*;
import java.io.*;

class Student implements Comparable<Student> {
    int height;
    int weight;
    int number;
    public Student(int height, int weight, int number){
        this.height=height;
        this.weight=weight;
        this.number=number;
    }
    @Override
    public int compareTo(Student student){
        if(this.height==student.height){
            return student.weight-this.weight;
        }
        return this.height-student.height;
    }
}


public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int n = Integer.parseInt(br.readLine());
        Student[] students = new Student[n];
        int number = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            number++;
            students[i] = new Student(height, weight, number);
        }
        Arrays.sort(students);
        for(int i=0; i<n; i++){
            bw.write(students[i].height+" "+students[i].weight+" "+students[i].number);
            bw.newLine();
        }
        bw.flush();
    }
}