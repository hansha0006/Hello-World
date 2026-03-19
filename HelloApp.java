public class HelloApp {
    public static void main(String[] args) {
        // Check if an argument was provided
        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}