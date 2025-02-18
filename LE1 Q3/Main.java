// Application class to test the inheritance and method overriding
public class Main {
    public static void main(String args[]) {
        // Create an instance of Mother class
        Mother m = new Mother();
        m.show();  // Calling show() of Mother class, which displays "Hello World"

        // Create an instance of Child class
        Child ch = new Child();
        ch.show();  // Calling show() of Child class, which displays "Hello JUET"

        // Create a Mother reference pointing to a Child object
        Mother m1 = new Child();
        m1.show();  // Calling show() through Mother reference pointing to Child object
    }
}
