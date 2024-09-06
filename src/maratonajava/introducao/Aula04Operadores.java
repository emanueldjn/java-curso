package src.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // +, -, /, *, %;
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero02 + numero01;
        // Resultado de operação entre nos int sempre é int
        System.out.println(resultado);
        System.out.println("O valor da soma é: " + numero01 + numero02);


        // operador de resto %
        int resto = 20 % 2;
        System.out.println(resto);

        // op logicos = true or false, < menor que | > maior que | <=, >=, ==, !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        System.out.println("isDezMaiorQueVinte = " +isDezMaiorQueVinte); // false
        System.out.println("isDezMenorQueVinte = " +isDezMenorQueVinte); // true
        System.out.println("isDezIgualQueVinte = " +isDezIgualQueVinte); // False
        System.out.println("isDezMenorQueVinte = " +isDezMenorQueVinte);

        // && (AND) || (or) || !
        int idade = 20;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        // temos uma conta e o objetivo é comprar um PLAY5:
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPLaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPLaystationCincoCompravel: " +isPLaystationCincoCompravel);


        // Operador atribuição: =, +=, -=, *=, /=, %=
        // fazer um sistema para add um valor de 1000 reais ao bonus
        double bonus = 1800;
        bonus += 1000;
        bonus -= 800;
        bonus *= 2;
        System.out.println(bonus);

        // incremento ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++;
        contador--;
        ++contador; // primeiro incrementar e depois executar
        --contador;

        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);
    }
}
