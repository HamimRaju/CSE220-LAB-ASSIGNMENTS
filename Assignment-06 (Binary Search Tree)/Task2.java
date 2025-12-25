//improt java.util.*;
public class Task2 {
    public static String findPath( BSTNode root, Integer key ){
        ArrayList <Integer> route = new ArrayList<>();
        if (find(root, key, route)) {
            String path = "";
            for (int i = 0; i < route.size(); i++) {
                path += route.get(i) + " ";
            }
            return path.trim();
        } 
        else{
            return "No Path Found";
        }
    }
    public static boolean find(BSTNode root, Integer key,ArrayList<Integer> route){
        if(root == null){
            return false;
        }
        route.add(root.elem); //If not null then it will add the route
        if(key == root.elem){
            return true;
        }//If the key and route same then will return true 
        if(key>root.elem){
            if(find(root.right, key, route)){
                return true;
            }
        }
        if(key<root.elem){
            if (find(root.left, key, route)){
                return true;
            }
        }
        route.remove(route.size()-1);
        return false;
    }
}
