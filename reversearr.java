import java.util.Scanner;
public class reversearr {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n ;
     n = sc.nextInt();
     int[] arr = new int[n];
      for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int j = n-1;
        int i = 0;
     System.out.println("reversed array is - ");
     while(i==j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;   
     }
      for(int k=0; k<n; k++){
            System.out.print(arr[k]+ " ");
        }
    }    
}
