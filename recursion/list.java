import java.util.*;
public class list {
    public static void main(String[] args) {
            int [] arr = {1,2,3,4,4,5,6};
            int target = 4;
            ArrayList<Integer>ans=findelements(arr,target,0,new ArrayList<>());
            System.out.println(ans);
    
        }
        static ArrayList<Integer> findelements(int[] arr,int target,int index,ArrayList<Integer>list){
            if(index == arr.length) {
                return list;
            }
            if(arr[index]== target) {
                list.add(index);
            }
            return findelements(arr,target,index+1,list);
        }
        
    }

