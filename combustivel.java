import java.util.Scanner;

public class exercicio1 {
  public static void main(String[] args) {
    int kmL = 12;
    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite o tempo de viagem:");
    int tempoTotal = leitura.nextInt();
    System.out.println("Digite a velocidade média:");
    int velMedia= leitura.nextInt();
    int distancia = tempoTotal * velMedia;
    double litrosUsados = distancia / 12;
    System.out.println("Velocidade média: "+ velMedia); 
    System.out.println("Tempo de viagem: "+ tempoTotal); 
    System.out.println("Distância percorrida: "+ distancia); 
    System.out.println("Quantidade de litros de combustível utilizado: "+ litrosUsados); 
  }
}