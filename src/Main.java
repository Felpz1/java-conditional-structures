import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

import static java.lang.IO.print;
import static java.lang.IO.println;

/**
 * LISTA DE EXERCÍCIOS IMPLEMENTADOS:
 * 1. negativoOuNao: Identifica sinais (positivo/negativo).
 * 2. imparOuPar: Checa paridade de números.
 * 3. numerosMultiplos: Verifica se dois números são múltiplos entre si.
 * 4. duracaoJogo: Calcula horas jogadas, tratando a virada de 24h.
 * 5. tabelaPreco: Menu interativo de lanchonete com soma de valores e Locale BR.
 * 6. intervaloDeNumeros: Valida se um número está entre 0 e 100 e em qual faixa.
 * 7. planoCartesiano: Identifica o quadrante de coordenadas X e Y.
 * 8. impostoRenda: Cálculo de tributação.
 */


//Este programa utiliza funcionalidades do Java 21 (JEP 455,463,477)
void main() {
    //Trocando local para que não haja erro na hora de utilizar ponto ou virgula
    Locale.setDefault(Locale.US);
    //Cria a variável de localidade para aplicar os padrões brasileiros (PT-BR)
    Locale bra = new Locale("pt", "br");
    //Cria o formatador de moeda que adiciona automaticamente o símbolo de "R$" onde será formatado apenas quando utilizar o println
    NumberFormat nf = NumberFormat.getCurrencyInstance(bra);
    Scanner input = new Scanner(System.in);

    int opcao;
    do {
        //Classes de declaração implicita (Println)
        println("\n\nEscolha o exercício para testar");
        println("1 - Negativo ou Não");
        println("2 - Número ímpar ou par");
        println("3 - Números Múltiplos");
        println("4 - Duração de Jogo");
        println("5 - Tabela de preços");
        println("6 - Intervalos");
        println("7 - Coordenadas / quadrantes");
        println("8 - Imposto de Renda");
        println("0 - Sair");

        opcao = input.nextInt();
        input.nextLine();

        //Utilizando SwitchCase para selecionar o exercício solucionado
        switch (opcao) {
            case 1 -> negativoOuNao(input);
            case 2 -> imparOuPar(input);
            case 3 -> numerosMultiplos(input);
            case 4 -> duracaoJogo(input);
            case 5 -> tabelaPreco(input, nf);
            case 6 -> intervaloDeNumeros(input);
            case 7 -> planoCartesiano(input);
            case 8 -> impostoRenda(input, nf);
        }
    } while (opcao != 0);
}


//Métodos
//Exercício 1
public static void negativoOuNao(Scanner input) {
    println("Digite número: ");
    int n = input.nextInt();
    if (n < 0) {
        println("Negativo");
    } else {
        println("Positivo");
    }
}

//Exercício 2
public static void imparOuPar(Scanner input) {
    println("Digite o número: ");
    int n = input.nextInt();

    if (n % 2 == 0) {
        println("Par");
    } else {
        println("Ímpar");
    }
}

//Exercício 3
public static void numerosMultiplos(Scanner input) {
    println("Verificando se são números múltiplos.");
    println("Digite o primeiro número:");
    int n1 = input.nextInt();
    println("Digite o segundo número:");
    int n2 = input.nextInt();

    //Verificando se são múltiplos entre si
    if (n1 % n2 == 0 || n2 % n1 == 0) {
        println("São múltiplos");
    } else {
        println("Não são múltiplos");
    }
}

//Exercício 4
public static void duracaoJogo(Scanner input) {
    println("Digite a hora inicial: ");
    int hinicial = input.nextInt();
    println("Digite a hora final: ");
    int hfinal = input.nextInt();


    int duracao;

    if (hinicial < hfinal) {
        duracao = hfinal - hinicial;
        println("O jogo durou " + duracao + "horas(s)");
    } else {
        duracao = 24 - hinicial + hfinal;
        println("O jogo durou " + duracao + "Horas(s)");
    }
}

