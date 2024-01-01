public class findunique{
    public static void main (String [] args){
        int [] arr = {1,2,3,4,5,1,2,3,4};
        System.out.println(ans(arr));
    }
    static int ans(int [] arr){
        int res = arr[0];
        for(int i=1;i<arr.length;i++ ){
            res = res^arr[i];
        }
        return res;
    }
}