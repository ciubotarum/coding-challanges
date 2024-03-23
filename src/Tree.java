// Uncompleted

public class Tree {
    Node root;

    class Node {
        int key;
        Node leftChild;
        Node rightChild;

        Node(int key) {
            this.key = key;
        }

        public String toString() {
            return key + " ";
        }
    }
    public void  addNode(int key) {
        Node newNode = new Node(key);

        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;

            while (true) {
                parent = focusNode;

                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;

                    if (focusNode == null) {

                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;

                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void preorderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            preorderTraverseTree(focusNode.leftChild);
            preorderTraverseTree(focusNode.rightChild);
        }
    }

    static void printTheLevel(Node tree, int level){
        if(tree == null){
            return;
        }

        if (level == 0){
            System.out.println(tree.key);
            return;
        }

        printTheLevel(tree.leftChild, level-1);
        printTheLevel(tree.rightChild, level-1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner scanner = new Scanner(System.in);
//        int pointer = Integer.parseInt(scanner.nextLine());

        Tree theTree = new Tree();

        theTree.addNode(1);
        theTree.addNode(2);
        theTree.addNode(5);
        theTree.addNode(3);
        theTree.addNode(6);
        theTree.addNode(4);

//        theTree.preorderTraverseTree(theTree.root);
        printTheLevel(theTree.root, 3);
    }
}
