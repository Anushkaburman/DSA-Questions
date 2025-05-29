import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j =0 ;j<=2*(n-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
