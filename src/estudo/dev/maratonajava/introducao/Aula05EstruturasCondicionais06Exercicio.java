package estudo.dev.maratonajava.introducao;

public class Aula05EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        //utilizando swith dados os valores de 1 a 7, imprima se é dia util ou final de semana ]
        //considerando 1 como domingo
        //forma 1
        byte diatil = 1;

        switch (diatil) {
            case 1:
                System.out.println("dom final de semana");
                break;
            case 2:
                System.out.println("dia util");
                break;
            case 3:
                System.out.println("dia util");
                break;
            case 4:
                System.out.println("dia util");
                break;
            case 5:
                System.out.println("dia util");
                break;
            case 6:
                System.out.println("dia util");
                break;
            case 7:
                System.out.println("final de semana ");
                break;

            default:
                System.out.println("dia invalidado");
        }
//forma 2 e mais rapida.

        byte dia = 4;
        switch (dia){
            case 1:
            case 7:
                System.out.println("fds");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("opção invalida");
                break;
        }

    }
}
