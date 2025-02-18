// Application class to test the inheritance and method overriding
public class Main {
    public static void main(String args[]) {
        // Create an instance of Mother class
        Mother m = new Mother();
        m.show();  // Calling show() of Mother class, which displays "Hello World"

        // Create an instance of Child class
        Child ch = new Child();
        ch.show();  // Calling show() of Child class, which displays "Hello JUET"
    }
}
