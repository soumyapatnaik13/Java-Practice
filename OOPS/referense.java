public class referense {
    public static void main(String[] args) {
        int [] arr={12,13,17};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        func(arr);//pass by reference
        for(int nums:arr){
            System.out.println(nums);
        }
    }
    static void func(int []arr){
        arr[1]=54;
        System.out.println(arr[1]);

    }
}
