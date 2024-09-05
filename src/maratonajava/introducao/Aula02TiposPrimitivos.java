package src.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        /* Tipos que vão guardar em memoria um valor simples
            int, double, float, char, byte, short, long, boolean
        */
        int idade = 10; // valor guardado em memoria; 4 bytes
        int idadeDois = (int) 10000000000L; // fazendo um casting(forçar a entrada do valor)
        long numeroGrande = 10000; // 8 bytes
        double salarioDouble = 2000; // 8 bytes
        float salarioFloat = 2500.0f; // 8 bytes
        byte idadeByte = 10; // size 1 byte -128 to 127
        short idadeShort = 10; // 2 bytes
        boolean verdadeiro = true; // 1 bit
        boolean falso = false; // 1 bit
        char caractere = 85;  // 2 bytes; traduz para tabela ASCII; unicode: '\u0041'

        // String (reverece style) (String é uma classe:
        String nome = "Emanuel";


        System.out.println("A idade é " + idade);
        System.out.println("o caractere é: " + caractere);
        System.out.println("Olá, meu nome é: " + nome);

    }
}
