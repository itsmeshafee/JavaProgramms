class Square
{
    int area;
    int side;
    public void Square(){
        System.out.format("Area of %d is %d\n",side,side*side);
    }
    public int Perimeter(){
        return 4*side;
    }
}
public class Area_Perimeter {
    public static void main(String[] args) {
        Square sq=new Square();
        sq.side=10;
        sq.Square();
        System.out.println(sq.Perimeter());

    }
}
