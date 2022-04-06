package ss4_LopVaDoiTuongTrongJava.bai_tap;

import java.util.Arrays;

public class Fan {
    private final byte SLOW = 1;
    private final byte MEDIUM = 2;
    private final byte FAST = 3;
    private int speed = SLOW;
    private boolean on =false;
    private double radius = 5;
    private String color = "blue";

    public Fan(){

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }
    public void setOn(boolean on){
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan{ Fan is on " +
                    "speed=" + this.speed +
                    ", radius=" + this.radius +
                    ", color='" + this.color + '\'' +
                    '}';
        }else {
            return "Fan{ Fan is off " +
                    "speed=" + this.speed +
                    ", radius=" + this.radius +
                    ", color='" + this.color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.getRadius();
        fan2.getColor();
        fan2.getOn();
        System.out.println(fan2);

    }
}
