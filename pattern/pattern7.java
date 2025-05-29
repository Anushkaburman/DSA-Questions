import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for(int i = 1;i<=n/2;i++){
            for(int j = 1;j<=n/2-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i<=n/2-1;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<=2*(n/2-1 - i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        

    }
    
}
