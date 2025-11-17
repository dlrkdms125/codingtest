import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
    char value;
    Node left;
    Node right;

    public Node(char value){
        this.value=value;
        this.left = null;
        this.right = null;
    }
}


class Main {
    static Node[] tree;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // 전위 순회
    public static void preorder(Node node) throws IOException {
        if(node==null) return;
        bw.write(node.value);
        preorder(node.left);
        preorder(node.right);
    }
    // 중위 순회
    public static void inorder(Node node) throws IOException {
        if(node==null) return;
        inorder(node.left);
        bw.write(node.value);
        inorder(node.right);
    }
    // 후위 순회
    public static void postorder(Node node) throws IOException {
        if(node==null) return;
        postorder(node.left);
        postorder(node.right);
        bw.write(node.value);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        tree = new Node[n+1];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char parentValue = st.nextToken().charAt(0);
            char leftValue = st.nextToken().charAt(0);
            char rightValue = st.nextToken().charAt(0);

            if(tree[parentValue-'A']==null) { // 부모 노드가 아직 생성되지 않은 경
                tree[parentValue-'A'] = new Node(parentValue); // 부모 노드 생성
            }
            if(leftValue !='.') {
                tree[leftValue-'A'] = new Node(leftValue);
                tree[parentValue-'A'].left = tree[leftValue-'A'];
            }
            if(rightValue !='.') {
                tree[rightValue-'A'] = new Node(rightValue);
                tree[parentValue-'A'].right = tree[rightValue-'A'];
            }
        }
        preorder(tree[0]);
        bw.newLine();
        inorder(tree[0]);
        bw.newLine();
        postorder(tree[0]);
        bw.newLine();

        bw.flush();
        
    }
}