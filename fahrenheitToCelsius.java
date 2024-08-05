import java.util.Scanner;

public class fahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("  Welcome to temperature measurement  ");
        System.out.print("Enter the temperature in Fahrenheit : ");
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature in Celsius is : " + celsius);
        input.close();
        System.out.println("Thank you for using this program!");
    }
}
