public class Task3 {
    
    public static void kthLevelPrint(BTNode root, int lvl) {
        helper(root, lvl, 0);
    }

    static void helper(BTNode root, int lvl, int level_counter) {
        if (root == null) {
            return;
        }
        if (lvl == level_counter) {
            System.out.print(root.elem + " ");
        }
        helper(root.left, lvl, level_counter + 1);
        helper(root.right, lvl, level_counter + 1);
    }
}
