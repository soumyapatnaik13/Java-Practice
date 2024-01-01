import java.util.HashSet;
import java.util.Set;
public class hashset{
    public static void main(String [] args){
     Set<Integer> s= new HashSet<>();
     s.add(10);
     s.add(3);
     s.add(5);
     if(s.contains(10)){
        System.out.println("present");
     }
     else{
        System.out.println("not present");
     }

    s.remove(3);
    System.out.println(s);
    }
}
//unordered