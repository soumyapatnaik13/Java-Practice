public class constructer{
    public static void main(String[] args) {
        Student s1= new Student(13,"rahul",89f);
        
      //  s1.marks= 18;
     //   s1.name="Rahul";
     //   s1.marks=19f;
        System.out.println(s1.marks);
        System.out.println(s1.name);
        System.out.println(s1.marks);
    }
    class Student{
        int rollnum;
        String name;
        float marks;
        Student(int num,String name,float marks){
            this.rollnum=num;//s1.roolno
            this.name=name;
            this.marks=marks;

        }
    }
}