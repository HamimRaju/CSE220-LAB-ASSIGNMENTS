public class Task6 {
    public static Boolean isBST(BSTNode root) {
        return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public static Boolean check(BSTNode node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.elem<=min|| node.elem>=max) {
            return false;
        }
        return check(node.left, min, node.elem) && check(node.right, node.elem,max);
    }
}
