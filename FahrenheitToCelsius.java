import java.util.Scanner;
public class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
        float fahrenheit;
        float celsius;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter the temperature in fahrenheit to convert to celsius >>");
        fahrenheit = inputDevice.nextInt();
        celsius = (fahrenheit - 32) * 5/9;
        inputDevice.nextLine();
        System.out.print("The temperature would be " + celsius + " degrees celsius");
    }
}