import java.util.Random;
import java.util.Scanner;

class MyEmployee
{
    private int id;
    private String name;
    public MyEmployee(){
        id=45;
        name="Shafee";
    }
    public MyEmployee(int i, String n)
    {
        id=i;
        name=n;
    }
    public MyEmployee(String n){
        id=20;
        name=n;
    }
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}
public class GetSetMethod {
    public static void main(String[] args) {
        MyEmployee shafi=new MyEmployee();
        System.out.println(shafi.getName());
        System.out.println(shafi.getId());
        MyEmployee sha=new MyEmployee(26,"Shafi");
        System.out.println(sha.getName());
        System.out.println(sha.getId());
        MyEmployee sh=new MyEmployee("Shafiq");
        System.out.println(sh.getName());
        System.out.println(sh.getId());

//        shafi.setName("Shafi");
//        shafi.setId(226);
//        System.out.println(shafi.getName());
//        System.out.println(shafi.getId());
//        Scanner sc= new Scanner(System.in);
//        Random random = new Random();
//        int p=random.nextInt(3);
//        System.out.println(p);


    }

}
