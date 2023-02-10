package powtorka.IO.phone;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Green");

        mobile.call("1");
        mobile.call("2");
        mobile.call("3");
        mobile.call("3");
        mobile.call("3");
        mobile.call("3");
        mobile.call("3");
        mobile.call("5");
        mobile.call("3");
        mobile.call("3");
        mobile.call("3");
        mobile.call("2");
        mobile.call("3");
        mobile.call("7");

        System.out.println("\n\n----------\n");

        mobile.displayConnectionHistory();
    }
}
