package ss15_xu_li_ngoai_le_va_debug.bai_tap;

public class MyTriangleException extends Exception{
    public MyTriangleException() {
    }

    public MyTriangleException(String message) {
        super(message);
    }

    public MyTriangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyTriangleException(Throwable cause) {
        super(cause);
    }
}
