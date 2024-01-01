import java.util.ArrayList;
public class return_an_arraylist_string {
    public static void main(String[] args) {
    System.out.println(subs("", "abc"));
    }

static ArrayList<String> subs(String sorted, String unsorted){
    if(unsorted.isEmpty()){
      ArrayList<String> list = new ArrayList<String>();
      list.add(sorted);
      return list;
    }
    char c = unsorted.charAt(0);
    ArrayList<String>left=subs(sorted+c, unsorted.substring(1));
    ArrayList<String>right=subs(sorted,unsorted.substring(1));
  
    left.addAll(right);
    return left;
}
}

