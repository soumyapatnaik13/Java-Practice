public class binarysearch{
    public static void main (String[] args ){
    int [] arr ={10,20,30,40,50,60,70};
    int target =60;
    int ans= fibo(arr,target,0,arr.length-1);
     System.out.println(ans);

    }
    static int fibo(int [] arr, int target, int start,int end){
      if(start>end){
        return -1;
      }
      int mid = start + (end-start)/2;
      if(arr[mid]== target){
        return mid;
      }
     else if(target<arr[mid]){
        return fibo(arr, target, start, mid-1);
      }
      else{
         return
          fibo(arr,target,mid+1,end);
      }
    }
}