package estudo.dev.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //doar se salario > 5000
        double salario = 6000;

        String mensagemDoar = "vou doar 500";
        String mensagemNaodoar = "ainda ão vou doar";
        //(condição) ? verdadeiro  : falso
        //String resultado = (condição) ? verdadeiro : falso;

        String resultado = salario > 5000 ? mensagemDoar: mensagemNaodoar;


        System.out.println(resultado);
    }
}
