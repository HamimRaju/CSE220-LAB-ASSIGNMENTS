public class Task5 {

    public static Integer subtractSummation(BTNode root) {          
        if (root == null) {
            return 0;
        }
        int left = summation(root.left);
        int right = summation(root.right);
        return left - right;
    }

    static Integer summation(BTNode root) {
        if (root == null) {
            return 0;
        }
        return summation(root.left) + summation(root.right) + (Integer) root.elem;
    }
}
