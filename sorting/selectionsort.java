import java.util.Arrays;
public class selectionsort {
    public static void main(String[] args) {
        int [] arr = {4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int [] arr){
        for(int i=0; i< arr.length;i++){
         int last= arr.length-i-1;
        int max = maximumindex(arr,0,last);
        swap(arr,max,last);
        
        }
    }
    static void swap(int [] arr, int start, int end){
        int temp= arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static int maximumindex(int [] arr, int start, int last){
     int max = start;
     for(int i=start;i<=last;i++){
        if(arr[max]<arr[i]){
            max= i;
        }
     }
     return max;
    }
}
