public class Main {
    public static void main(String[] args) {
        Calculator kalk = new Calculator();
        double c = kalk.add(5, 3.5);
        System.out.println("sum: " + c);

        double d = kalk.substract(8.0, 3.5);
        System.out.println("difference: " + d);
    }
}