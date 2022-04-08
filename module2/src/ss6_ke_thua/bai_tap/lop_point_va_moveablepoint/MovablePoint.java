package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed,float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] array = {this.xSpeed,this.ySpeed};
        return array;
    }
    public MovablePoint move(){
        x +=xSpeed;
        y +=ySpeed;
        return this;
    }
    @Override
    public String toString() {
        return "MovablePoint{" +
                super.toString() +
                ", speed={ xSpeed" + xSpeed +
                ", ySpeed" + ySpeed +
                '}';
    }

}
