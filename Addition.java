/**
 * @author Shafee
 * @version 20
 * @see <a href = "www.google.com", target = "blank">google</a>
 * @since 2023
 */
//@FunctionalInterface
interface MyInterface{
    void Inter1();
    void Inter2();
}
class Addition1{
    /**
     *
     * @param a Variable 1
     * @param b Varialble 2
     * @return return the Addtion
     */
    @Deprecated
    public int Add(int a, int b){
        return a+b;
    }
}
public class Addition {
    /**
     *
     * @param args This is to instance the Argumnet
     */
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Addition1 a= new Addition1();
        a.Add(10,20);
        //Anonymous Class Example
        MyInterface m = new MyInterface() {
            @Override
            public void Inter1() {
                System.out.println("I am Inter 1");
            }
            @Override
            public void Inter2() {
                System.out.println("I am sout 2");
            }
        };
        m.Inter1();
        m.Inter2();

    }
}
