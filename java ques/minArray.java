public class minArray {
    public static void main(String[] args){
    int[] arr = {3,52,54,65,78,5};
    int min = arr[0];
    for(int i=1 ; i<arr.length ; i++){
        if(arr[i] < min){
            min = arr[i];
        }
    }  
    System.out.println(min);
}
}
