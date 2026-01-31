import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the temperature value: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the unit (C / F / K): ");
        char unit = sc.next().toUpperCase().charAt(0);

        // Conversion logic
        if (unit == 'C') {
            double fahrenheit = (temperature * 9 / 5) + 32;
            double kelvin = temperature + 273.15;

            System.out.println("\nTemperature in Fahrenheit: " + String.format("%.2f", fahrenheit) + " °F");
            System.out.println("Temperature in Kelvin: " + String.format("%.2f", kelvin) + " K");

        } else if (unit == 'F') {
            double celsius = (temperature - 32) * 5 / 9;
            double kelvin = celsius + 273.15;

            System.out.println("\nTemperature in Celsius: " + String.format("%.2f", celsius) + " °C");
            System.out.println("Temperature in Kelvin: " + String.format("%.2f", kelvin) + " K");

        } else if (unit == 'K') {
            double celsius = temperature - 273.15;
            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("\nTemperature in Celsius: " + String.format("%.2f", celsius) + " °C");
            System.out.println("Temperature in Fahrenheit: " + String.format("%.2f", fahrenheit) + " °F");

        } else {
            System.out.println("\nInvalid unit! Please enter C, F, or K.");
        }

        sc.close();
    }
}
