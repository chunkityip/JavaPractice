package OOP;

public class Calculator {

    public int divide(int a , int b) throws DivisionByZeroException {
        if (b == 0) throw new DivisionByZeroException("b is zero");
        return a / b;
    }
}
