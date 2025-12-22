public class Task1 {

    public static Integer lowestCommonAncestor( BSTNode root, Integer x, Integer y ){
        if(root==null){
            return null;
        }
        if(x>root.elem && y>root.elem){
            return lowestCommonAncestor(root.right, x, y);
        }
        if(x<root.elem && y<root.elem){
            return lowestCommonAncestor(root.left, x, y);
        }
        return root.elem;
    }
}
