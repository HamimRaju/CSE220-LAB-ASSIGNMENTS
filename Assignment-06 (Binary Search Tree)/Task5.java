public class Task5 {

    public static Integer mirrorSum(BSTNode root) {
        if(root == null){
            return 0;
        }
        return sum(root.left,root.right);
    }
    public static Integer sum(BSTNode left,BSTNode right){
        if(left == null || right == null){
            return 0 ;
        }
        return left.elem + right.elem + sum(left.left, right.right) + sum(left.right, right.left);
    }      
}
