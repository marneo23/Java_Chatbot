import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
Scanner scanner = new Scanner(System.in);

        // Read the number of apples from the user
int apples = Integer.parseInt(scanner.next());

        // Read the number of oranges from the user
int oranges = Integer.parseInt(scanner.next());

        // Calculate the total number of fruits
int results = apples + oranges;

        // Print the result
System.out.println(results);
    }
}