import java.util.Scanner;

public class exercicio1 {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite dois numeros diferentes:");
    int num1 = leitura.nextInt();
    int num2 = leitura.nextInt();
    if (num1 > num2) {
	System.out.println("Diferença:"+ (num1 - num2)); 
    } else if (num1 < num2) {
    	System.out.println("Diferença:"+ (num2 - num1)); 
    } else {
    	System.out.println("NUMEROS IGUAIS"); 
    	}
  }
}