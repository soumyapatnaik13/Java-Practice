import java.util.Arrays;
public class recursionselect {
    public static void main(String[] args) {
        int [] arr= {1,2,4,3};
        select(arr,arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
        
    }
    static void select(int [] arr, int r, int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                select(arr, r, c+1, c);
            }
            else{
                select(arr, r, c+1, max);
            }
        }
        else{
            int temp= arr[max];
            arr[max]= arr[r-1];// row work as length of array 
            arr[r-1]= temp;// row will reduce to row-1 

            select(arr, r-1, 0, 0);
        }
    }
    
}
