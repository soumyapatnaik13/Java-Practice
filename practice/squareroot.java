public class squareroot{
    public static void main(String[] args) {
        int num =36;
        findsquare(num);
        System.out.println(findsquare(num));

    }
    static int findsquare(int num){
        int start =0;
        int end=num;

        while(start<=end){
            int mid = start + (end-start)/2;
            long value =(long) mid * mid;
            if(value==num){
                return mid;
            }
            else if(value<num){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    return end;
}
}