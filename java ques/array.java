import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter n: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
    
}
