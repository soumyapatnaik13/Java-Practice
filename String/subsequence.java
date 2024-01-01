import java.util.ArrayList;
public class subsequence {
    public static void main(String[] args) {
        ArrayList<String>list =new ArrayList<>();
        sequence("","abc",list);
        System.out.println(list);
    }
    static void sequence(String sorted, String unsorted,ArrayList<String> list){
        if(unsorted.isEmpty()){
            list.add(sorted);
            return;
        }
        char c = unsorted.charAt(0);
        sequence(sorted + c, unsorted.substring(1),list);
        sequence(sorted, unsorted.substring(1),list);
    }
    
}
