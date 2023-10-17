interface MyCamera {
    void takeSnap();

    void recordVideo();

    private void greet() {  //we don't use private
        System.out.println("Good Morning");
    }

    default void record4KVideo() {
        greet();    //because private is not used so we call this
        System.out.println("Record 4k Video..");
    }
}
interface MyWifi{
        String[] getNetWorks();
        void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phonenumber){
        System.out.println("Calling" + phonenumber);
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi{
    @Override
    public void takeSnap() {
        System.out.println("Taking a Snap");
    }

//    @Override
//    public void record4KVideo() {
//        System.out.println("Alternate"); //this is will override in rum
//    }

    @Override
    public void recordVideo() {
        System.out.println("Record Video");
    }

    @Override
    public String[] getNetWorks() {
        System.out.println("Getting List of Networks");
        String[] networks = {"Shafee", "Dhiva", "Nanda"};
        return networks;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Your Network is: " + network);
    }
}
public class Inheritance_default {
    public static void main(String[] args) {
        MySmartPhone ph = new MySmartPhone();
        ph.connectToNetwork("Airtel");
        ph.getNetWorks();
        ph.recordVideo();
        ph.takeSnap();
        ph.callNumber(97008618);
        ph.record4KVideo();


    }
}
