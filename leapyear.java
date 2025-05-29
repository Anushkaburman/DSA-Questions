import java.util.Scanner;
public class leapyear {
    public static void year(int n){
        if((n%4==0)&&(n%100!=0)||(n%400==0)){
            System.out.println( n+" is a leap year");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n ;
        n =sc.nextInt();
        year(n);
    }
    
}
