public class GreetingApp {
    public static void main(String[] args) {
        // Check if no arguments were provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Use an enhanced for loop (for-each) to process multiple names
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}