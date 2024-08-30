//5.Write a program which has static block and constructor overloading,initialise variables using constructors and print it.

class Test {
    // Static block
    static {
        System.out.println("Static block is executed!");
    }

    // Instance variables
    private int number;
    private String text;

    // Constructor overloading

    // Constructor with no parameters
    public Test() {
        this.number = 0;
        this.text = "Default Text";
    }

    // Constructor with one parameter
    public Test(int number) {
        this.number = number;
        this.text = "Default Text";
    }

    // Constructor with two parameters
    public Test(int number, String text) {
        this.number = number;
        this.text = text;
    }

    // Method to display the values
    public void displayInfo() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }
}
class Question_5{
    public static void main(String[] args) {
        // Creating objects using different constructors
        Test obj1 = new Test();
        Test obj2 = new Test(42);
        Test obj3 = new Test(7, "Custom Text");

        // Displaying the values
        obj1.displayInfo();
        obj2.displayInfo();
        obj3.displayInfo();
    }
}

