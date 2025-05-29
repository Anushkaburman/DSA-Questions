import java.util.Scanner;
public class swap {
    
    public static void  Swap(int a,int b){
    int c = a;
    a = b;
    b = c;
    System.out.println("after swapping a = " +a + " b = "+b);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
      int a,b;
      System.out.print("a = ");
      a = obj.nextInt();
      System.out.print("b =");
      b = obj.nextInt();
      System.out.println("before swapping a = "+a+" b = "+b);
      Swap(a,b);
    }
}
