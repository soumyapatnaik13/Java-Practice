
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class distictElement {
   public static void main(String[] args) {
    int [] arr= {5,10,5,4,5,10};
   int num= distict(arr);
   System.out.println(num);
   } 
   static int distict(int [] arr){
   Set<Integer> h= new HashSet<>();
   for(int num: arr){
      h.add(num);
   }
   return h.size();
   }
}
