class NegetiveRadiusException extends Exception{
    @Override
    public String toString() {
        return "Cannot be Negetive";
    }

    @Override
    public String getMessage() {
        return "Cannot be Negetive";
    }
}
public class ThrowsException {

    public static double area(int r) throws NegetiveRadiusException {
        if (r<0){
            throw new NegetiveRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static void main(String[] args)  {
        try {
            double ar = area(1);
            System.out.println(ar);
        } catch (NegetiveRadiusException e) {
            System.out.println(e);
        }

    }
}
