import java.util.Scanner;
public class palindrome {
    public static void pdrome(int n){
        int reverse = 0;
        int temp =n;
        while(temp>0){
            int r = temp%10;
            reverse = reverse *10 + r;
            temp = temp/10;
        }
        if(n==reverse){
            System.out.println("it is a palindrome number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        pdrome(n);
        
        
    }}
    

