import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    double salario, perc, total;
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite seu salário");
    salario = ler.nextDouble();

    System.out.println("Digite o percentual de aumento:");
    perc = ler.nextDouble();

    total = salario * (perc/100+1);

    System.out.print("O total do salário é: " + total);
  }
}