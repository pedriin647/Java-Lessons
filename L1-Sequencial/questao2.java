import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    double altura, base,area,perimetro;
    Scanner ler = new Scanner(System.in);

    System.out.println("Informe a base do retângulo");
    altura = ler.nextDouble();

    System.out.println("Informe a altura do retângulo:");
    base = ler.nextDouble();
 
    area = base * altura;
    perimetro = base *2 + altura *2;
    System.out.print("O total da área é: " + area);
    System.out.print("O perímetro do retângulo é:" +perimetro);
  }
}
