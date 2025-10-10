interface Demo {
    int operator(int a, int b);
}

public class Lambdaexpression {
    public static void main(String[] args) {
        Demo addition = (a, b) -> a + b;
        Demo subtraction = (a, b) -> a - b;
        int result = addition.operator(5, 10);
        int result1 = subtraction.operator(10,6);
        System.out.println(result + " "+result1);
    }
}
