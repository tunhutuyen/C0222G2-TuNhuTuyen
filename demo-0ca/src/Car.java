public class Car extends Vehice {
    String trans;



    public Car(String trans) {
        this.trans = trans;
    }

    public Car(String type, int maxSpeed, String trans) {
//        this(trans) = trans;
        super(type, maxSpeed);
        this.trans = trans;
    }

    public static void main(String[] args) {
//        Car c1 = new Car("auto");
        Car c2 = new Car("4w",150,"manual");
//        System.out.println(c1.type + " " + c1.maxSpeed +" "+ c1.trans);
        System.out.println(c2.type + " " + c2.maxSpeed +" "+ c2.trans);
    }
}
