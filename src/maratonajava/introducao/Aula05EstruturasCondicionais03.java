package src.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salario for > 5000
        // operador ternario
        // (codição) ? verdadeiro : falso;

        double salario = 6000;
        String mensagemDoar = "vou doar 500 reais para caridade";
        String naoDoar = "Ainda nao tenho condicoes, mas vou ter!";
        String resultado = salario > 5000 ? mensagemDoar : naoDoar;

        System.out.println(resultado);




    }
}
