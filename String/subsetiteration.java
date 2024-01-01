import java.util.List;
import java.util.ArrayList;
public class subsetiteration {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
       List<List<Integer>> ans= subset(arr);
       for(int i=0;i<ans.size();i++){
        List<Integer> list=ans.get(i);
        System.out.println(list);
       } 
    }
    static List<List<Integer>> subset(int [] arr){
        List<List<Integer>>outer = new ArrayList<>();

        outer.add(new ArrayList<>()); // {}

        for(int num:arr){
            int n = outer.size(); // []
            for(int i=0;i<n;i++){ // loop will iterarte till the copy of that list
             List<Integer> internal = new ArrayList<>(outer.get(i));//[]
             internal.add(num);//[1]
             outer.add(internal);
            }
        }
        return outer;
    }
}
