public class Simple {
    
    // Simple method to greet
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
    
    // Simple method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Main method
    public static void main(String[] args) {
        System.out.println(greet("World"));
        System.out.println("5 + 3 = " + add(5, 3));
    }
}
