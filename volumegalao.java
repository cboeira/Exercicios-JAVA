import java.util.Scanner;
import java.math.*;

public class exercicio1 {
  public static void main(String[] args) {
    int raio = Integer.parseInt(args[0]);
    int area = Integer.parseInt(args[1]);
    double volume = Math.PI*raio*2*area;
    System.out.println("Volume do galao: " + volume);
  }
}
