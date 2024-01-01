@FunctionalInterface
interface A{
    void show();
}

public class lamda{
    public static void main(String[] args) {
        A obj = () -> System.out.println("show");
        
        obj.show();
    }
}