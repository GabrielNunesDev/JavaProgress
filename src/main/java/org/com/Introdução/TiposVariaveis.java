package org.com.Introdução;

/*
1) Variável local
Uma variável declarada dentro do corpo de um método é chamada de variável local. Você consegue usar esta variável apenas dentro do método e outro método
na classe não terá conhecimento de que essa variável existe.

Uma variável local não pode ser definida como a palavra reservada "static".

2) Variável global
Uma variável declarada dentro da classe mas fora do corpo de um método, é chamada variável global. Não é declarada como como static.

É chamada variável global porque seu valor é especifico da instancia e não é compartilhado entre instâncias.

3) Variável estática
Uma variável que é considerada com static é chamada de variável estática. Ela não pode ser local. Você pode criar uma simples cópia de uma variável estática e
compartilhar entre todas as instancias na classe. A alocação de memória para variáveis estáticas acontece apenas uma vez enquanto a classe é carregada em memória.
*/


public class TiposVariaveis {

    int data = 50; //Variável global
    static int m = 100; // Variável estática
    void metodo() {
        int n = 90; // Variável local
    }
}