import java.util.Scanner;

public class exercicio1 {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite a temperatura em Celsius:");
    int tempCelsius = leitura.nextInt();
    double tempFahrenheit = (9 * tempCelsius + 160) / 5;
    System.out.println("Temperatura em Fahrenheit :" +tempFahrenheit);
  }
}