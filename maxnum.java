import java .util.Scanner;
public class maxnum {
    public static void max(int a , int b , int c){
        if(a>b && a>c){
            System.out.println("a is gretest");
        }
        else if(b>c &&c>a){
            System.out.println("b is greatest");
        }
        else
        System.out.println("c is greatest");
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a,b,c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            System.out.println("a = " +a+" b = " +b+ " c = "+c);
            max(a,b,c);
            } 
        }

    
    

