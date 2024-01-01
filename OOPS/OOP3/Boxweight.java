public class Boxweight extends Box {
  double weight;
    public Boxweight(){
        this.weight= -1;
    }
    public Boxweight(double l, double h, double w,double weight){
     super(l,h,w); // call the parents class constructer

// used to initialise values present in parents class

      this.weight = weight;
      
    }
    public Boxweight(double l,double weight){
              this.weight = weight;
              this.l=l;

    }



        
    }

