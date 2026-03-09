package estudo.dev.maratonajava.javacore.Aintroducaoclasses.test;

import estudo.dev.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class carroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "toro";
        carro1.modelo = "fiat";
        carro1.ano = 2020;

        carro2.nome = "siena";
        carro2.modelo = "fiat";
        carro2.ano = 2015;

        System.out.println("nome  " + carro1.nome + "\n modelo " +carro1.modelo + "\n ano: " + carro1.ano);
        System.out.println("--------------------------------------");
        System.out.println("nome  " + carro2.nome +  "\n modelo " + carro2.modelo + "\n ano: "+ carro2.ano);

    }
}
