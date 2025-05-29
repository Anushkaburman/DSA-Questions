import java.util.Scanner;
public class oddEvn{
public static void EvenOrodd(int n){
    if(n%2==0){
        System.out.println("number is even");
    }
    else
    System.out.println("number is odd");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter the number:");
        n = sc.nextInt();
        EvenOrodd(n);
        
    }
}