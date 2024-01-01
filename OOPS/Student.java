public class Student {
   int rollnum;
   String name;
   static String collage="ITER";
  Student(int r, String name){
    this.rollnum=r;
    this.name=name;
  }

  void display(){
    System.out.println(rollnum+" "+name+" "+collage);
  }
    public static void main(String[] args) {
        Student s1= new Student(18,"Rahul");
        Student s2= new Student(12,"Ruchi");
        s1.display();
        s2.display();
    }

}
