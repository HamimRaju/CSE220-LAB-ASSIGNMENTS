public class Task2 {
    public static int countNodes( BTNode root){
        if(root==null){
            return 0;
        }
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
