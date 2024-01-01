enum Dayweeks{
    SUNDAY("Sun"),
    Monday("mon"),
    TUESDAY("tue"),
    WEDNESDAY("wed"),
    THRUSDAY ("thursday"),
    FRIDAY ("friday"),
    SATURDAY ("sat");
    private String abrevation;

    Dayweeks(String abrevation){
     this.abrevation=abrevation;
    }
    public String get(){
        return abrevation;
    }

}

public class week {
    public static void main(String[] args) {
        Dayweeks today= Dayweeks.WEDNESDAY;
        System.out.println(today + " "+ today.get());
        
    }
}
