import java.util.*;
public class Main {

class Range {
    int low;
    int high;

    public Range(int low, int high) {
        this.low = low;
        this.high = high;
    }
}

class Node {
    Range value;
    Node left;
    Node right;

    public Node(Range value) {
        this.value = value;
    }
}

public class RangeTree {

    public static boolean order(Node t) {
        if (t == null){
            return true;
        }
        Range c = t.value;

        if (t.left != null) {
            Range left = t.left.value;

            if (left.low != c.low || left.high > c.high)
                return false;
        }

        if (t.right != null) {
            Range right = t.right.value;

            if (right.high != c.high || right.low < c.low)
                return false;
        }

        if (t.left != null && t.right != null) {
            if (t.left.value.high >= t.right.value.low)
                return false;
        }

        return order(t.left) && order(t.right);
    }
}
}















import java.util.*;
public class Main {
    
    public static boolean tree(BinNode<Integer> tree1) {
        boolean bool = false ;
        if (tree1 == null) {
            return true;
        }
        if (tree1.getRight()!=null){
         if (tree1.getLeft()!=null){
             bool = true;
         }  
        }
        if (tree1.getLeft()!=null){
             bool = true;
         } 
        return tree(tree1.getLeft()) && tree(tree1.getRight());
    }
}





import java.util.*;
public class Main {

class Range {
    int low;
    int high;

    public Range(int low, int high) {
        this.low = low;
        this.high = high;
    }
}

class Node {
    Range value;
    Node left;
    Node right;

    public Node(Range value) {
        this.value = value;
    }
}

public class RangeTree {

    public static boolean order(Node t) {
        if (t == null){
            return true;
        }
        Range c = t.value;

        if (t.left != null) {
            Range left = t.left.value;

            if (left.low != c.low || left.high > c.high)
                return false;
        }

        if (t.right != null) {
            Range right = t.right.value;

            if (right.high != c.high || right.low < c.low)
                return false;
        }

        if (t.left != null && t.right != null) {
            if (t.left.value.high >= t.right.value.low)
                return false;
        }

        return order(t.left) && order(t.right);
    }
}
}













import java.util.*;
public class Main {

///////////////////////////////////////////////////////////////////
    public static int count(BinNode<Integer> root, int num) {
        if (root == null) {
            return 0;
        }
        int c = 0;
        if (root.getValue().equals(num)){
            c = 1;
        }        
        return c + count(root.getLeft(), num) + count(root.getRight(), num);
    
}
public static boolean isLeaf(BinNode<Integer> t) {
    return !t.hasLeft()  && !t.hasRight();
}
////////////////////////////////////////////////////////////////////
public static int findExtreme(BinNode<Integer> root, int which) { //-1 min, +1 max
        if (isLeaf(root)) {
            return root.getValue();
        }
        int a = findExtreme(root.getLeft());
        int b = findExtreme(root.getRight());        
        if (a * which > which * b){
          return a;
        }
        return b;
}







    public static int MinAndMax(BinNode<Integer> root) {
        if (root == null) {
            return max + min;
        }
        if (root.getValue()>max){
            max = root.getValue();
            MinAndMax(root.getLeft()) + MinAndMax(root.getRight());
        }
        if (root.getValue()<min){
            min = root.getValue();
            MinAndMax(root.getLeft()) + MinAndMax(root.getRight());
        }
        
        return MinAndMax(root.getLeft()) + MinAndMax(root.getRight());
    
}



    public static BinNode<Integer> buildTree(int levels) {
        if (levels == 0){
            return null;
        } 
        Random rand = new Random();
        BinNode<Integer> node = new BinNode<>(rand.nextInt(5) + 1); 
        node.setLeft(buildTree(levels - 1));
        node.setRight(buildTree(levels - 1));
        return node;
    }

    public static void main(String[] args) {
        BinNode<Integer> myTree = buildTree(3);
        
        int toFind = 2;
        System.out.println("Searching for: " + toFind);
        System.out.println("Result: " + count(myTree, toFind));
    }
}

