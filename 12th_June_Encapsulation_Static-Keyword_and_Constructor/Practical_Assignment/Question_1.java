//1.Create a class that keeps track of the number of instances created. Implement a static variable and method to accomplish this.

public class Question_1 {
    private static int instanceCount = 0;

	public Question_1() {
		instanceCount++;
	}

	public static int getInstanceCount() {
		return instanceCount;
	}

	public static void main(String[] args) {
		Question_1 c1 = new Question_1();
		Question_1 c2 = new Question_1();
		Question_1 c3 = new Question_1();
		System.out.println("Number of instances created: " + Question_1.getInstanceCount());
	}

}
