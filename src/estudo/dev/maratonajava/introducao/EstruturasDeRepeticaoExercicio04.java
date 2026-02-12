package estudo.dev.maratonajava.introducao;

public class EstruturasDeRepeticaoExercicio04 {
    public static void main(String[] args) {
        //dado um valor de um carro, descubra em quantas ele pode  ser parcelado
        //condição é que o valorParcela >= 1000

        double valorTotal = 30000;

        for (int Parcela = 1; Parcela <= valorTotal; Parcela++) {
            double valorParcela = valorTotal / Parcela;

            if (valorParcela >= 1000){
                System.out.println("Parcela  " + Parcela+ "R$ " +valorParcela);
            }else {
                break;
            }
            System.out.println("fora do if mas dentro do for " +Parcela);
        }


    }
}
