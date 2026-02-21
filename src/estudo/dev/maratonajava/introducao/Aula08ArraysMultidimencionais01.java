package estudo.dev.maratonajava.introducao;

public class Aula08ArraysMultidimencionais01 {
    public static void main(String[] args) {
        //1,2,3,4,5 meses
        //31,27,31,30 dias

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][0] = 27;
        dias[0][0] = 31;

        dias[1][0] = 31;
        dias[1][1] = 21;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

    }
}
