import java.util.Scanner;
public class p18 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        if(n%2==0){
            System.out.print("please enter odd number ");
        }
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=2*n;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
