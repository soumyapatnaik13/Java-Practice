class Human implements Cloneable {
    int age;
    String name;
    Human(int age,String name){
        this.age= age;
        this.name=name;
    }
    Human(Human other){
        this.age=other.age;
        this.name=other.name;
    }
    public Object clone() throws CloneNotSupportedException{
   return super.clone();
    }

}

public class clon {
    

    public static void main(String[] args) throws CloneNotSupportedException {
        Human rahul= new Human(18,"rahul");
        Human twin= (Human)rahul.clone();
         System.out.println(twin.age);
    }
}
