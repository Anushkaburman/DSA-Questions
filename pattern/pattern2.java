import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n;
     n = sc.nextInt();
     for(int i = 1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j = 1;j<=2*i-1;j++){
            if(j==1|| j == 2*i-1||i==n){
                System.out.print("*");
            }
            else
            System.out.print(" ");
        }
        System.out.println();
     }
    }
}
