public class MaxArray {
    public static void main(String[] args){
        int[] a = {23, 45, 65, 23, 55};

        int max = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }

        System.out.println(max);
    }
} 
