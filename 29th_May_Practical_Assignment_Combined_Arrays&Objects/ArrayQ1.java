
class Calculator{
    
    int add(int a, int b){
        return (a+b);
    }
    int add(int a, int b, int c){
        return (a+b+c);
    }

    double add(int a, double b, float c){
        return (a+b+c);
    }

}


public class ArrayQ1 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int a = 20, b=25, c= 76;
        double x=20.55;
        float d=45.5f;

        System.out.println(a+" + "+b+" = "+calc.add(a,b));
        System.out.println(c+" + "+x+" + "+ d+ " = "+calc.add(c,x,d));
        System.out.println(a+" + "+b+" + "+c+" = "+calc.add(a,b,c));
    }
}
