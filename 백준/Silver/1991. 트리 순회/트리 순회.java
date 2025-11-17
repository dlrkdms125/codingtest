import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
    char val;
    Node left;
    Node right;
    public Node(char val){
        this.val=val;
        this.left = null;
        this.right = null;
    }
}

class Main {
    static Node[] tree;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // 전위순회
    public static void preorder(Node node) throws IOException {
        if(node==null) return;
        bw.write(node.val);
        preorder(node.left);
        preorder(node.right);
    }
    // 중위순회
    public static void inorder(Node node) throws IOException {
        if(node==null) return;
        inorder(node.left);
        bw.write(node.val);
        inorder(node.right);
    }
    // 후위순회
    public static void postorder(Node node) throws IOException {
        if(node==null) return;
        postorder(node.left);
        postorder(node.right);
        bw.write(node.val);
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
            if(tree[parentValue-'A']==null) {
                tree[parentValue-'A'] = new Node(parentValue);
            }
            if(leftValue != '.') {
                tree[leftValue-'A'] = new Node(leftValue);
                tree[parentValue-'A'].left = tree[leftValue-'A'];
            }    
            if(rightValue != '.'){
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
        bw.close();
        
    }
}