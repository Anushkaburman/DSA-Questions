public class Rotation2 {
    public static void main(String[] args) {
     int[] arr = {10,20,30,40,50};
     int n = arr.length;
     int k=3;
     for(int i=0 ; i<k ; i++){
        int first = arr[0];
        for(int j=1 ; j<arr.length ; j++){
            arr[j-1] = arr[j];
        }
        arr[n-1] = first;
     }
     for(int i =0 ; i<arr.length ; i++){
        System.out.print(arr[i]+ " ");
     }
    }
}
