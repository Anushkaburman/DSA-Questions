import java.util.Scanner;
public class hollowSquare {
    public static void Square(int n){
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(i==1||j==1||j==n||i==n){
                    System.out.print("* ");
                }
                else 
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Square(n);
    }
    
}
