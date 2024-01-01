interface A{
    boolean isOddOrEven(int num);
}
 class B implements A{
    @Override
    public boolean isOddOrEven(int num){
       return (num & 1)==0;
    }
}
public class main{
    public static void main(String[] args) {
        B obj = new B();
        int num=6;
        boolean results= obj.isOddOrEven(6)

       System.out.println( results);
    }
}