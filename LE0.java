public class Person {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Getter for age
    public int getAge() {
        return age;
    }
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person();
        person.setName("John");
        person.setAge(28);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
