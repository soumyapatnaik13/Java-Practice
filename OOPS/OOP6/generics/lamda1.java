interface Operation{
    int operation(int a,int b);
}

public class lamda1 {
    public static void main(String[] args) {
        Operation sum = (a,b)-> a+b;
        Operation sub=(a,b)-> a-b;
        System.out.println(sum.operation(7, 8));
    }
}
