package rahul.com;

public class Main implements engine,media,brake {
        
    @Override
   public void start(){
  System.out.println("i start like normalcar");
   }
   @Override
    public void stop(){
 System.out.println("i stop like a normal car");
    };

    @Override
    public void acc(){
System.out.println("i accelarate like a normal car");
    };
    
    
}

