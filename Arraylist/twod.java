import java.util.*;
import java.util.Scanner;
public class twod {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    ArrayList<ArrayList<Integer>>num = new ArrayList<>();
    //initatlise a value from the user
   for(int i=0;i<3;i++){
    num.add(new ArrayList<>());
   }

   for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        num.get(i).add(sc.nextInt());
    }
   }
   System.out.println(num);
    }
}
