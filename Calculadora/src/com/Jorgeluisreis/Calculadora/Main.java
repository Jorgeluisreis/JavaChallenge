/*
 *  Crie um programa que solicite ao usuário dois números inteiros e uma operação matemática
 * (soma, subtração, multiplicação ou divisão). O programa deve exibir o resultado da operação.
 * 
 * Comportamento do programa:
 * O programa solicita dois números inteiros e uma operação ao usuário.
 * Dependendo da operação escolhida, o programa realiza o cálculo e exibe o resultado.
 * Caso a operação seja divisão por zero, o programa deve exibir uma mensagem de erro.
 * 
 */

package com.Jorgeluisreis.Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        boolean menuAtivo = false;
        char operacao = ' ';
        int n1 = 0;
        int n2 = 0;

        do {
            try {
                System.out.printf("Digite o primeiro número: ");
                n1 = read.nextInt();

                System.out.printf("Digite o segundo número: ");
                n2 = read.nextInt();
                read.nextLine();

                System.out.printf("Escolha qual operação deseja fazer (+, - , * , /): ");
                operacao = read.nextLine().charAt(0);

                menuAtivo = true;

            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números inteiros.");
                read.nextLine();
                menuAtivo = false;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                menuAtivo = false;

            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Erro: Nenhuma operação foi informada.");
                menuAtivo = false;
            }

        } while (!menuAtivo);

        switch (operacao) {
            case '+':
                System.out.printf("O resultado da soma de %d + %d é %d.\n", n1, n2, n1 + n2);
                break;
            case '-':
                System.out.printf("O resultado da subtração de %d - %d é %d.\n", n1, n2, n1 - n2);
                break;
            case '*':
                System.out.printf("O resultado da multiplicação de %d * %d é %d.\n", n1, n2, n1 * n2);
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("Erro: Não é permitido divisão por 0.");
                } else {
                    System.out.printf("O resultado da divisão de %d / %d é %d.\n", n1, n2, n1 / n2);
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        read.close();
    }
}
