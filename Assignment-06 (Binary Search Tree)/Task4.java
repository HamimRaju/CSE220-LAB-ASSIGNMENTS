public class Task4 {
    public static Integer rangeSum( BSTNode root, Integer low, Integer high ){
        if(root == null){
            return 0;
        }
        int sum = 0;

        if (root.elem>=low && root.elem<=high) {
            sum=root.elem;
        }
        if (root.elem>high) {
            return rangeSum(root.right, low, high);
        }
        sum+=rangeSum(root.left, low, high);
        sum+=rangeSum(root.right, low, high);
        return sum;
    }
}
