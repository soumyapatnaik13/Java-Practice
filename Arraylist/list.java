import java.util.Scanner;
import java.util.ArrayList;
public class list{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<Integer> list = new ArrayList<>(5); 

       for(int i=0;i<5;i++){
        list.add(sc.nextInt());
       }
       for (int i=0;i<5;i++){
        System.out.println(list.get(3));
       }
       System.out.println(list);
    }
}