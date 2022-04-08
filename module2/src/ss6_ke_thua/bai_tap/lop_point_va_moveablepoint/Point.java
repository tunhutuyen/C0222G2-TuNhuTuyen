package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class Point {
        protected float x = 0.0f;
        protected float y = 0.0f;

        public Point() {
        }

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }
    public void setY(float y) {
        this.y =y ;
    }
        public float[] getXY(){
            float[] array = {this.x,this.y};
            return array;
        }
        public void setXY(float x, float y){
            this.x =x;
            this.y =y;
        }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