//Exercício 5
public static void tabelaPreco(Scanner input, NumberFormat nf) {

    //As variáveis devem ser definidas antes do loop para que não que não seja zerado os valores.
    int op;
    double valor, totalvalor = 0;
    do {

        println("###SELECIONE O ITEM PARA ADICIONAR###");
        println("1 - Cachorro Quente");
        println("2 - X-Salada");
        println("3 - X-Bacon");
        println("4 - Torrada simples");
        println("5 - Refrigerante");
        println("0 - Encerrar");
        op = input.nextInt();

        if (op == 1) {
            valor = 4;
            totalvalor = totalvalor + valor;
            println("Total a pagar: " + nf.format(totalvalor));
        } else if (op == 2) {
            valor = 4.50;
            totalvalor = totalvalor + valor;
            println("Total a pagar: " + nf.format(totalvalor));
        } else if (op == 3) {
            valor = 5.00;
            totalvalor = totalvalor + valor;
            println("Total a pagar: " + nf.format(totalvalor));
        } else if (op == 4) {
            valor = 2.00;
            totalvalor = totalvalor + valor;
            println("Total a pagar: " + nf.format(totalvalor));
        } else if (op == 5) {
            valor = 1.5;
            totalvalor = totalvalor + valor;
            println("Total a pagar: " + nf.format(totalvalor));
        }

    } while (op != 0);

}

//Exercício 6
public static void intervaloDeNumeros(Scanner input) {
    println("Digite o valor: ");
    int valor = input.nextInt();

    //Confere o intervalo do valor
    if (valor < 0 || valor > 100) {
        println("Intervalo inválido");
    } else if (valor <= 25) {
        println("Intervalo: (0,25)");
    } else if (valor <= 50) {
        println("Intervalo: (25,50");
    } else if (valor <= 75) {
        println("Intervalo: (50,75");
    } else {
        println("Intervalo: (75,100");
    }
}

//Exercício 7
public static void planoCartesiano(Scanner input) {
    int x, y;
    println("Digite as coordenadas: \n" + "X: ");
    x = input.nextInt();
    println("Y: ");
    y = input.nextInt();

    if (x > 0 && y > 0) {
        println("Q1");
    } else if (x < 0 && y > 0) {
        println("Q2");
    } else if (x < 0 && y < 0) {
        println("Q3");
    } else if (x > 0 && y < 0) {
        println("Q4");
    }
}

//Exercício 8
public static void impostoRenda(Scanner input, NumberFormat nf) {
    double renda;
    println("Digite sua renda mensal: ");
    renda = input.nextDouble();
    double impostoDeRenda;

    if (renda <= 2000.00) {
        impostoDeRenda = 0.0;
    } else if (renda <= 3000.00) {
        impostoDeRenda = (renda - 2000.00) * 0.08;
    } else if (renda <= 4500.00) {
        impostoDeRenda = (1000 * 0.08) + (renda - 3000.01) * 0.18;
    } else {
        impostoDeRenda = (1000 * 0.08) + (1500.00 * 0.18) + (renda - 4500) * 0.28;
    }

    //Verificando se possui imposto de renda
    if (impostoDeRenda == 0.0) {
        println("Isento!");
    } else {
        println(nf.format(impostoDeRenda) + " De imposto para pagar!");
    }

    /** Opcional: Pattern Matching (Não recomendado)
     * double impostoDeRenda = switch (renda) {
     * case double r when r <= 2000.00 -> 0.0;
     * case double r when r <= 3000.01 -> (r - 2000.00) * 0.08;
     * case double r when r <= 4500.00 -> (1000.00 * 0.08) + (r - 3000.01) * 0.18;
     * case double r when r > 4500 -> (1000.00 * 0.8) + (1500.00 * 0.18) + (r - 4500.00) * 0.28;
     * default -> 0.0;
     * };
     */
}



