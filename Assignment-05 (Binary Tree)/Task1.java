public class Task1 {
    public static void inOrder( BTNode root ){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.elem+" ");
        inOrder(root.right);
    }
}
