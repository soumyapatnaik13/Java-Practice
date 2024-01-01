public class numbers {
    public static void main(String[] args) {
        int n =5;
        int num=8;
        fun(n);
        fun1(num);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
    static void fun1(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
    fun(num-1);
  }
}
