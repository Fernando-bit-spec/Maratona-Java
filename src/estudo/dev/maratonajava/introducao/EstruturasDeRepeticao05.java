package estudo.dev.maratonajava.introducao;

public class EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 300000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("parcela " + parcela + " R$ " + valorTotal);
        }
    }
}
