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

