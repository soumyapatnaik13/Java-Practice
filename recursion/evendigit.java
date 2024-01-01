public class evendigit{
    public static void main(String[] args) {
        int [] arr = {10,234,43,12,78,567,5};
        System.out.println(findnumber(arr));
    }
    static int findnumber(int [] arr){
        int count =0;
        for(int nums: arr){
            if(even(nums)){
                 count++;
                     }
        }
        return count;
    }
    static boolean even(int nums){
        int even_digits= nums;
        if(even_digits%2==0){
            return true;
        }
        return false;
    }
    static int digits(int nums){
        int count =0;
        while(nums>0){
            count++;
            nums=nums/10;
        }
        return count;
    }
}