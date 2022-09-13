import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    double nota1,nota2,nota3,resultado;
    Scanner ler = new Scanner(System.in);

    System.out.println("Informe a primeira nota:");
    nota1 = ler.nextDouble();

    System.out.println("Informe a segunda nota:");
    nota2 = ler.nextDouble();

    System.out.println("Informe a terceira nota:");
    nota3 = ler.nextDouble();

    resultado = nota1 + nota2 + nota3 /3;
   
    System.out.print("A média das notas é:" +resultado);
  }
}

