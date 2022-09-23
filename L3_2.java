import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    String tipoCombustivel;
    double saldo, total;

    System.out.println("Cálculo de preços:");
    System.out.println("Deseja abastecer gasolina, alcool ou diesel?");

    tipoCombustivel = ler.next();

    switch(tipoCombustivel){
      case "gasolina":
        System.out.println("Qual o valor em reais deseja abastecer?");
        saldo = ler.nextDouble();
        total = saldo / 4.75;
        System.out.println("Com a quantia informada é possível comprar "+total+" Litros");
        
        break;

       case "alcool":
        System.out.println("Qual o valor em reais deseja abastecer?");
        saldo = ler.nextDouble();
        total = saldo / 4;
        System.out.println("Com a quantia informada é possível comprar "+total+" Litros");
        break;

       case "diesel":
        System.out.println("Qual o valor em reais deseja abastecer?");
        saldo = ler.nextDouble();
        total = saldo / 3.50;
        System.out.println("Com a quantia informada é possível comprar "+total+" Litros");
        break;
    }

  }
}
