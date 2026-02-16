package estudo.dev.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // dado um numero de 0 a 50 imprima os primeiros 25 numeros
        int valormax = 50;
        for (int i = 0; i <= valormax; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
