class Employee
{
   int id;
   String name;
   public void Employee(int id, String name)
   {
       System.out.print(id + ": ");
       System.out.println(name);
   }
}
public class Class_Object {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.id=10;
        emp.name="Shafi";
        emp.Employee(10,"Shafi");

    }
}
