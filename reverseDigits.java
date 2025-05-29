import java.util.Scanner;
public class reverseDigits {
    public static void reverse(int n){
        int reverse = 0;
        while(n>0){
            int r = n%10;
            reverse = reverse *10 + r;
            n = n/10;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        reverse(n);

        
    }
}
    

