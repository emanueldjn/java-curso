package src.maratonajava.introducao;

public class Aula06EstruturasRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for:

        int count = 0;
        while (count < 10) {
            count += 1;
            System.out.println(count);
        } // com o do:
        do {
            System.out.println("Dentro do do-while");
        } while (count < 10);
        // usando o for:

        for (int i = 0; i < 10; i++) {
            System.out.println("For " +i);
        }
    }
}
