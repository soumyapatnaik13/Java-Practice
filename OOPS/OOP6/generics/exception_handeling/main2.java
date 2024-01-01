class myexception extends Exception{
    myexception(String message){
    super(message);

    }
}

public class main2 {
    public static void main(String[] args) throws myexception {
        String name="rahul";
        try{
        if(name.equals("rahul")){
            throw new myexception("yes thats my name");
        }
    }catch(myexception e){
            System.out.println(e.getMessage());

        }
    }
    
}
