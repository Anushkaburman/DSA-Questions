import java.util.Scanner;
public class swap2 {
    public static void Swap(int a , int b){
        a = a + b;
        b = a -b ;
        a = a -b;
        System.out.println("after swapping a = " +a+ " b = "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x ;
        x = sc.nextInt();
        int y;
        y = sc.nextInt();
        System.out.println("before swapping a = " +x+ " b = "+y);
        Swap(x,y);
        
    }
} 

