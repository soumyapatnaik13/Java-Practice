 import java.util.ArrayList;
 class Heap <T extends Comparable <T>> {
    ArrayList <T> list;

    Heap(){
        list= new ArrayList<>();
    }

    public void swap(int start, int end){
        T temp= list.get(start);
        list.set(start,list.get(end));
        list.set(end,temp);
    }
    public int parents(int index){
        return index/2;
    }
    public int leftChild(int index){
        return index*2+1;
    }
    public int rightChild(int index){
        return  index*2+2;
    }

    public void insertElements(T value){
      list.add(value);
      upheap(list.size()-1); //it will cheack from the end of that root
    }
    public void upheap(int i){
     if(i==0){
        return;
     }
     int p= parents(i);
     if(list.get(i).compareTo(list.get(p)) <0){
         swap(i,p);
         upheap(p);
     }
    }
    public T deleteAnElement() throws Exception{
        if(list.isEmpty()){
            throw new Exception("removing from an empty heap");
        }
        T temp= list.get(0);
        T last= list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0, last);
            downheap(0);

        }

        return temp;
    }
    public void downheap(int last){
      int min=last;
      int left= leftChild(last);
      int right = rightChild(last);
      if(list.get(min).compareTo(list.get(left))>0){
         min = left;
      }
       if(list.get(min).compareTo(list.get(right))>0){
         min = right;
      }
      if(min != last){
        swap(min, last);
        downheap(min);
      }
    }
    public ArrayList<T> hashSort() throws Exception{

       ArrayList<T> li = new ArrayList<>();
       while(!list.isEmpty()){
        li.add(this.deleteAnElement());
       }
        

       return li;
    }
}
