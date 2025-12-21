import java.util.*;

public class Task6 {

    public static Integer levelSum(BTNode root) {

        Queue<BTNode> q1 = new LinkedList<>();
        q1.add(root);
        q1.add(null);
        int level = 1;
        int level_sum = 0;

        while (!q1.isEmpty()) {
            BTNode current = q1.remove();

            if (current == null) {
                level++;
                if(q1.isEmpty()){
                    break;
                }
                else{
                    q1.add(null); 
                }
                
            } 
            else {
                if (level % 2 != 0) {
                    level_sum -= (Integer) current.elem;
                } 
                if (level % 2 == 0) {
                    level_sum += (Integer) current.elem;
                }
                if (current.left != null) {
                    q1.add(current.left);
                }
                if (current.right != null) {
                    q1.add(current.right);
                }
            }
        }
        return level_sum;
    }
}
