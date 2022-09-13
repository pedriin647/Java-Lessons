import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    double salarioBase, resultado;
    Scanner ler = new Scanner(System.in);

    System.out.println("Informe seu salário Base:");
    salarioBase = ler.nextDouble();
    

    resultado = salarioBase + salarioBase*0.25;
   
    System.out.print("Salário a receber:" +resultado);
  }
}
