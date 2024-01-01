public class magicnumber {
    public static void main (String [] args){
        int num =4;

        int ans =0;
        int count =5;
        while (num >0){
            int last = num & 1;
            num = num >> 1;
            ans = ans + last* count; 
            count = count * 5;


        }
        System.out.println(ans);
    }
}
