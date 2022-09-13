import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    double salarioBase, resultado;
    Scanner ler = new Scanner(System.in);

    System.out.println("Informe seu salário Base:");
    salarioBase = ler.nextDouble();
    

    resultado = salarioBase *0.9 +50;
   
    System.out.print("Salário a receber:" +resultado);
  }
}
