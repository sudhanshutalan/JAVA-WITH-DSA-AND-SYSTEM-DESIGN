//3.Use a private keyword for a variable and use setter and getter methods to initialise and print the values.

public class Question_3 {
    // Private variable
    private int employeeId;

    // Setter method
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter method
    public int getEmployeeId() {
        return employeeId;
    }

    public static void main(String[] args) {
        Question_3 emp = new Question_3();
        emp.setEmployeeId(101); // Setting the value
        System.out.println("Employee ID: " + emp.getEmployeeId()); // Getting the value, Outputs: 101
    }
}
