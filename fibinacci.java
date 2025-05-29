import java.util.Scanner;
public class fibinacci {
    public static void fibo(int n){
        int a = 0;
        int b = 1;
        for(int i =0;i<=n;i++){
            System.out.print(a+"\t");
            int c = a + b;
             a = b;
             b = c;
        }
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n;
     n = sc.nextInt();
     fibo(n);   
    }
    
}
