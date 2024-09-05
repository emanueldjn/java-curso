package src.maratonajava.introducao;

// Crie Variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
// Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Emanuel";
        String endereco = "Tucuman 766 Buenos Aires - ARG";
        double salario = 3500.00;
        String dataRecebimentoSalario = "05/09/2024.";
        // String relatorio = "....";


        // atalho para System = sout
        System.out.println("Eu " + nome + " morando no endereço " + endereco + ", confirmo que recebi o salário " +
                salario + ", na data " + dataRecebimentoSalario); // relatorio

    }
}
