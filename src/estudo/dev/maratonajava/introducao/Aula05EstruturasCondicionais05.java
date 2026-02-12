package estudo.dev.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
// imprima o dia considerando 1 como domingo
// valores que são usados com o swith: int,byte,char,enum,string.
        byte dia = 6;
        switch (dia) {
            case 1:
                System.out.println("dom");
                break;
            case 2:
                System.out.println("seg");
                break;
            case 3:
                System.out.println("ter");
                break;
            case 4:
                System.out.println("qua");
                break;
            case 5:
                System.out.println("qui");
                break;
            case 6:
                System.out.println("sex");
                break;
            case 7:
                System.out.println("sab");
                break;

            default:
                System.out.println("opção invalida");
        }
        char sexo = 'f';
        switch (sexo) {
            case 'm':
                System.out.println("masculino");
                break;
            case 'f':
                System.out.println("feminino");
                break;

            default:
                System.out.println("genero invalido");
        }
    }
}
