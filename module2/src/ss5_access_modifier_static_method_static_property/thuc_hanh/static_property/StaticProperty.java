package ss5_access_modifier_static_method_static_property.thuc_hanh.static_property;

public class StaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("tokoda","kaka");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("mẹc","second");
        Car car3 = new Car("ấu đì","second-hand");
        System.out.print(Car.numberOfCar);
    }
}
