package pro.sky.Test24.exception;

public class ZeroException extends  ArithmeticException{
    public ZeroException() {
        super("на 0 делить нельзя");
    }
}
