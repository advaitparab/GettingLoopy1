import java.util.Scanner;
public class FtoC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;
        while (true) {
            try {
                System.out.println("Enter fahrenheit temperature: ");
                fahrenheit = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: invalid number");
            }
        }
        celsius = (fahrenheit- 32)/1.8;
        System.out.printf("%.2f F = %.2f C\n",fahrenheit,celsius);
    }
}
