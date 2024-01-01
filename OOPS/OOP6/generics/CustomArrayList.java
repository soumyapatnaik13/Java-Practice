import java.util.Arrays;

public class CustomArrayList{
     private int [] arr;
    private static int Default_size= 10;
     int size=0; // index

    public CustomArrayList(){
        this.arr= new int[Default_size];
     }
     public void add(int num){
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
        int [] temp= new int[size *2];
        //copy the data into new array
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        // pointing the array into new array
        arr= temp;
     }
     public int remove(){
        int remove= arr[--size];
        return remove;
     }
     public int get(int index){
        return arr[index];
     }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        arr[index]=value;
    }
    @Override
    public String toString(){
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
      
      CustomArrayList list = new CustomArrayList();
      list.add(4);
      list.add(5);
      list.add(7);
      list.add(7);
      list.add(9);
      list.add(6);
      list.add(87);
      list.add(6);
      list.add(8);
      list.add(7);
      list.add(7);
      

      System.out.println(list);
    
    }
}