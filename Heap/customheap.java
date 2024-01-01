import java.util.ArrayList;

public class customheap {
    public static void main(String[] args) throws Exception {
        Heap <Integer> heap= new Heap<>();
        heap.insertElements(34);
        heap.insertElements(45);
        heap.insertElements(23);
        heap.insertElements(89);
        heap.insertElements(76);
        ArrayList l= heap.hashSort();
        System.out.println(l);
    }
}
