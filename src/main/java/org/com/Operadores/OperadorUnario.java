package org.com.Operadores;

/*
Os operadores unários requerem apenas um operando. Operadores unários são usados para executar várias operações, ou seja:
Incrementando / decrementando um valor em um
Negando uma expressão
Invertendo o valor de um boolean
*/
public class OperadorUnario {
    public static void main (String args []) {
        int x = 10;
        System.out.println (x++); // 10 (11)
        System.out.println (++x); // 12
        System.out.println (x--); // 12 (11)
        System.out.println (--x); // 10
    }
}
