public class zerodigits{
    public static void main(String[] args) {
        int num =30203;
        System.out.println(fun(num));
    }
    static int fun(int num){
        return help(num,0);
    }
    static int help(int num,int count){
        if(num == 0){
            return count;
        }
        int reminder = num % 10;
        if(reminder == 0){
            return help(num/10, count+1);
        }
        return help(num/10, count);
    }
}