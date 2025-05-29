import java.util.Scanner;
public class CountDigits {
    public static void count(int n){
        int c = 0;
        while(n>0){
            n = n/10;
            c++;
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n;
     n = sc.nextInt();
     count(n);   
    }
    
}
