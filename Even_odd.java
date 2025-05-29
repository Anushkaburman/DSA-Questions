public class Even_odd {
    public static void main(String[] args) {
     int[] arr = {3,46,2,6,78,18,5};
     int c = 0;
     int d = 0;
     for(int i=0 ; i<arr.length ; i++){
        if(arr[i] % 2 == 0){
            c++;
        }
        else
        d++;
     }
     System.out.println("even - " +c+ " odd - " +d);   
    }
    
}   
