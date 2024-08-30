//4.Write a program to call a method without creating an object of a class.
class Question_4 {
    // Static method
    public static void displayMessage() {
        System.out.println("This is a static method!");
    }

    public static void main(String[] args) {
        // Calling the static method without creating an object
        Question_4.displayMessage(); // Outputs: This is a static method!
    }
}

