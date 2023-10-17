class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Invalid input";
    }
}
class CannotDividebyZero extends Exception{

    @Override
    public String toString() {
        return "Cannot Divide by Zero";
    }
}
class CustomCalculator{
    public double addition (double a, double b) throws InvalidInputException{
        if (a==8 || b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    public double subtraction(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double division(double a, double b) throws CannotDividebyZero{
        if (b==0){
            throw new CannotDividebyZero();
        }
        return a/b;
    }
}
public class CalculatorApp {
    public static void main(String[] args) throws InvalidInputException, CannotDividebyZero {

        CustomCalculator c = new CustomCalculator();
       // c.addition(8,9);
        c.division(6,0);

    }
}
