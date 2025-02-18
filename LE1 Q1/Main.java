
// Application class to test the inheritance
public class Main {
    public static void main(String args[]) {
        // Create an instance of Mother class
        Mother m = new Mother();
        m.show();  // Calling show() of Mother class

        // Create an instance of Child class
        Child ch = new Child();
        ch.show();  // Calling show() inherited from Mother class
    }
}
