import java.util.*;
public class passing_in_body {
    public static void main(String[] args) {
    int [] arr = {1,2,3,4,4,5};
    int target= 4;
    System.out.println(fun(arr, target, 0)) ;
    }
    static ArrayList<Integer> fun(int [] arr, int target, int index){
        ArrayList<Integer> list= new ArrayList<>();
    
    if (index == arr.length){
        return list;
    }
    // this will going to conatin the answer of that call only
    if(arr[index]== target){
        list.add(index);
    }
    ArrayList<Integer> belowans = fun(arr,target, index+1);
    list.addAll(belowans);
    return list;
}
}
