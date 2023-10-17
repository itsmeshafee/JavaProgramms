class Cylinder{
    private int radius;
    private int height;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double Area()
    {
        return Math.PI*radius*radius*height;
    }
}
public class OOPS_Practise {
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.setRadius(20);
        c.setHeight(12);
        System.out.println(c.getRadius());
        System.out.println(c.getHeight());
        System.out.println(c.Area());

    }
}
