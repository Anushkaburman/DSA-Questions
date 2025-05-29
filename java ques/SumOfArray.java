import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = {1,4,6,7};
    int c = 0;
    for(int i=0 ; i<arr.length ; i++){
        c = arr[i] + c;  
    }
    System.out.println("sum is = " +c);
    
}
}

