package org.com.Introdução;

/*
Antes do unicode, havia muitos padrões de linguagem:

ASCII (American Standard Code for Information Interchange / Código Padrão Americano para Intercâmbio de Informações) para o Estados Unidos.
ISO 8859-1 para para a linguagem da Europa Ocidental.
KOI-8 para Russia.
GB18030 e BIG-5 para chineses, e assim por diante.

Isto causou dois problemas:
Um valor de código específico corresponde a letras diferentes nos vários padrões de idioma.
As codificações para as linguagens com grandes conjuntos de caracteres tem comprimento variável. Alguns caracteres comuns são codificados como bytes únicos, outros requerem
dois ou mais bytes.

Para solucionar esses problemas, um novo padrão de linguagem foi desenvolvido, isto é o sistema unicode. No unicode, o caractere contém 2 bytes, portanto o java também usa
2 bytes para caracteres.
Valor mais baixo: \u0000
Valor mais alto: \uFFFF
*/
public class SistemaUnicode {

    public static void main(String[] args) {

        // Exemplo de Unicode para o caractere 'A' maiúsculo
        char unicodeChar = '\u0041';

        System.out.println("Unicode para 'A': " + unicodeChar);

        // Exemplo de Unicode para o caractere 'é' com acento agudo
        char unicodeCharAccent = '\u00E9';

        System.out.println("Unicode para 'é': " + unicodeCharAccent);

        // Exemplo de Unicode para o caractere japonês 'こんにちは' (Olá em japonês)
        String unicodeString = "\u3053\u3093\u306B\u3061\u306F";

        System.out.println("Unicode para 'こんにちは': " + unicodeString);
    }
}
