//2.Write a program and create a constructor with parameters and initialise the variable using a constructor.

class Question2 {
    private String name;
    private int age;

    // Constructor with parameters
    public Question2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object with parameters
        Question2 person = new Question2("Alice", 25);
        person.displayInfo(); // Outputs: Name: Alice, Age: 25
    }
}
