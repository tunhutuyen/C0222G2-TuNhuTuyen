package ss15_xu_li_ngoai_le_va_debug.bai_tap;

public class TriangleExceptionCheck {
    public void checkTriangleException(int a, int b, int c) throws MyTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new MyTriangleException("Lỗi nhập vào bé hơn hoặc bằng 0");
        } else {
            if (a + b < c || a + c < b || b + c < a) {
                throw new MyTriangleException("2 cạnh nhập vào bé hơn cạnh còn lại!!!!!!!!!!");
            } else {
                System.out.println("Tam giác hợp lệ!!!");
            }
        }
    }
}
