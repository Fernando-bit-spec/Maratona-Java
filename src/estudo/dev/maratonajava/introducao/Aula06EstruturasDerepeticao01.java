package estudo.dev.maratonajava.introducao;

public class Aula06EstruturasDerepeticao01 {
    public static void main(String[] args) {
        //while, do while, for

        int count = 0;
        while (count < 10) {
            System.out.println(++count);

        }
        do {
            System.out.println("dentro do DO while");
        } while (count < 10);

        for (int i = 2; i < 100; i++ ) {
            System.out.println("for" +i);
        }
    }
}
