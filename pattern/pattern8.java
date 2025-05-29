import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    int x;
    x = sc.nextInt();
    for(int i = 1;i<=n;i++){
        for(int j =1;j<=x;j++){
            if(i==1||j==1||j==x||i==n)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }


}
}
