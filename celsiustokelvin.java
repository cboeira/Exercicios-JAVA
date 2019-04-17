import java.util.Scanner;

public class exercicio1 {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite a temperatura em Celsius:");
    int tempCelsius = leitura.nextInt();
    double tempKelvin = (tempCelsius + 273.15);
    System.out.println("Temperatura em Kelvin :" +tempKelvin);
  }
}