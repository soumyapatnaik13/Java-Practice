import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        
    int [] arr={1,2,3,4,4,6,7};
    int target= 4;
    search(arr,target,0);
    System.out.println(list);

    
}

static ArrayList<Integer> list = new ArrayList<>();
static void search(int [] arr,int target, int index){
    if(index == arr.length){
        return ;
    }
    if(target == arr[index]){
        list.add(index);
     
    }
    search(arr,target,index+1);
}
}

