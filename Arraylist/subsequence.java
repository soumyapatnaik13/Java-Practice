import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class subsequence {
    public static void main(String[] args) {
        int [] arr={1,2,2};
        List<List<Integer>>ans= sub(arr);
        for(List<Integer>list:ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> sub(int [] arr){
        Arrays.sort(arr);
        List<List<Integer>>outer = new ArrayList<>();
        outer.add(new ArrayList<>()); //{}
        int start =0;
        int end= arr.length;

        for(int i=0;i<arr.length;i++){ // 
             start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start= start +1;
            }
            end= outer.size()-1;
            int n= outer.size();
           for(int j=start;j<n;j++){
            List<Integer>internal= new ArrayList<Integer>(outer.get(j));
               internal.add(i);
               outer.add(internal);
           }

        }
        return outer;
    }

}
