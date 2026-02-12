package estudo.dev.maratonajava.introducao;

public class EstruturasDeRepeticao02Exercicio {
    public static void main(String[] args) {
        //imprima todos os numeros pares de 0 até 100000

       for (int i = 0; i < 10002; i += 2) {
            System.out.println("par " + i);
        }
        
        //uma outra forma de ser feita

        for (int i = 1; i <10000 ; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
            
        }
        
    }
}



