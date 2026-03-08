package estudo.dev.maratonajava.introducao;

import java.util.Scanner;

public class interação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("sua idade é  "+idade);

        scanner.close();
    }
}
