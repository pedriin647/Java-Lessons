import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    String[] pedro = { "gosto de programar",
        "jogo videogame",
        "bebo uma breja geladinha",
        "nao namoro", "sofro bullying no ambiente de trabalho" };

    String[] alice = { "curiosidade1", "curiosidade2", "curiosidade3", "curiosidade4", "curiosidade5" };

    String escolha;

    System.out.println("Deseja ver dados sobre Pedro ou de Alice?");

    escolha = ler.next();

    if (escolha.equals("pedro")) {

      for (int i = 0; i < pedro.length; i++)
        System.out.print(pedro[i] + "\n");

    } else if (escolha.equals("alice")) {
      for (int i = 0; i < alice.length; i++)
        System.out.print(alice[i] + "\n");

    } else {
      System.out.print("Nome inválido! Tente novamente...");
    }

  }
}
