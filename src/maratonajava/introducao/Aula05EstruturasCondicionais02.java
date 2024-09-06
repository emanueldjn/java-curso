package src.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade menor (<) 15 categoria infantil
        // idade maior = (>=) 15 && menor (<) 18 juvenil
        // idade maior ou igual (>=) 18 adulto

        int idade = 17;
        if (idade < 15) {
            System.out.println("Categoria infantil");
        } else if (idade >= 15 && idade <18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria adulto");
        }
    }
}
