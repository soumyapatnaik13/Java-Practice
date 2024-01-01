import java.util.*;
public class generic<T extends Number> {
       private Object[] arr;
    private static int Default_size= 10;
     int size=0; // index

    public generic(){
        this.arr=(T[]) new Object[Default_size]; // during the run time it will ask what is T that is why we take object class which is the root
        this.size=0;
         }
     public void add(T num){
       if(ssize()){
        resize();
       }
       arr[size]= num;
       size++;
     }
    private  boolean ssize(){
        return arr.length == size;
     }
    private void resize(){
        Object [] temp= (T[]) new Object[size *2];
        //copy the data into new array
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        // pointing the array into new array
        arr= temp;
     }
     public T remove(int index){
        T remove= (T) (arr[--size]);
        return remove;
     }
     public T get(int index){
        return (T)(arr[index]);
     }
    public int size(){
        return size;
    }
    public void set(int index,T value){
        arr[index]=value;
    }
    @Override
    public String toString(){
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
      
      generic<Integer> list = new generic<>();
      list.add(6);
      list.add(7);
      list.add(5);

      System.out.println(list);
    
    }
}
