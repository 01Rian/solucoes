package Solucao02;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe um número: ");

    int num = sc.nextInt();

    String resultado = fib(num);

    System.out.println(resultado);
    sc.close();
  }

  private static String fib(int numero) {
    if (numero == 0) return "0 pertence à sequência de Fibonacci.";
    
    int a = 0, b = 1;

    while (b < numero) {
      int temp = b;
      b = a + b;
      a = temp;
    }

    if (b == numero) {
      return numero + " pertence à sequência de Fibonacci.";
    } else {
      return numero + " não pertence à sequência de Fibonacci.";
    }
  }
}