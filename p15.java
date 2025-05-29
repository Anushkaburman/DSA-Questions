import java.util.Scanner;
public class p15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for(int i =1;i<=(n+1)/2;i++){
            for(int j =1;j<=(n+1)/2 - i +1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i<=(n+1)/2-1;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}