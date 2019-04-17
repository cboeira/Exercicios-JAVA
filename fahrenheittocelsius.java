import java.util.Scanner;

public class exercicio1 {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite a temperatura em Fahrenheit:");
    int tempFahrenheit = leitura.nextInt();
    double tempCelsius = ((tempFahrenheit-32)*5) / 9;
    System.out.println("Temperatura em Celsius: " +tempCelsius);
  }
}