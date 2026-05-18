import java.util.Scanner;

public class Task1 {

    public static void task1A() {
        int i = 1;
        while (i<=10) {
            System.out.print(i + " ");
            i++;
        }
    }

    public static void task1B_recursive(int i) {
        if( i == 10){
            System.out.print(10);
            return;
        }
        else{
            System.out.print(i +" ");
            task1B_recursive(i + 1);
        }
    }

    public static void task1C(int n) {
        int number = 1;
        while (number < n) {
            System.out.print(number + " -> ");
            number++;
        }
        System.out.print(n);
    }

    public static void task1D_recursive(int i, int n) {
        int start = i;
        int end = n;
        if(start == end){
            System.out.print(n);
            return;
        }
        else{
            System.out.print(start + " -> ");
            task1D_recursive(i+1,n);
        }
        
    }

    public static void main(String[] args) {
        
        task1A();
        System.out.println("\n-----------------------------");

        task1B_recursive(1);
        System.out.println("\n-----------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a nubmer : ");
        int number = sc.nextInt();
        task1C(number);
        System.out.println("\n-----------------------------");
        
        task1D_recursive(1, 10);

        sc.close();
    }
}
