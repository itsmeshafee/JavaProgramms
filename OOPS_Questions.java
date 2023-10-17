class Employee1
{
    int salary;
    String name;
    public void setSalary(int sal){
        salary=sal;
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    
}
public class OOPS_Questions {
    public static void main(String[] args) {
        Employee1 Emp=new Employee1();
        Emp.setName("Shafi");
        Emp.name="Shafee";
        Emp.salary=20000;
        Emp.setSalary(30000);
        System.out.println(Emp.getName());
        System.out.println(Emp.getSalary());

    }
}
