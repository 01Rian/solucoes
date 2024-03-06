package Solucao05;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe uma palavra: ");
    String entrada = sc.nextLine();

    String palavra_invertida = inverteString(entrada);
    System.out.println(palavra_invertida);
    sc.close();
  }

  private static String inverteString(String palavra) {
    char[] caracteres = palavra.toCharArray();
    StringBuilder palavra_invertida = new StringBuilder();

    int length = palavra.length();

    for (int i = length; i > 0; i--) {
      palavra_invertida.append(caracteres[i - 1]);
    }

    return palavra_invertida.toString();
  }
}