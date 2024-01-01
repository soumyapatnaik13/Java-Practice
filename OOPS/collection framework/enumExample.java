public class enumExample {
    enum week{
        monday,tuesday,wenesday,thursday,friday,saturday,sunday
    }
    public static void main(String[] args) {
        week today=week.monday;
        System.out.println(today);
          
        if(today==week.monday){
            System.out.println("this is monday");
        }

      for(week day : week.values()){
        System.out.println(day);
      }
    }
}
