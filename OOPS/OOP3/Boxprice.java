public class Boxprice extends Boxweight {
    double cost;
    Boxprice(){
        super();
        this.cost=1;
    }
    
    Boxprice(double l,double h,double w,double Boxweight,double cost){
        super(l,h,w,Boxweight);
        this.cost=cost;

    }
}
