package Ex3;

import java.util.Scanner;

public class Saldo {
   public static void main(String[] args) {
      Scanner insira = new Scanner(System.in);
      System.out.println("Digite o saldo a ser corrigido:");
      Double saldo = insira.nextDouble();
      Double reajuste = saldo*1/100;
      Double resultado = saldo-reajuste;
      System.out.printf("O saldo com reajuste fica: %.2f",resultado);
   }
}
