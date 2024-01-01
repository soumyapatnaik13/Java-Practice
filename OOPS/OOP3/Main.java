public class Main {
    public static void main(String[] args) {
    //    Box box=new Box(4.6,7.8,9.6);
   //     Box box2= new Box(box);
   //     System.out.println(box2.l+" "+box2.h+" "+box2.w);
       Boxweight b1=new Boxweight();
       System.out.println(b1.h + " "+b1.weight);
      Boxweight b2= new Boxweight(2, 4, 3, 2);
       System.out.println(b2.h + " "+b2.weight+" "+b2.w+" "+b2.l);
      Boxweight b3= new Boxweight(4,4);
      System.out.println(b3.l);
      Boxprice b= new Boxprice(2, 2, 4, 8, 9);
        System.out.println(b.cost);
    }
}
