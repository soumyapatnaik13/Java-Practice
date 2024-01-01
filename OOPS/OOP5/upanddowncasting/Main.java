class Vehicle{
    void start(){
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle{
    void aceelarate(){
        System.out.println("vehicle is accelarating");
    }
}
class Bicycle extends Vehicle{
    void pedal(){
        System.out.println("bicycle is paddling");
    }
}
 class main{
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBicycle= new Vehicle();

    myCar.start();
    myBicycle.start();

    if(myCar instanceof Car){
        Car myRealcar = (Car) myCar;
        myRealcar.aceelarate();
    }
    if(myBicycle instanceof Bicycle){
        Bicycle myRealbicycle = (Bicycle) myBicycle;
        myRealbicycle.pedal();
    }
    }
 }
