package leetCode;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {


    Node root;
    Boolean find = false;


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(10);
        tree.add(12);
        tree.add(8);
        tree.add(5);
        tree.add(7);
        tree.add(11);
        tree.add(15);
        tree.add(14);
        tree.add(6);
        tree.add(16);
        tree.add(13);
//        tree.levelOrder();
        System.out.println("Inorder Traversal");
        tree.preOrderRoot();

//        System.out.println("Searching in tree");
//        tree.search(12);
//        tree.delete(5);
//        tree.preOrderRoot();
//        tree.delete(7);
        tree.delete(8);
        tree.delete(12);
        tree.preOrderRoot();

    }

    private void search(int i) {
        Boolean found = searchThruRoot(root, i);
        if (found == true) {
            System.out.println("We found the value in tree");
        } else {
            System.out.println("We couldnt find the value in tree");
        }
    }

    private boolean searchThruRoot(Node cur, int i) {
        if (cur == null) {
            find = false;
            return find;
        }
        if (cur.getValue() < i) {
            searchThruRoot(cur.getRight(), i);
        } else if (cur.getValue() > i) {
            searchThruRoot(cur.getLeft(), i);
        } else {
            find = true;

        }
        return find;
    }

    public Node addNode(Node cur, int num) {
        if (cur == null) {
            return new Node(num);
        }
        if (cur.getValue() > num) {
            cur.setLeft(addNode(cur.left, num));
        } else if (cur.getValue() < num) {
            cur.setRight(addNode(cur.right, num));

        } else {
            return cur;
        }
        return cur;
    }

    public void add(int value) {
        root = addNode(root, value);
    }

    //read operation level order
    public void levelOrder() {
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node presNode = queue.remove();
            System.out.println(presNode.getValue());

            if (presNode.getLeft() != null)
                queue.add(presNode.getLeft());
            if (presNode.getRight() != null)
                queue.add(presNode.getRight());
        }
    }
    //we will search the value in node


    //inorder traversal
    public void inOrderRoot() {
        inOrder(root);
    }

    public void preOrderRoot() {
        preOrder(root);
    }

    public void postOrderRoot() {
        postOrder(root);
    }

    public void inOrder(Node cur) {
        if (cur != null) {
            inOrder(cur.left);
            System.out.print(cur.getValue() + " ");
            inOrder(cur.right);
        }
    }

    public void preOrder(Node cur) {
        if (cur != null) {
            System.out.print(cur.getValue() + " ");
            preOrder(cur.left);
            preOrder(cur.right);
        }
    }

    public void postOrder(Node cur) {
        if (cur != null) {
            postOrder(cur.left);
            postOrder(cur.right);
            System.out.print(cur.getValue() + " ");
        }
    }

    public void delete(int value) {
        deleteNode(root, value);
        System.out.println("Value :" + value + " got deleted from Tree");
    }

//                 10
//            8          12
//        5      7   11       15
//          6              14     16
//                     13
    public Node deleteNode(Node cur, int value) {
        if (cur == null) {
            return cur;
        }
//        if (cur.getValue() == value) {
//
//        }
        if (cur.getValue() > value) {
            cur.setLeft(deleteNode(cur.getLeft(), value));
        } else if (cur.getValue() < value) {
            cur.setRight(deleteNode(cur.getRight(), value));
        } else {
            if (cur.getLeft() == null && cur.getRight() == null) {
                cur = null;
                return cur;
            } else if (cur.getLeft() == null && cur.getRight() != null) {
                cur = cur.getRight();
                return cur;
            } else if (cur.getLeft() != null && cur.getRight() == null) {
                cur = cur.getLeft();
                return cur;
            } else {
                Node replce = getLeafNode(cur.getRight());
                deleteNode(cur, replce.getValue());   //to delete the minimum value so we can avoid cyclic formation while replacing
                replce.setLeft(cur.getLeft());
                replce.setRight(cur.getRight());
                return replce;
            }
        }
        return cur;
    }

    public Node getLeafNode(Node n) {
        while (n.getLeft() != null) {
            n = n.getLeft();
        }
        return n;
    }
}
