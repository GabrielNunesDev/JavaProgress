package org.com.Operadores;

/*
O operador Java left shift << é usado para mudar todos os bits de um valor para o lado esquerdo de um número especificado de vezes.

O operador Java right shift >> é usado para mover os operandos da esquerda para a direita pelo número de bits especificado pelo operando da direita.
 */
public class OperadorShiftDirEsq {
    public static void main (String args []) {

        System.out.println (10 << 2); // 10 * 2 ^ 2 = 10 * 4 = 40
        System.out.println (10 << 3); // 10 * 2 ^ 3 = 10 * 8 = 80

        System.out.println (10 >> 2); // 10 / 2 ^ 2 = 10 / 4 = 2
        System.out.println (20 >> 2); // 20 / 2 ^ 2 = 20 / 4 = 5
    }
 }
