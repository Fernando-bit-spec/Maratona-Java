package estudo.dev.maratonajava.introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {

        //dado um determinado salario anual imprima qual valor que eu tenho que pagar de acordo com a taxes netherlands 2020
        //£ 0 £34,712 9.70%
        //£ 34,713 £ 68,507 37.35%
        //£ 68,508 48.58%
        double salarioAnual = 6850;
        double desconto1 = 9.70;
        double desconto2 = 37.35;
        double desconto3 = 48.58;

        double resultado = (salarioAnual * desconto1) / 100;
        double resultado2 = (salarioAnual * desconto2) / 100;
        double resultado3 = (salarioAnual * desconto3) / 100;


        if (salarioAnual <= 34712) {
            System.out.println("desconto de " + resultado);
        } else if (salarioAnual >= 34712 && salarioAnual == 68507) {
            System.out.println("desconto de " + resultado2);
        } else {
            System.out.println("desconto de " + resultado3);
        }

    }
}