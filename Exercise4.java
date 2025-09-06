import java.util.Scanner;
public class Exercise4 {
    public static void fahrenheitToCelsius(double fahrenheit){

        double celsius = (fahrenheit - 32) * 5/9;
        System.out.printf("The temperature in Celsius is: %.2f\n", celsius);
    }

    public static void celsiusToFahrenheit(double celsius){

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("The temperature in Fahrenheit is: %.2f\n", fahrenheit);
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        fahrenheitToCelsius(fahrenheit);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        celsiusToFahrenheit(celsius);
        sc.close();
    }
}
