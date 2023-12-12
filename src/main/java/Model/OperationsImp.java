package Model;

public class OperationsImp implements IOperations{

    @Override
    public double addition(double value1, double value2) {
        return value1+value2;
    }

    @Override
    public double subtract(double value1, double value2) {
        return  value1-value2;
    }

    @Override
    public double multiply(double value1, double value2) {
        return value1*value2;
    }

    @Override
    public double division(double value1, double value2) {
        return value1/value2;
    }
    
}
