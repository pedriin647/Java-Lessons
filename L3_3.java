import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

  double valorCompra, total;
  String tipoCompra;
  int    qtdPrestacao;
  
  System.out.println("Cálculo de prestações:");
  System.out.println("Irá fazer a compra a prazo ou a vista?");
  tipoCompra = ler.next();

  if(tipoCompra.equals("prazo")){
    System.out.println("Qual o valor da compra?");
    valorCompra = ler.nextDouble();
    System.out.println("Quantas prestações?");
    qtdPrestacao = ler.nextInt();
    total = valorCompra + (20*valorCompra / 100);
    System.out.println("O total da compra a prazo é de: "+total);
    System.out.println("O valor de cada prestacao é: "+total/qtdPrestacao);
    
  }else if(tipoCompra.equals("vista")){
    System.out.println("Qual o valor da compra?");
    valorCompra = ler.nextDouble();
    total = valorCompra - (10*valorCompra /100);
    System.out.println("O total da compra com desconto é: "+total);
  }else{
    System.out.print("Dados Inválidos!");
  }
    
  }
}
