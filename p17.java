import java.util.Scanner;
public class p17 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        int mid = (n+1)/2;
        for(int i = 1;i<=mid;i++){
            for(int j =1;j<=mid -i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=mid-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =1;i<=mid -1;i++){
            for(int j = 1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j= 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
